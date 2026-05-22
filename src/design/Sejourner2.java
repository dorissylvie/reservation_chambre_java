/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package design;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Sejourner2 extends javax.swing.JPanel {

    private Solde solde;
    private ArrayList<JCheckBox> chBx = new ArrayList<JCheckBox>();
    private String nums;

    public Sejourner2(Solde solde) {
        this.solde = solde;
        initComponents();
        txtid.setVisible(false);
        montantSe.setVisible(false);
        Fetch();
    }

    PreparedStatement req;
    ResultSet res;

    @SuppressWarnings("empty-statement")

    private void Fetch() {
        try {
            int c;
            req = Connexion.connBD().prepareStatement("SELECT * FROM sejourner order by idsej ASC");
            res = req.executeQuery();
            ResultSetMetaData rs = res.getMetaData();
            c = rs.getColumnCount();

            DefaultTableModel df = (DefaultTableModel) tableauSej.getModel();
            df.setRowCount(0);
            while (res.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= c; i++) {
                    v.add(res.getString("idsej"));
                    v.add(res.getString("numchambre"));
                    v.add(res.getString("dateentreesejour"));
                    v.add(res.getString("nbrjours"));
                    v.add(res.getString("nomclient"));
                    v.add(res.getString("telephone"));
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sejourner2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void pdfloader() {
        Document doc = new Document();
        Rectangle rect = new Rectangle(PageSize.B5);
        doc.setPageSize(rect);
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("Reçu Chambre.pdf"));

            req = Connexion.connBD().prepareStatement("SELECT * FROM sejourner order by dateentreesejour DESC limit 1");

            res = req.executeQuery();
            if (res.next()) {
                doc.open();
                Paragraph paragraph = new Paragraph();
                paragraph.add("Merci de votre confiance!\n \n");
                paragraph.add("Voici votre reçu:\n\n");
                paragraph.add("Séjour N°:");
                paragraph.add(res.getString(1).concat("\n\n"));
                paragraph.add("Chambre N°: ");
                paragraph.add(res.getString(2).concat("\n\n"));
                paragraph.add("Nom du Client : ");
                paragraph.add(res.getString(5).concat("\n\n"));
                paragraph.add("Durée du Séjour : ");
                paragraph.add(res.getString(4).concat("\n\n"));
                paragraph.add("Date Entrée :");
                paragraph.add(res.getString(3).concat("\n\n"));

                int nb = res.getInt(4);
                Calendar cal = Calendar.getInstance();
                cal.setTime(res.getDate(3));
                cal.add(Calendar.DATE, nb);
                java.util.Date d = cal.getTime();
                java.sql.Date dateSortie = new java.sql.Date(d.getTime());

                paragraph.add("Date Sortie :");
                paragraph.add(dateSortie.toString().concat("\n\n"));

                doc.add(paragraph);
                doc.close();
                JOptionPane.showMessageDialog(this, "Impression effectuée");
            } else {
                JOptionPane.showMessageDialog(this, "Impression echouée");
            }
        } catch (DocumentException | FileNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(Sejourner2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selectionnerSej(int i) {

        try {
            TableModel model = (TableModel) tableauSej.getModel();

            txtid.setValue(Integer.parseInt(model.getValueAt(i, 0).toString()));
            txtnumchambre.setText(model.getValueAt(i, 1).toString());
            txtnbrjour.setValue(Integer.parseInt(model.getValueAt(i, 3).toString()));
            txtnomcli.setText(model.getValueAt(i, 4).toString());
            txttel.setText(model.getValueAt(i, 5).toString());

            PreparedStatement stmt = Connexion.connBD().prepareStatement("SELECT * FROM sejourner where idsej = ?");
            stmt.setInt(1, Integer.parseInt(model.getValueAt(i, 0).toString()));
            ResultSet res = stmt.executeQuery();
            while (res.next()) {

                String numchambre = res.getString("numchambre");
                int nbrjour = res.getInt("nbrjours");

                int solde = 0;
                String[] nums = numchambre.split(",");
                for (String num : nums) {
                    stmt = Connexion.connBD().prepareStatement(" SELECT  * from chambre where numchambre = ? ");
                    stmt.setString(1, num);

                    res = stmt.executeQuery();
                    while (res.next()) {
                        solde += (nbrjour * res.getInt("prixnuite"));
                    }
                }

                montantSe.setValue((-1) * solde);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void effacerChamps() {
        txtnumchambre.setText("");
        txtnbrjour.resetKeyboardActions();
        txtnumchambre.setText("");
        txtnumchambre.setText("");

    }

    public boolean verificationChambre(String numChambre, java.sql.Date dateEntree, int nbrJours) {
        
        PreparedStatement stmt;
        ResultSet resultat;

        Calendar calAVerifier = Calendar.getInstance();
        calAVerifier.setTime(dateEntree);
        calAVerifier.add(Calendar.DATE, nbrJours - 1);
        Date ds = calAVerifier.getTime();
        
        java.sql.Date dateSortie = new java.sql.Date(ds.getTime());
        
        String[] nums = numChambre.split(",");

        ArrayList<String> chambreNonLibre = new ArrayList<String>();

        for (String num : nums){
            try {
                // reserver 
                stmt = Connexion.connBD().prepareStatement("SELECT * from reserver where numchambre like '%" + num + "%' ");

                resultat = stmt.executeQuery();

                while (resultat.next()){

                    java.sql.Date dateEntreeOccuper = resultat.getDate("dateentree");
                    int nbrjoursOccuper = resultat.getInt("nbrjours");

                    Calendar cal = Calendar.getInstance();
                    cal.setTime(dateEntreeOccuper);
                    cal.add(Calendar.DATE, nbrjoursOccuper - 1);
                    Date dSOcc = cal.getTime();
                    
                    java.sql.Date dateSortieOccuper = new java.sql.Date(dSOcc.getTime());
                    

                    java.sql.Date in = dateMaxInitial(dateEntree, dateEntreeOccuper);
                    java.sql.Date fin= dateMinFinal(dateSortie, dateSortieOccuper);
                    
                    java.time.LocalDate initiale = in.toLocalDate();
                    java.time.LocalDate finale = fin.toLocalDate();
                    
                    long r = ChronoUnit.DAYS.between(initiale,finale);
                  
                     System.out.println("Date initiale"+ initiale +" \n date finale "+ finale + " \n "+ num +" dd res  : "+r);
                    if (r >= 0) {
                        chambreNonLibre.add(num);
                    }
                }

                // sejourner
                stmt = Connexion.connBD().prepareStatement("SELECT * from sejourner where numchambre like '%" + num + "%' ");
                resultat = stmt.executeQuery();

                while (resultat.next()) {
                    System.out.println();

                    java.sql.Date dateEntreeOccuper = resultat.getDate("dateentreesejour");
                    int nbrjoursOccuper = resultat.getInt("nbrjours");

                    Calendar cal = Calendar.getInstance();
                    cal.setTime(dateEntreeOccuper);
                    cal.add(Calendar.DATE, nbrjoursOccuper - 1);
                    Date dSOcc = cal.getTime();
                    java.sql.Date dateSortieOccuper = new java.sql.Date(dSOcc.getTime());                
                    
                    java.sql.Date in = dateMaxInitial(dateEntree, dateEntreeOccuper);
                    java.sql.Date fin= dateMinFinal(dateSortie, dateSortieOccuper);
                    
                    java.time.LocalDate initiale = in.toLocalDate();
                    java.time.LocalDate finale = fin.toLocalDate();
                    
                    long r = java.time.temporal.ChronoUnit.DAYS.between(initiale,finale);
                                      
                    System.out.println(num + " dd sej  : "+r + "   Date initiale"+ initiale +" \n date finale "+ finale + " \n "+ num +" dd res  : "+r);

                    System.out.println();
                    if (r >= 0){
                        chambreNonLibre.add(num);
                    }
                }

            } catch (Exception e) {
                System.out.println();
            }
        }
        Set<String> set = new LinkedHashSet<String>();
        set.addAll(chambreNonLibre);
        chambreNonLibre.clear();
        chambreNonLibre.addAll(set);

        if (chambreNonLibre.size() != 0) {
            JOptionPane.showMessageDialog(this, "Les chambres numero   " + String.join(",", chambreNonLibre) + " sont déjà occupées  ");
            return false;
        } else {
            return true;
        }

    }

    private java.sql.Date dateMaxInitial(java.sql.Date date1,java.sql.Date date2) {
        java.sql.Date max = date1;
        if (max.compareTo(date2) <= 0) {
            max = date2;
        }
        return max;
    }

    private java.sql.Date dateMinFinal(java.sql.Date date1, java.sql.Date date2) {
        java.sql.Date min = date1;
        if (min.compareTo(date2) >= 0) {
            min = date2;
        }
        return min;
    }

    public void ajouterSejour(String numchambre, int nbrjour, String nomcli, String tel) {
        try {

            int conf = JOptionPane.showConfirmDialog(null, " Voulez-vous vraiment ajouter cette réservation ?");

            if (conf == JOptionPane.YES_OPTION) {

                req = Connexion.connBD().prepareStatement("INSERT INTO sejourner (numchambre,dateentreesejour,nbrjours,nomclient,telephone) VALUES(?,current_date,?,?,?)");
                req.setString(1, numchambre);
                req.setInt(2, nbrjour);
                req.setString(3, nomcli);
                req.setString(4, tel);
                int ver = req.executeUpdate();

                int solde = 0;
                String[] nums = numchambre.split(",");
                for (String num : nums) {
                    req = Connexion.connBD().prepareStatement(" SELECT  * from chambre where numchambre = ? ");
                    req.setString(1, num);

                    res = req.executeQuery();
                    while (res.next()) {
                        solde += (nbrjour * res.getInt("prixnuite"));
                    }
                }

                if (ver == 1) {
                    Fetch();
                    updateSolde(solde);
                    JOptionPane.showMessageDialog(this, "Ajout Réussi");


                } else {
                    JOptionPane.showMessageDialog(this, "Ajout echoué");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sejourner2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modifierSejour(String numchambre, int nbrjour, String nomcli, String tel, int idsej, int solde) {
        try {
            int conf = JOptionPane.showConfirmDialog(null, " Voulez-vous vraiment modifier cette réservation ?");

            if (conf == JOptionPane.YES_OPTION) {

                // modification de la table solde 
                updateSolde(solde);

                req = Connexion.connBD().prepareStatement("UPDATE sejourner SET numchambre=?,nbrjours=?,nomclient=?,telephone=? WHERE idsej=?");
                req.setString(1, numchambre);
                req.setInt(2, nbrjour);
                req.setString(3, nomcli);
                req.setString(4, tel);
                req.setInt(5, idsej);
                int ver = req.executeUpdate();

                int nouvSolde = 0;
                String[] nums = numchambre.split(",");
                for (String num : nums) {
                    req = Connexion.connBD().prepareStatement(" SELECT  * from chambre where numchambre = ? ");
                    req.setString(1, num);

                    res = req.executeQuery();
                    while (res.next()) {
                        nouvSolde += (nbrjour * res.getInt("prixnuite"));
                    }
                }

                if (ver > 0) {
                    updateSolde(nouvSolde);
                    
                    JOptionPane.showMessageDialog(this, "Modification réussie");
                  
                    Fetch();
                    pdfloader();

                } else {
                    JOptionPane.showMessageDialog(this, "Modification echouée");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Sejourner2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void supprimerSejour(int idsej, int solde) {
        try {
            // TODO add your handling code here:

            if (idsej > 0) {

                int conf = JOptionPane.showConfirmDialog(null, " Voulez-vous vraiment supprimer cette réservation ?");

                if (conf == JOptionPane.YES_OPTION) {

                    updateSolde(solde);
                    req = Connexion.connBD().prepareStatement("DELETE FROM sejourner WHERE idsej=?");
                    req.setInt(1, idsej);

                    int v = req.executeUpdate();
                    if (v > 0) {
                        JOptionPane.showMessageDialog(this, "Suppression réussie");
                        effacerChamps();
                    } else {
                        JOptionPane.showMessageDialog(this, "Suppression echouée");
                    }

                    Fetch();
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Sejourner2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JCheckBox addCheckBox(String text, JPanel pan) {
        JCheckBox newCB = new JCheckBox(text);
        newCB.setSize(100, 60);
        newCB.setBackground(Color.gray);
        newCB.setVisible(true);
        pan.add(newCB);

        return newCB;
    }

    public void updateSolde(int montant) {
        PreparedStatement stmt;
        try {
            stmt = Connexion.connBD().prepareStatement("INSERT INTO solde (solde) VALUES (?)");
            stmt.setInt(1, montant);
            stmt.executeUpdate();
            solde.afficherSolde();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableauSej = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnumchambre = new javax.swing.JTextField();
        txtnomcli = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        btnAjout = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupp = new javax.swing.JButton();
        btnRecu = new javax.swing.JButton();
        txtnbrjour = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        boutonChoisirRF = new javax.swing.JButton();
        btnAjout1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtid = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        montantSe = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1230, 880));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableauSej.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idSejour", "numChambre", "dateEntreeSejour", "nbrJour", "nomClient", "telephone"
            }
        ));
        tableauSej.setRowHeight(40);
        tableauSej.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauSejMouseClicked(evt);
            }
        });
        tableauSej.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableauSejComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tableauSej);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(410, 730));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 45, 76));
        jLabel1.setText("Formulaire pour enregister les séjours");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(3, 45, 76));
        jLabel2.setText("N° Chambre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(3, 45, 76));
        jLabel4.setText("Nombre de Jours:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(3, 45, 76));
        jLabel5.setText("Nom du Client:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(3, 45, 76));
        jLabel6.setText("Obtenir le reçu :");

        txtnumchambre.setPreferredSize(new java.awt.Dimension(250, 22));

        txtnomcli.setPreferredSize(new java.awt.Dimension(250, 22));
        txtnomcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomcliActionPerformed(evt);
            }
        });

        txttel.setPreferredSize(new java.awt.Dimension(250, 22));
        txttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelActionPerformed(evt);
            }
        });

        btnAjout.setBackground(new java.awt.Color(10, 73, 105));
        btnAjout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/ajouter.png"))); // NOI18N
        btnAjout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutActionPerformed(evt);
            }
        });

        btnModifier.setBackground(new java.awt.Color(10, 73, 105));
        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/modifier.png"))); // NOI18N
        btnModifier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupp.setBackground(new java.awt.Color(10, 73, 105));
        btnSupp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/supprimer.png"))); // NOI18N
        btnSupp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppActionPerformed(evt);
            }
        });

        btnRecu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRecu.setText("Obtenir");
        btnRecu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuActionPerformed(evt);
            }
        });

        txtnbrjour.setPreferredSize(new java.awt.Dimension(250, 22));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(3, 45, 76));
        jLabel7.setText("Téléphone:");

        boutonChoisirRF.setText("Choisir");
        boutonChoisirRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonChoisirRFActionPerformed(evt);
            }
        });

        btnAjout1.setBackground(new java.awt.Color(10, 73, 105));
        btnAjout1.setForeground(new java.awt.Color(255, 255, 255));
        btnAjout1.setText("Effacer");
        btnAjout1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAjout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRecu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAjout1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnbrjour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnomcli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnumchambre, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(boutonChoisirRF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutonChoisirRF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtnbrjour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(txtnomcli, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAjout1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRecu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 410, 660));

        jPanel3.setBackground(new java.awt.Color(3, 45, 76));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/supprimer.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1178, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 40));

        jPanel4.setBackground(new java.awt.Color(10, 73, 105));

        txtid.setPreferredSize(new java.awt.Dimension(250, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/sejourner.png"))); // NOI18N
        jLabel3.setText("SEJOUR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(montantSe))
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(montantSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1230, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void tableauSejComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableauSejComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tableauSejComponentShown


    private void btnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutActionPerformed

        // TODO add your handling code here:
        String numchambre = txtnumchambre.getText();
        int nbrjour = (int) txtnbrjour.getValue();
        String nomcli = txtnomcli.getText();
        String tel = txttel.getText();

        if (!numchambre.isBlank() && nbrjour > 0 && !nomcli.isBlank() && !tel.isBlank()) {

            java.sql.Date dateEntree = new java.sql.Date(new Date().getTime());
            
            System.out.println(dateEntree);
            if (verificationChambre(numchambre,dateEntree, nbrjour) == true) {
                
                ajouterSejour(numchambre, nbrjour, nomcli, tel);

            }

        };


    }//GEN-LAST:event_btnAjoutActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed

        // TODO add your handling code here:
        int solde = (int) montantSe.getValue();

        String numchambre = txtnumchambre.getText();
        int nbrjour = (int) txtnbrjour.getValue();
        String nomcli = txtnomcli.getText();
        String tel = txttel.getText();
        int idsej = (int) txtid.getValue();

        if (!numchambre.isBlank() && nbrjour > 0 && !nomcli.isBlank() && !nomcli.isBlank() && !tel.isBlank() && idsej > 0) {

            java.sql.Date dateEntree = new java.sql.Date(new java.util.Date().getTime());
           
                modifierSejour(numchambre, nbrjour, nomcli, tel, idsej, solde);

           
        }


    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnRecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuActionPerformed
        // TODO add your handling code here:

        try {
            JOptionPane.showConfirmDialog(this, "Voulez-vous générer un reçu?");
            pdfloader();
        } catch (HeadlessException e) {
        }
    }//GEN-LAST:event_btnRecuActionPerformed

    private void btnSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppActionPerformed

        int idsej = (int) txtid.getValue();
        int solde = (int) montantSe.getValue();

        supprimerSejour(idsej, solde);

    }//GEN-LAST:event_btnSuppActionPerformed

    private void txtnomcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomcliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomcliActionPerformed

    private void txttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelActionPerformed

    private void tableauSejMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauSejMouseClicked
        try {
            int i = tableauSej.getSelectedRow();

            selectionnerSej(i);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la  séléction", "message", HEIGHT);
        }


    }//GEN-LAST:event_tableauSejMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void boutonChoisirRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonChoisirRFActionPerformed
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        txtnumchambre.setText("");
        String req = "SELECT numchambre from chambre order by numchambre ASC ";
        try {
            Statement stmt = Connexion.connBD().createStatement();
            ResultSet resultat = stmt.executeQuery(req);

            while (resultat.next()) {
                this.chBx.add(addCheckBox(resultat.getString("numchambre"), panel));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        int option = JOptionPane.showOptionDialog(null, panel, "Liste des Chambres ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        if (option == JOptionPane.OK_OPTION) {

            ArrayList<String> numChambre = new ArrayList<String>();
            for (JCheckBox chambre : this.chBx) {
                if (chambre.isSelected()) {
                    numChambre.add(chambre.getText());
                }
            }

            this.nums = String.join(",", numChambre);

            txtnumchambre.setText(this.nums);

        }


    }//GEN-LAST:event_boutonChoisirRFActionPerformed

    private void btnAjout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjout1ActionPerformed
        effacerChamps();
       
    }//GEN-LAST:event_btnAjout1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonChoisirRF;
    private javax.swing.JButton btnAjout;
    private javax.swing.JButton btnAjout1;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRecu;
    private javax.swing.JButton btnSupp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner montantSe;
    private javax.swing.JTable tableauSej;
    private javax.swing.JSpinner txtid;
    private javax.swing.JSpinner txtnbrjour;
    private javax.swing.JTextField txtnomcli;
    private javax.swing.JTextField txtnumchambre;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
