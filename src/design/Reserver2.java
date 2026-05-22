/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package design;

import com.itextpdf.text.log.Logger;
import java.awt.Color;
import java.lang.System.Logger.Level;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.sql.Statement;

public class Reserver2 extends javax.swing.JPanel {
    private Solde so;
    private Occuper occuper;
    private ArrayList<JCheckBox> chBx = new ArrayList<JCheckBox>();
    private String nums;
    
    public Reserver2(Occuper occuper) {
        this.occuper = occuper;
//        occuper.afficherListe();
        initComponents();
        afficherReservation();
        idReservRF.setVisible(false);

    }

    public void afficherReservation() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Reservation");
        model.addColumn("Numero Chambre");
        model.addColumn("Date Reservation");
        model.addColumn("Date Entree");
        model.addColumn("Nombre de jours");
        model.addColumn("Nom Client");
        model.addColumn("Mail Client");

        model.setRowCount(0);

        String req = "SELECT * from reserver order by idreserv ASC ";
        try {
            Statement stmt = Connexion.connBD().createStatement();
            ResultSet resultat = stmt.executeQuery(req);
            while (resultat.next()) {
                model.addRow(new Object[]{resultat.getInt("idreserv"), resultat.getString("numchambre"),
                    resultat.getDate("datereserv"), resultat.getDate("dateentree"), resultat.getInt("nbrjours"), resultat.getString("nomclient"),
                    resultat.getString("mailclient")});
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        tableauReserv.setModel(model);
    }

    public void effacerChamps() {
        numChambreRF.setText("");
        dateEntreeRF.setDate(new Date());
        nbrJoursRF.setValue(0);
        nomClientRF.setText("");
        mailClientRF.setText("");

    }

    public void selectionnerReserv(int i) {

        try {
            TableModel model = tableauReserv.getModel();

            String sdate = model.getValueAt(i, 3).toString();
            java.util.Date dateEntrU = new SimpleDateFormat("yyyy-MM-dd").parse(sdate);

            idReservRF.setValue(model.getValueAt(i, 0));
            numChambreRF.setText(model.getValueAt(i, 1).toString());
            dateEntreeRF.setDate(dateEntrU);
            nbrJoursRF.setValue(model.getValueAt(i, 4));
            nomClientRF.setText(model.getValueAt(i, 5).toString());
            mailClientRF.setText(model.getValueAt(i, 6).toString());

        } catch (Exception e) {
            
            System.out.println(e);
        }

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
        
  
    private void envoyerMail(){
         String email = mailClientRF.getText();

        // Expression régulière pour la validation de l'adresse email
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        // Validation de l'adresse email
        boolean isValid = Pattern.matches(regex, email);

        // Changement de couleur du JTextField en fonction de la validation
        if (isValid) {
            mailClientRF.setBackground(Color.LIGHT_GRAY);
        } else {
            JOptionPane.showConfirmDialog(this, "Email invalide, veuillez reessayer!", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
        }

        // Informations de configuration pour votre compte email
        String host = "smtp.gmail.com";
        String port = "587";
        String username = "yourExam00@gmail.com";
        String password = "rwmrnsrfdxdizrww";

        // Informations sur le destinataire et le contenu de l'email
        String subject = "Reservation de chambre ";
        
        int nb = (int)nbrJoursRF.getValue();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateEntreeRF.getDate());
        cal.add(Calendar.DATE, nb );
        Date d = cal.getTime(); 
        java.sql.Date  dateSortie =new java.sql.Date(d.getTime());

        String body = " Numero des Chambres : "+ numChambreRF.getText() +"\n Date d' entrée : "+ dateEntreeRF.getDate() + "\n  Date de sortie : " + dateSortie + " \n Nombre de jours :" + nb +" " ;

        // Configuration des propriétés pour la connexion SSL/TLS
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        // Création d'une session avec l'authentification
        Session session;
        session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Création du message email
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject(subject);
            message.setText(body);

            // Envoi du message
            Transport.send(message);

            JOptionPane.showConfirmDialog(this, "Votre email a ete bien envoyer!", "Message de succes", JOptionPane.CLOSED_OPTION);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Erreur, veuillez reessayer!\n" + e, "Message d'erreur", JOptionPane.ERROR_MESSAGE);
           
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReservationForm = new javax.swing.JPanel();
        numChambreLabelRF = new javax.swing.JLabel();
        dateEntreeLabelRF = new javax.swing.JLabel();
        nbrJoursLabelRF = new javax.swing.JLabel();
        nomClientLabelRF = new javax.swing.JLabel();
        mailClientLabelRF = new javax.swing.JLabel();
        numChambreRF = new javax.swing.JTextField();
        nomClientRF = new javax.swing.JTextField();
        mailClientRF = new javax.swing.JTextField();
        boutonAjouterRF = new javax.swing.JButton();
        titreRF = new javax.swing.JLabel();
        dateEntreeRF = new com.toedter.calendar.JDateChooser();
        nbrJoursRF = new javax.swing.JSpinner();
        boutonModifierRF = new javax.swing.JButton();
        boutonChoisirRF = new javax.swing.JButton();
        boutonSupprimerRF = new javax.swing.JButton();
        boutonAjouterRF1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableauReserv = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        idReservRF = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1230, 880));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReservationForm.setBackground(new java.awt.Color(255, 255, 255));
        ReservationForm.setPreferredSize(new java.awt.Dimension(410, 730));

        numChambreLabelRF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numChambreLabelRF.setForeground(new java.awt.Color(10, 73, 105));
        numChambreLabelRF.setText("Numéro des Chambres ");

        dateEntreeLabelRF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateEntreeLabelRF.setForeground(new java.awt.Color(10, 73, 105));
        dateEntreeLabelRF.setText("Date d' Entrée ");

        nbrJoursLabelRF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nbrJoursLabelRF.setForeground(new java.awt.Color(10, 73, 105));
        nbrJoursLabelRF.setText("Nombre de jours");

        nomClientLabelRF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomClientLabelRF.setForeground(new java.awt.Color(10, 73, 105));
        nomClientLabelRF.setText("Nom du Client");

        mailClientLabelRF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mailClientLabelRF.setForeground(new java.awt.Color(10, 73, 105));
        mailClientLabelRF.setText("Adresse mail du Client");

        numChambreRF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        numChambreRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numChambreRFActionPerformed(evt);
            }
        });

        nomClientRF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nomClientRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomClientRFActionPerformed(evt);
            }
        });

        mailClientRF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mailClientRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailClientRFActionPerformed(evt);
            }
        });

        boutonAjouterRF.setBackground(new java.awt.Color(10, 73, 105));
        boutonAjouterRF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/ajouter.png"))); // NOI18N
        boutonAjouterRF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boutonAjouterRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterRFActionPerformed(evt);
            }
        });

        titreRF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titreRF.setForeground(new java.awt.Color(10, 73, 105));
        titreRF.setText("Formulaire pour enregistrer les reservations");

        boutonModifierRF.setBackground(new java.awt.Color(10, 73, 105));
        boutonModifierRF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/modifier.png"))); // NOI18N
        boutonModifierRF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boutonModifierRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonModifierRFActionPerformed(evt);
            }
        });

        boutonChoisirRF.setText("Choisir");
        boutonChoisirRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonChoisirRFActionPerformed(evt);
            }
        });

        boutonSupprimerRF.setBackground(new java.awt.Color(10, 73, 105));
        boutonSupprimerRF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/supprimer.png"))); // NOI18N
        boutonSupprimerRF.setBorder(null);
        boutonSupprimerRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSupprimerRFActionPerformed(evt);
            }
        });

        boutonAjouterRF1.setBackground(new java.awt.Color(10, 73, 105));
        boutonAjouterRF1.setForeground(new java.awt.Color(255, 255, 255));
        boutonAjouterRF1.setText("Effacer");
        boutonAjouterRF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boutonAjouterRF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterRF1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReservationFormLayout = new javax.swing.GroupLayout(ReservationForm);
        ReservationForm.setLayout(ReservationFormLayout);
        ReservationFormLayout.setHorizontalGroup(
            ReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationFormLayout.createSequentialGroup()
                        .addComponent(dateEntreeLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationFormLayout.createSequentialGroup()
                        .addComponent(nomClientLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
            .addGroup(ReservationFormLayout.createSequentialGroup()
                .addGroup(ReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservationFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReservationFormLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(numChambreRF, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boutonChoisirRF))
                            .addGroup(ReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mailClientRF, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateEntreeRF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nbrJoursRF)
                                .addComponent(nomClientRF)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationFormLayout.createSequentialGroup()
                                    .addComponent(boutonAjouterRF1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boutonAjouterRF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(boutonModifierRF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(boutonSupprimerRF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ReservationFormLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(nbrJoursLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReservationFormLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(mailClientLabelRF))
                    .addGroup(ReservationFormLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(numChambreLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReservationFormLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(titreRF)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        ReservationFormLayout.setVerticalGroup(
            ReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservationFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titreRF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(numChambreLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonChoisirRF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numChambreRF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateEntreeLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(dateEntreeRF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbrJoursLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbrJoursRF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(nomClientLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(nomClientRF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(mailClientLabelRF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(mailClientRF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(ReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boutonSupprimerRF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutonAjouterRF, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(boutonModifierRF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boutonAjouterRF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        add(ReservationForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 420, 660));

        tableauReserv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableauReserv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idSejour", "Numéro des Chambres", "Date d'entrée", "Nombre de Jours", "Nom du Client", "Téléphone "
            }
        ));
        tableauReserv.setFocusable(false);
        tableauReserv.setMinimumSize(new java.awt.Dimension(50, 320));
        tableauReserv.setRowHeight(40);
        tableauReserv.setShowGrid(false);
        tableauReserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauReservMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableauReserv);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, 640));

        jPanel2.setBackground(new java.awt.Color(3, 45, 76));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/supprimer.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1181, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1284, -1));

        jPanel3.setBackground(new java.awt.Color(10, 73, 105));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/reserver.png"))); // NOI18N
        jLabel1.setText("RESERVATION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(449, 449, 449)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idReservRF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(idReservRF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1284, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void numChambreRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numChambreRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numChambreRFActionPerformed

    private void nomClientRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomClientRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomClientRFActionPerformed

    private void mailClientRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailClientRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailClientRFActionPerformed

    private void boutonAjouterRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjouterRFActionPerformed
        // TODO add your handling code here:

        String numChambre = numChambreRF.getText();
        java.util.Date dE = dateEntreeRF.getDate(); 
        int nbrJours = (int) nbrJoursRF.getValue();
        String nomClient = nomClientRF.getText();
        String mailClient = mailClientRF.getText();
        
        if(!numChambre.isBlank() && dE != null && nbrJours > 0 && !nomClient.isBlank() && !mailClient.isBlank() ){
            java.sql.Date dateEntree = new java.sql.Date(dE.getTime());
            java.sql.Date dateActuelle = new java.sql.Date(new Date().getTime()); 
    

            java.time.LocalDate de = dateEntree.toLocalDate();
            java.time.LocalDate da = dateActuelle.toLocalDate();

            long r = java.time.temporal.ChronoUnit.DAYS.between(de,da);
            
            if(r <= 0 ){
                if (verificationChambre(numChambre, dateEntree, nbrJours) == true ){
                 
                    java.sql.Date dateReservation = new java.sql.Date(new Date().getTime());
                    Reserver Reservation = new Reserver(numChambre, dateReservation, dateEntree, nbrJours, nomClient, mailClient);
                    Reservation.ajouterReservation();
                    envoyerMail();
                    afficherReservation();
                       
                } 
                
            }
            
             else JOptionPane.showMessageDialog(this, "Veuillez entrer une date qui n'est pas encore dépassée ! ");            
        }
        
        else JOptionPane.showMessageDialog(this, " Erreur lors de la saisie des champs \n Veuillez vérifier ! ");

   
    }//GEN-LAST:event_boutonAjouterRFActionPerformed

    private void boutonSupprimerRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonSupprimerRFActionPerformed
        int id = (int) idReservRF.getValue();
        
        if(id > 0 ){
            Reserver Reservation = new Reserver();
            Reservation.supprimerReservation(id);
            afficherReservation();
            effacerChamps(); 
          
        }
        
        else JOptionPane.showMessageDialog(this, " Erreur d'identifiant ");
      
    }//GEN-LAST:event_boutonSupprimerRFActionPerformed

    private void boutonModifierRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonModifierRFActionPerformed
      
            String numChambre = numChambreRF.getText();
            java.util.Date dE = dateEntreeRF.getDate(); 
            int nbrJours = (int) nbrJoursRF.getValue();
            String nomClient = nomClientRF.getText();
            String mailClient = mailClientRF.getText();
            
            if(!numChambre.isBlank() && dE != null && nbrJours > 0 && !nomClient.isBlank() && !mailClient.isBlank() ){
                java.sql.Date dateEntree = new java.sql.Date(dE.getTime());

                java.sql.Date dateActuelle = new java.sql.Date(new Date().getTime()); 


                java.time.LocalDate de = dateEntree.toLocalDate();
                java.time.LocalDate da = dateActuelle.toLocalDate();

                long r = java.time.temporal.ChronoUnit.DAYS.between(de,da);
                
                if(r<=0){
                    
                  
                        java.sql.Date dateReservation = new java.sql.Date(new Date().getTime());

                        Reserver Reservation = new Reserver(numChambre, dateReservation, dateEntree, nbrJours, nomClient, mailClient);
                        Reservation.modifierReservation((int)idReservRF.getValue());
                        afficherReservation();
                        envoyerMail();
                        effacerChamps();
                        
                   
                  
                }
                else JOptionPane.showMessageDialog(this, "Veuillez entrer une date qui n'est pas encore dépassée ! ");
            }
            
            else JOptionPane.showMessageDialog(this, " Erreur lors de la saisie des champs \n Veuillez vérifier ! "); 

    
    }//GEN-LAST:event_boutonModifierRFActionPerformed

    private void boutonChoisirRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonChoisirRFActionPerformed
       
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        numChambreRF.setText("");
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
        
        int option = JOptionPane.showOptionDialog(null, panel, "Liste des Chambres ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
        if(option == JOptionPane.OK_OPTION){
            
             ArrayList<String> numChambre = new ArrayList<String>();
            for (JCheckBox chambre : this.chBx) {
                if (chambre.isSelected()) {
                    numChambre.add(chambre.getText());
                }
            }

            this.nums = String.join(",", numChambre);

             numChambreRF.setText(nums);
            
        }

    }//GEN-LAST:event_boutonChoisirRFActionPerformed


    private void tableauReservMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauReservMouseClicked
        try {
            int i = tableauReserv.getSelectedRow();
            selectionnerReserv(i);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la séléction");
        }
    }//GEN-LAST:event_tableauReservMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
                System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void boutonAjouterRF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjouterRF1ActionPerformed
        effacerChamps();
    }//GEN-LAST:event_boutonAjouterRF1ActionPerformed

      
    public JCheckBox addCheckBox(String text, JPanel pan) {
        JCheckBox newCB = new JCheckBox(text);
        newCB.setSize(100, 60);
        newCB.setBackground(Color.gray);
        newCB.setVisible(true);
        pan.add(newCB);

        return newCB;

    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ReservationForm;
    private javax.swing.JButton boutonAjouterRF;
    private javax.swing.JButton boutonAjouterRF1;
    private javax.swing.JButton boutonChoisirRF;
    private javax.swing.JButton boutonModifierRF;
    private javax.swing.JButton boutonSupprimerRF;
    private javax.swing.JLabel dateEntreeLabelRF;
    private com.toedter.calendar.JDateChooser dateEntreeRF;
    private javax.swing.JSpinner idReservRF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel mailClientLabelRF;
    private javax.swing.JTextField mailClientRF;
    private javax.swing.JLabel nbrJoursLabelRF;
    private javax.swing.JSpinner nbrJoursRF;
    private javax.swing.JLabel nomClientLabelRF;
    private javax.swing.JTextField nomClientRF;
    private javax.swing.JLabel numChambreLabelRF;
    private javax.swing.JTextField numChambreRF;
    private javax.swing.JTable tableauReserv;
    private javax.swing.JLabel titreRF;
    // End of variables declaration//GEN-END:variables
}
