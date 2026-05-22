package design;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.activation.*;
import javax.swing.JPanel;
import javax.swing.table.JTableHeader;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        page_chambre = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();
        txtNumChambre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDesign = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrixNuite = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnAjouter = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        chambreTable = new javax.swing.JTable();
        btnRechercher = new javax.swing.JButton();
        txtRecherche = new javax.swing.JTextField();
        close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btn_occuper = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        btn_solde = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_chambre = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_reserver = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_sejourner = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        page_solde = new javax.swing.JPanel();
        page_solde1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        soldeTable = new javax.swing.JTable();
        btnRechercher_solde = new javax.swing.JButton();
        txtRecherche_solde = new javax.swing.JTextField();
        close_solde = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        page_reserver = new javax.swing.JPanel();
        page_reserver1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtDatereserv = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtDateentree = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtNomclient = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnAjouter_reserver = new javax.swing.JButton();
        btnModifier_reserver = new javax.swing.JButton();
        btnSupprimer_reserver = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtNumChambre_reserver = new javax.swing.JComboBox<>();
        txtNbjours = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        reserverTable = new javax.swing.JTable();
        btnRechercher_reserver = new javax.swing.JButton();
        txtRecherche_reserver = new javax.swing.JTextField();
        close_reserver = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        page_sejourner = new javax.swing.JPanel();
        page_sejourner1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtPrixNuite1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        btnAjouter_sejourner = new javax.swing.JButton();
        btnModifier_sejourner = new javax.swing.JButton();
        btnSupprimer_sejourner = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        txtPrixNuite2 = new javax.swing.JTextField();
        txtNumChambre_sejourner = new javax.swing.JComboBox<>();
        txtNbjours_sejourner = new javax.swing.JSpinner();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        sejournerTable = new javax.swing.JTable();
        btnRechercher_sejourner = new javax.swing.JButton();
        txtRecherche_sejourner = new javax.swing.JTextField();
        close_sejourner = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        page_occuper = new javax.swing.JPanel();
        page_occuper2 = new javax.swing.JPanel();
        page_solde3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        occuperTable = new javax.swing.JTable();
        btnRechercher_occuper = new javax.swing.JButton();
        txtRecherche_occuper = new javax.swing.JTextField();
        close_occuper = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtNumChambre_occuper = new javax.swing.JComboBox<>();
        btnAjouter_occuper = new javax.swing.JButton();
        btnModifier_occuper = new javax.swing.JButton();
        btnSupprimer_occuper = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page_chambre.setBackground(new java.awt.Color(255, 255, 255));
        page_chambre.setForeground(new java.awt.Color(255, 255, 255));
        page_chambre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/chambre.png"))); // NOI18N
        jLabel14.setText("CHAMBRE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1150, 100));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, -40, -1, -1));

        page_chambre.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 54, 1230, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtNumChambre.setForeground(new java.awt.Color(54, 33, 89));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(54, 33, 89));
        jLabel13.setText("Num Chambre:");

        txtDesign.setForeground(new java.awt.Color(54, 33, 89));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(54, 33, 89));
        jLabel15.setText("Design:");

        txtType.setForeground(new java.awt.Color(54, 33, 89));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(54, 33, 89));
        jLabel16.setText("Type:");

        txtPrixNuite.setForeground(new java.awt.Color(54, 33, 89));
        txtPrixNuite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrixNuiteActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(54, 33, 89));
        jLabel17.setText("PrixNuite:");

        btnAjouter.setBackground(new java.awt.Color(54, 33, 89));
        btnAjouter.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/ajouter.png"))); // NOI18N
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnModifier.setBackground(new java.awt.Color(54, 33, 89));
        btnModifier.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/modifier.png"))); // NOI18N
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setBackground(new java.awt.Color(54, 33, 89));
        btnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/supprimer.png"))); // NOI18N
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(54, 33, 89));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("TRAITEMENTS");

        jSeparator3.setForeground(new java.awt.Color(60, 63, 65));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumChambre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDesign)
                            .addComponent(txtType)))
                    .addComponent(txtPrixNuite, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(161, 161, 161))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(13, 13, 13)
                .addComponent(txtNumChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txtDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(txtPrixNuite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAjouter)
                    .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        page_chambre.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 183, -1, 580));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(60, 63, 65));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        chambreTable.setAutoCreateRowSorter(true);
        chambreTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chambreTable.setForeground(new java.awt.Color(54, 33, 89));
        chambreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUMERO CHAMBRE", "DESIGN", "TYPE", "PRIX NUITE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        chambreTable.setColumnSelectionAllowed(true);
        chambreTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chambreTable.setGridColor(new java.awt.Color(255, 255, 255));
        chambreTable.setOpaque(false);
        chambreTable.setRowHeight(40);
        chambreTable.setRowMargin(5);
        chambreTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        chambreTable.setSelectionForeground(new java.awt.Color(54, 33, 89));
        chambreTable.setShowGrid(true);
        chambreTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chambreTableFocusGained(evt);
            }
        });
        chambreTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chambreTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chambreTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(chambreTable);
        chambreTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (chambreTable.getColumnModel().getColumnCount() > 0) {
            chambreTable.getColumnModel().getColumn(0).setResizable(false);
            chambreTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            chambreTable.getColumnModel().getColumn(1).setResizable(false);
            chambreTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            chambreTable.getColumnModel().getColumn(2).setResizable(false);
            chambreTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            chambreTable.getColumnModel().getColumn(3).setResizable(false);
            chambreTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        page_chambre.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 241, 840, 530));

        btnRechercher.setBackground(new java.awt.Color(54, 33, 89));
        btnRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/chercher.png"))); // NOI18N
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });
        page_chambre.add(btnRechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 183, 68, 52));

        txtRecherche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRechercheActionPerformed(evt);
            }
        });
        page_chambre.add(txtRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 183, 760, 52));

        close.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        close.setForeground(new java.awt.Color(60, 63, 65));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        page_chambre.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 0, 48, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 63, 65));
        jLabel4.setText("RESERVATION D'UNE CHAMBRE D'HOTEL");
        page_chambre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 384, 48));

        getContentPane().add(page_chambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1210, 770));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(54, 33, 89));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_occuper.setBackground(new java.awt.Color(63, 43, 100));
        btn_occuper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_occuperMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/occuper.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OCCUPER");

        javax.swing.GroupLayout btn_occuperLayout = new javax.swing.GroupLayout(btn_occuper);
        btn_occuper.setLayout(btn_occuperLayout);
        btn_occuperLayout.setHorizontalGroup(
            btn_occuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_occuperLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_occuperLayout.setVerticalGroup(
            btn_occuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_occuperLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(btn_occuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        menu.add(btn_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 300, 110));

        jPanel3.setBackground(new java.awt.Color(85, 65, 118));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("MENU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1278, 1278, 1278))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        menu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 190));

        btn_solde.setBackground(new java.awt.Color(63, 43, 100));
        btn_solde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_soldeMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/solde.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SOLDE");

        javax.swing.GroupLayout btn_soldeLayout = new javax.swing.GroupLayout(btn_solde);
        btn_solde.setLayout(btn_soldeLayout);
        btn_soldeLayout.setHorizontalGroup(
            btn_soldeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_soldeLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        btn_soldeLayout.setVerticalGroup(
            btn_soldeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_soldeLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(btn_soldeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        menu.add(btn_solde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, 100));

        btn_chambre.setBackground(new java.awt.Color(85, 65, 118));
        btn_chambre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_chambreMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/chambre.png"))); // NOI18N
        jLabel7.setText("jLabel1");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CHAMBRE");

        javax.swing.GroupLayout btn_chambreLayout = new javax.swing.GroupLayout(btn_chambre);
        btn_chambre.setLayout(btn_chambreLayout);
        btn_chambreLayout.setHorizontalGroup(
            btn_chambreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_chambreLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_chambreLayout.setVerticalGroup(
            btn_chambreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_chambreLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(btn_chambreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        menu.add(btn_chambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 300, 100));

        btn_reserver.setBackground(new java.awt.Color(63, 43, 100));
        btn_reserver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reserverMousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/reserver.png"))); // NOI18N
        jLabel9.setText("jLabel1");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RESERVER");

        javax.swing.GroupLayout btn_reserverLayout = new javax.swing.GroupLayout(btn_reserver);
        btn_reserver.setLayout(btn_reserverLayout);
        btn_reserverLayout.setHorizontalGroup(
            btn_reserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_reserverLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_reserverLayout.setVerticalGroup(
            btn_reserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_reserverLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(btn_reserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        menu.add(btn_reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 300, 110));

        btn_sejourner.setBackground(new java.awt.Color(63, 43, 100));
        btn_sejourner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_sejournerMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/sejourner.png"))); // NOI18N
        jLabel11.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SEJOURNER");

        javax.swing.GroupLayout btn_sejournerLayout = new javax.swing.GroupLayout(btn_sejourner);
        btn_sejourner.setLayout(btn_sejournerLayout);
        btn_sejournerLayout.setHorizontalGroup(
            btn_sejournerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sejournerLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_sejournerLayout.setVerticalGroup(
            btn_sejournerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sejournerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_sejournerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        menu.add(btn_sejourner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, 110));

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 296, 790));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        page_solde.setBackground(new java.awt.Color(255, 255, 255));
        page_solde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page_solde1.setBackground(new java.awt.Color(255, 255, 255));
        page_solde1.setForeground(new java.awt.Color(255, 255, 255));
        page_solde1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/solde.png"))); // NOI18N
        jLabel20.setText("SOLDE");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1150, 100));

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, -40, -1, -1));

        page_solde1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 54, 1230, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(60, 63, 65));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        soldeTable.setAutoCreateRowSorter(true);
        soldeTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        soldeTable.setForeground(new java.awt.Color(54, 33, 89));
        soldeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "SOLDE ACTUEL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        soldeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        soldeTable.setGridColor(new java.awt.Color(255, 255, 255));
        soldeTable.setOpaque(false);
        soldeTable.setRowHeight(40);
        soldeTable.setRowMargin(5);
        soldeTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        soldeTable.setSelectionForeground(new java.awt.Color(54, 33, 89));
        soldeTable.setShowGrid(true);
        soldeTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                soldeTableFocusGained(evt);
            }
        });
        soldeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soldeTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                soldeTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(soldeTable);
        soldeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (soldeTable.getColumnModel().getColumnCount() > 0) {
            soldeTable.getColumnModel().getColumn(0).setResizable(false);
            soldeTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            soldeTable.getColumnModel().getColumn(1).setResizable(false);
            soldeTable.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        page_solde1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 241, 1230, 530));

        btnRechercher_solde.setBackground(new java.awt.Color(54, 33, 89));
        btnRechercher_solde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/chercher.png"))); // NOI18N
        btnRechercher_solde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercher_soldeActionPerformed(evt);
            }
        });
        page_solde1.add(btnRechercher_solde, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 183, 68, 52));

        txtRecherche_solde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecherche_solde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecherche_soldeActionPerformed(evt);
            }
        });
        page_solde1.add(txtRecherche_solde, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 183, 760, 52));

        close_solde.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        close_solde.setForeground(new java.awt.Color(60, 63, 65));
        close_solde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_solde.setText("X");
        close_solde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_solde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close_soldeMousePressed(evt);
            }
        });
        page_solde1.add(close_solde, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 0, 48, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(60, 63, 65));
        jLabel26.setText("RESERVATION D'UNE CHAMBRE D'HOTEL");
        page_solde1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 384, 48));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(54, 33, 89));
        jLabel21.setText("TOTAL:");
        page_solde1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 70, 30));

        jTextField1.setForeground(new java.awt.Color(54, 33, 89));
        page_solde1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 180, 30));

        page_solde.add(page_solde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1210, 770));

        getContentPane().add(page_solde, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1220, 770));

        page_reserver.setBackground(new java.awt.Color(255, 255, 255));

        page_reserver1.setBackground(new java.awt.Color(255, 255, 255));
        page_reserver1.setForeground(new java.awt.Color(255, 255, 255));
        page_reserver1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(54, 33, 89));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/reserver.png"))); // NOI18N
        jLabel22.setText("RESERVER");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1150, 100));

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, -40, -1, -1));

        page_reserver1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 54, 1230, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(54, 33, 89));
        jLabel23.setText("Num Chambre:");

        txtDatereserv.setForeground(new java.awt.Color(54, 33, 89));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(54, 33, 89));
        jLabel24.setText("Date de reservation:");

        txtDateentree.setForeground(new java.awt.Color(54, 33, 89));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(54, 33, 89));
        jLabel25.setText("Date d'entree:");

        txtNomclient.setForeground(new java.awt.Color(54, 33, 89));
        txtNomclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomclientActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(54, 33, 89));
        jLabel27.setText("Nombre de jours:");

        btnAjouter_reserver.setBackground(new java.awt.Color(54, 33, 89));
        btnAjouter_reserver.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouter_reserver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/ajouter.png"))); // NOI18N
        btnAjouter_reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouter_reserverActionPerformed(evt);
            }
        });

        btnModifier_reserver.setBackground(new java.awt.Color(54, 33, 89));
        btnModifier_reserver.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier_reserver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/modifier.png"))); // NOI18N
        btnModifier_reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifier_reserverActionPerformed(evt);
            }
        });

        btnSupprimer_reserver.setBackground(new java.awt.Color(54, 33, 89));
        btnSupprimer_reserver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/supprimer.png"))); // NOI18N
        btnSupprimer_reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimer_reserverActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(54, 33, 89));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("TRAITEMENTS");

        jSeparator4.setForeground(new java.awt.Color(60, 63, 65));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(54, 33, 89));
        jLabel30.setText("Nom du client:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(54, 33, 89));
        jLabel31.setText("Mail:");

        txtMail.setForeground(new java.awt.Color(54, 33, 89));
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        txtNumChambre_reserver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumChambre_reserver.setForeground(new java.awt.Color(54, 33, 89));
        txtNumChambre_reserver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNbjours.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNbjours.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel25)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNomclient))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(116, 116, 116))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAjouter_reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnModifier_reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnSupprimer_reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDatereserv)
                    .addComponent(txtDateentree)
                    .addComponent(txtMail)
                    .addComponent(txtNumChambre_reserver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNbjours))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(5, 5, 5)
                .addComponent(txtNumChambre_reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDatereserv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDateentree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNbjours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomclient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAjouter_reserver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModifier_reserver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer_reserver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        page_reserver1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 183, -1, 580));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(60, 63, 65));
        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        reserverTable.setAutoCreateRowSorter(true);
        reserverTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reserverTable.setForeground(new java.awt.Color(54, 33, 89));
        reserverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IDRESERV", "NUMERO CHAMBRE", "DATE RESERV", "DATE ENTREE", "NB JOURS", "NOM CLIENT", "MAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reserverTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reserverTable.setGridColor(new java.awt.Color(255, 255, 255));
        reserverTable.setOpaque(false);
        reserverTable.setRowHeight(40);
        reserverTable.setRowMargin(5);
        reserverTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        reserverTable.setSelectionForeground(new java.awt.Color(54, 33, 89));
        reserverTable.setShowGrid(true);
        reserverTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reserverTableFocusGained(evt);
            }
        });
        reserverTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reserverTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reserverTableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(reserverTable);
        reserverTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (reserverTable.getColumnModel().getColumnCount() > 0) {
            reserverTable.getColumnModel().getColumn(0).setResizable(false);
            reserverTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            reserverTable.getColumnModel().getColumn(1).setResizable(false);
            reserverTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            reserverTable.getColumnModel().getColumn(2).setResizable(false);
            reserverTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            reserverTable.getColumnModel().getColumn(3).setResizable(false);
            reserverTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            reserverTable.getColumnModel().getColumn(4).setResizable(false);
            reserverTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            reserverTable.getColumnModel().getColumn(5).setResizable(false);
            reserverTable.getColumnModel().getColumn(5).setPreferredWidth(20);
            reserverTable.getColumnModel().getColumn(6).setResizable(false);
            reserverTable.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        page_reserver1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 241, 840, 530));

        btnRechercher_reserver.setBackground(new java.awt.Color(54, 33, 89));
        btnRechercher_reserver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/chercher.png"))); // NOI18N
        btnRechercher_reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercher_reserverActionPerformed(evt);
            }
        });
        page_reserver1.add(btnRechercher_reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 183, 68, 52));

        txtRecherche_reserver.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecherche_reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecherche_reserverActionPerformed(evt);
            }
        });
        page_reserver1.add(txtRecherche_reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 183, 760, 52));

        close_reserver.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        close_reserver.setForeground(new java.awt.Color(60, 63, 65));
        close_reserver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_reserver.setText("X");
        close_reserver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_reserver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close_reserverMousePressed(evt);
            }
        });
        page_reserver1.add(close_reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 0, 48, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(60, 63, 65));
        jLabel29.setText("RESERVATION D'UNE CHAMBRE D'HOTEL");
        page_reserver1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 384, 48));

        javax.swing.GroupLayout page_reserverLayout = new javax.swing.GroupLayout(page_reserver);
        page_reserver.setLayout(page_reserverLayout);
        page_reserverLayout.setHorizontalGroup(
            page_reserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1215, Short.MAX_VALUE)
            .addGroup(page_reserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(page_reserverLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(page_reserver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        page_reserverLayout.setVerticalGroup(
            page_reserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
            .addGroup(page_reserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(page_reserverLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(page_reserver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(page_reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1210, 770));

        page_sejourner.setBackground(new java.awt.Color(255, 255, 255));

        page_sejourner1.setBackground(new java.awt.Color(255, 255, 255));
        page_sejourner1.setForeground(new java.awt.Color(255, 255, 255));
        page_sejourner1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(54, 33, 89));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setBackground(new java.awt.Color(54, 33, 89));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/sejourner.png"))); // NOI18N
        jLabel32.setText("SEJOURNER");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1150, 100));

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.add(jLayeredPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, -40, -1, -1));

        page_sejourner1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 54, 1230, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(54, 33, 89));
        jLabel33.setText("Num Chambre:");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(54, 33, 89));
        jLabel34.setText("Date d'entree du sejour:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(54, 33, 89));
        jLabel35.setText("Nombre de jours:");

        txtPrixNuite1.setForeground(new java.awt.Color(54, 33, 89));
        txtPrixNuite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrixNuite1ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(54, 33, 89));
        jLabel36.setText("Nom du client:");

        btnAjouter_sejourner.setBackground(new java.awt.Color(54, 33, 89));
        btnAjouter_sejourner.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouter_sejourner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/ajouter.png"))); // NOI18N
        btnAjouter_sejourner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouter_sejournerActionPerformed(evt);
            }
        });

        btnModifier_sejourner.setBackground(new java.awt.Color(54, 33, 89));
        btnModifier_sejourner.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier_sejourner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/modifier.png"))); // NOI18N
        btnModifier_sejourner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifier_sejournerActionPerformed(evt);
            }
        });

        btnSupprimer_sejourner.setBackground(new java.awt.Color(54, 33, 89));
        btnSupprimer_sejourner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/supprimer.png"))); // NOI18N
        btnSupprimer_sejourner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimer_sejournerActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(54, 33, 89));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("TRAITEMENTS");

        jSeparator5.setForeground(new java.awt.Color(60, 63, 65));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(54, 33, 89));
        jLabel39.setText("Telephone:");

        txtPrixNuite2.setForeground(new java.awt.Color(54, 33, 89));
        txtPrixNuite2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrixNuite2ActionPerformed(evt);
            }
        });

        txtNumChambre_sejourner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumChambre_sejourner.setForeground(new java.awt.Color(54, 33, 89));
        txtNumChambre_sejourner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNbjours_sejourner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(124, 124, 124))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnAjouter_sejourner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnModifier_sejourner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(btnSupprimer_sejourner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtPrixNuite1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrixNuite2)
                    .addComponent(txtNumChambre_sejourner, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNbjours_sejourner)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumChambre_sejourner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNbjours_sejourner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrixNuite1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrixNuite2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAjouter_sejourner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModifier_sejourner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer_sejourner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        page_sejourner1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 183, -1, 580));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(60, 63, 65));
        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sejournerTable.setAutoCreateRowSorter(true);
        sejournerTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sejournerTable.setForeground(new java.awt.Color(54, 33, 89));
        sejournerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID SEJOUR", "NUMERO CHAMBRE", "DATE ENTREE SEJOUR", "NB JOURS", "NOM CLIENT", "TELEPHONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sejournerTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sejournerTable.setGridColor(new java.awt.Color(255, 255, 255));
        sejournerTable.setOpaque(false);
        sejournerTable.setRowHeight(40);
        sejournerTable.setRowMargin(5);
        sejournerTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        sejournerTable.setSelectionForeground(new java.awt.Color(54, 33, 89));
        sejournerTable.setShowGrid(true);
        sejournerTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sejournerTableFocusGained(evt);
            }
        });
        sejournerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sejournerTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sejournerTableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(sejournerTable);
        sejournerTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (sejournerTable.getColumnModel().getColumnCount() > 0) {
            sejournerTable.getColumnModel().getColumn(0).setResizable(false);
            sejournerTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            sejournerTable.getColumnModel().getColumn(1).setResizable(false);
            sejournerTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            sejournerTable.getColumnModel().getColumn(2).setResizable(false);
            sejournerTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            sejournerTable.getColumnModel().getColumn(3).setResizable(false);
            sejournerTable.getColumnModel().getColumn(3).setPreferredWidth(20);
            sejournerTable.getColumnModel().getColumn(4).setResizable(false);
            sejournerTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            sejournerTable.getColumnModel().getColumn(5).setResizable(false);
            sejournerTable.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        page_sejourner1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 241, 840, 530));

        btnRechercher_sejourner.setBackground(new java.awt.Color(54, 33, 89));
        btnRechercher_sejourner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/chercher.png"))); // NOI18N
        btnRechercher_sejourner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercher_sejournerActionPerformed(evt);
            }
        });
        page_sejourner1.add(btnRechercher_sejourner, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 183, 68, 52));

        txtRecherche_sejourner.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecherche_sejourner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecherche_sejournerActionPerformed(evt);
            }
        });
        page_sejourner1.add(txtRecherche_sejourner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 183, 760, 52));

        close_sejourner.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        close_sejourner.setForeground(new java.awt.Color(60, 63, 65));
        close_sejourner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_sejourner.setText("X");
        close_sejourner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_sejourner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close_sejournerMousePressed(evt);
            }
        });
        page_sejourner1.add(close_sejourner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 0, 48, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(60, 63, 65));
        jLabel38.setText("RESERVATION D'UNE CHAMBRE D'HOTEL");
        page_sejourner1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 384, 48));

        javax.swing.GroupLayout page_sejournerLayout = new javax.swing.GroupLayout(page_sejourner);
        page_sejourner.setLayout(page_sejournerLayout);
        page_sejournerLayout.setHorizontalGroup(
            page_sejournerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1215, Short.MAX_VALUE)
            .addGroup(page_sejournerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(page_sejournerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(page_sejourner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        page_sejournerLayout.setVerticalGroup(
            page_sejournerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
            .addGroup(page_sejournerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(page_sejournerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(page_sejourner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(page_sejourner, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1210, 770));

        page_occuper.setBackground(new java.awt.Color(255, 255, 255));

        page_occuper2.setBackground(new java.awt.Color(255, 255, 255));
        page_occuper2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page_solde3.setBackground(new java.awt.Color(255, 255, 255));
        page_solde3.setForeground(new java.awt.Color(255, 255, 255));
        page_solde3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(54, 33, 89));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/occuper.png"))); // NOI18N
        jLabel40.setText("OCCUPER");
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1160, 100));

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel9.add(jLayeredPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, -40, -1, -1));

        page_solde3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 54, 1230, -1));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setForeground(new java.awt.Color(60, 63, 65));
        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        occuperTable.setAutoCreateRowSorter(true);
        occuperTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        occuperTable.setForeground(new java.awt.Color(54, 33, 89));
        occuperTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID OCCUP", "ID RESERV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        occuperTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        occuperTable.setGridColor(new java.awt.Color(255, 255, 255));
        occuperTable.setOpaque(false);
        occuperTable.setRowHeight(40);
        occuperTable.setRowMargin(5);
        occuperTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        occuperTable.setSelectionForeground(new java.awt.Color(54, 33, 89));
        occuperTable.setShowGrid(true);
        occuperTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                occuperTableFocusGained(evt);
            }
        });
        occuperTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                occuperTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                occuperTableMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(occuperTable);
        occuperTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (occuperTable.getColumnModel().getColumnCount() > 0) {
            occuperTable.getColumnModel().getColumn(0).setResizable(false);
            occuperTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            occuperTable.getColumnModel().getColumn(1).setResizable(false);
            occuperTable.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        page_solde3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 241, 1230, 530));

        btnRechercher_occuper.setBackground(new java.awt.Color(54, 33, 89));
        btnRechercher_occuper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/chercher.png"))); // NOI18N
        btnRechercher_occuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercher_occuperActionPerformed(evt);
            }
        });
        page_solde3.add(btnRechercher_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 68, 60));

        txtRecherche_occuper.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecherche_occuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecherche_occuperActionPerformed(evt);
            }
        });
        page_solde3.add(txtRecherche_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 183, 530, 52));

        close_occuper.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        close_occuper.setForeground(new java.awt.Color(60, 63, 65));
        close_occuper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_occuper.setText("X");
        close_occuper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_occuper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close_occuperMousePressed(evt);
            }
        });
        page_solde3.add(close_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 0, 48, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(60, 63, 65));
        jLabel41.setText("RESERVATION D'UNE CHAMBRE D'HOTEL");
        page_solde3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 384, 48));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(54, 33, 89));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accueil.png"))); // NOI18N
        jLabel42.setText("Numero chambre:");
        page_solde3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 130, 40));

        txtNumChambre_occuper.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumChambre_occuper.setForeground(new java.awt.Color(60, 63, 65));
        txtNumChambre_occuper.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        page_solde3.add(txtNumChambre_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 180, 40));

        btnAjouter_occuper.setBackground(new java.awt.Color(54, 33, 89));
        btnAjouter_occuper.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouter_occuper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/ajouter.png"))); // NOI18N
        btnAjouter_occuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouter_occuperActionPerformed(evt);
            }
        });
        page_solde3.add(btnAjouter_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 190, 50, 40));

        btnModifier_occuper.setBackground(new java.awt.Color(54, 33, 89));
        btnModifier_occuper.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier_occuper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/modifier.png"))); // NOI18N
        btnModifier_occuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifier_occuperActionPerformed(evt);
            }
        });
        page_solde3.add(btnModifier_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 190, 50, 40));

        btnSupprimer_occuper.setBackground(new java.awt.Color(54, 33, 89));
        btnSupprimer_occuper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/supprimer.png"))); // NOI18N
        btnSupprimer_occuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimer_occuperActionPerformed(evt);
            }
        });
        page_solde3.add(btnSupprimer_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 190, 50, 40));

        page_occuper2.add(page_solde3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1210, 770));

        javax.swing.GroupLayout page_occuperLayout = new javax.swing.GroupLayout(page_occuper);
        page_occuper.setLayout(page_occuperLayout);
        page_occuperLayout.setHorizontalGroup(
            page_occuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
            .addGroup(page_occuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(page_occuperLayout.createSequentialGroup()
                    .addComponent(page_occuper2, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        page_occuperLayout.setVerticalGroup(
            page_occuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
            .addGroup(page_occuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(page_occuper2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(page_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1210, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    java.sql.PreparedStatement pst;
    java.sql.ResultSet res;
    java.sql.ResultSetMetaData result;
  

    private void afficherTable() {
        JTableHeader THeader = chambreTable.getTableHeader();
        THeader.setBackground(Color.white);
        Font headerFont = new Font("Segoe UI", Font.BOLD, 24);
        THeader.setFont(headerFont);
        THeader.setForeground(Color.getHSBColor(54, 33, 89));
        try {
            int q;
            pst = Connexion.connBD().prepareStatement("SELECT * from chambre");
            res = pst.executeQuery();
            result = res.getMetaData();
            q = result.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) chambreTable.getModel();
            df.setRowCount(0);
            while (res.next()) {
                Vector v = new Vector();
                for (int a = 1; a <= q; a++) {
                    v.add(res.getString("numchambre"));
                    v.add(res.getString("design"));
                    v.add(res.getString("type"));
                    v.add(res.getString("prixnuite"));
                }
                df.addRow(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void btn_soldeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_soldeMousePressed
        setColor(btn_solde);
        resetColor(btn_chambre);
        resetColor(btn_reserver);
        resetColor(btn_sejourner);
        resetColor(btn_occuper);
        page_solde.setVisible(true);
        page_chambre.setVisible(false);
        page_reserver.setVisible(false);
        page_sejourner.setVisible(false);
        page_occuper.setVisible(false);

    }//GEN-LAST:event_btn_soldeMousePressed

    private void btn_chambreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_chambreMousePressed
        setColor(btn_chambre);
        resetColor(btn_solde);
        resetColor(btn_reserver);
        resetColor(btn_sejourner);
        resetColor(btn_occuper);
        page_solde.setVisible(false);
        page_chambre.setVisible(true);
        page_reserver.setVisible(false);
        page_sejourner.setVisible(false);
        page_occuper.setVisible(false);
    }//GEN-LAST:event_btn_chambreMousePressed

    private void btn_reserverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reserverMousePressed
        setColor(btn_reserver);
        resetColor(btn_chambre);
        resetColor(btn_solde);
        resetColor(btn_sejourner);
        resetColor(btn_occuper);
        page_reserver.setVisible(true);
        page_solde.setVisible(false);
        page_chambre.setVisible(false);
        page_sejourner.setVisible(false);
        page_occuper.setVisible(false);
    }//GEN-LAST:event_btn_reserverMousePressed

    private void btn_sejournerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sejournerMousePressed
        setColor(btn_sejourner);
        resetColor(btn_chambre);
        resetColor(btn_reserver);
        resetColor(btn_solde);
        resetColor(btn_occuper);
        page_sejourner.setVisible(true);
        page_reserver.setVisible(false);
        page_solde.setVisible(false);
        page_chambre.setVisible(false);
        page_occuper.setVisible(false);
    }//GEN-LAST:event_btn_sejournerMousePressed

    private void btn_occuperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_occuperMousePressed
        setColor(btn_occuper);
        resetColor(btn_chambre);
        resetColor(btn_reserver);
        resetColor(btn_sejourner);
        resetColor(btn_solde);
        page_occuper.setVisible(true);
        page_sejourner.setVisible(false);
        page_reserver.setVisible(false);
        page_solde.setVisible(false);
        page_chambre.setVisible(false);
    }//GEN-LAST:event_btn_occuperMousePressed

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        System.exit(0);
    }//GEN-LAST:event_closeMousePressed

    private void txtRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRechercheActionPerformed

    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
        String rec = txtRecherche.getText();
        try {
            int q;
            if (rec == null) {
                try {
                    afficherTable();
                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(this, "Erreur\n" + e, "Message d'erreur", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                String sql = "SELECT * FROM chambre WHERE numchambre LIKE ? OR design LIKE ? OR type LIKE ? OR prixnuite::text LIKE ?";

                PreparedStatement pst = null;
                try {
                    pst = Connexion.connBD().prepareStatement(sql);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                pst.setString(1, "%" + rec + "%");
                pst.setString(2, "%" + rec + "%");
                pst.setString(3, "%" + rec + "%");
                pst.setString(4, "%" + rec + "%");

                res = pst.executeQuery();
                result = res.getMetaData();
                q = result.getColumnCount();
                DefaultTableModel df = (DefaultTableModel) chambreTable.getModel();
                df.setRowCount(0);
                while (res.next()) {
                    Vector v2 = new Vector();
                    for (int a = 1; a <= q; a++) {
                        v2.add(res.getString("numchambre"));
                        v2.add(res.getString("design"));
                        v2.add(res.getString("type"));
                        v2.add(res.getString("prixnuite"));
                    }
                    df.addRow(v2);
                }
            }
            txtRecherche.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRechercherActionPerformed

    private void chambreTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chambreTableMousePressed

    }//GEN-LAST:event_chambreTableMousePressed

    private void chambreTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chambreTableMouseClicked
        try {
            int i = chambreTable.getSelectedRow();
            TableModel tm = chambreTable.getModel();
            txtNumChambre.setText(tm.getValueAt(i, 0).toString());
            txtDesign.setText(tm.getValueAt(i, 1).toString());
            txtType.setText(tm.getValueAt(i, 2).toString());
            txtPrixNuite.setText(tm.getValueAt(i, 3).toString());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Erreur, veuillez reessayer! \n" + e, "Message d'erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_chambreTableMouseClicked

    private void chambreTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chambreTableFocusGained

    }//GEN-LAST:event_chambreTableFocusGained

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        try {
            String numC = txtNumChambre.getText();
            pst = Connexion.connBD().prepareStatement("DELETE from chambre WHERE numchambre = ?");
            pst.setString(1, numC);
            int k = pst.executeUpdate();
            if (k == 1) {
                JOptionPane.showConfirmDialog(this, "La chambre numero " + numC + " est supprime avec succes!", "Message de succes", JOptionPane.NO_OPTION);
                txtNumChambre.setText("");
                txtDesign.setText("");
                txtType.setText("");
                txtPrixNuite.setText("");
                afficherTable();
            } else {
                JOptionPane.showConfirmDialog(this, " Erreur, veuillez reessayer!", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        try {
            
            String numCh = txtNumChambre.getText();
            String desi = txtDesign.getText();
            String ty = txtType.getText();
            int pN = Integer.parseInt(txtPrixNuite.getText());

            pst = Connexion.connBD().prepareStatement("UPDATE chambre SET design=?,type=?,prixnuite=? WHERE numchambre=?");

            pst.setString(1, desi);
            pst.setString(2, ty);
            pst.setInt(3, pN);
            pst.setString(4, numCh);

            int k;
            k = pst.executeUpdate();
            if (k == 1) {
                JOptionPane.showConfirmDialog(this, "La chambre numero " + numCh + " est modifie avec succes!", "Message de succes", JOptionPane.INFORMATION_MESSAGE);
                txtNumChambre.setText("");
                txtDesign.setText("");
                txtType.setText("");
                txtPrixNuite.setText("");
                afficherTable();
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(this, ex, "Message de succes", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        String numC = txtNumChambre.getText();
        String des = txtDesign.getText();
        String t = txtType.getText();
        String prixN = txtPrixNuite.getText();
        int number = Integer.parseInt(prixN);

        if ((numC == "") || (des == "") || (t == "") || (prixN == "")) {
            JOptionPane.showConfirmDialog(this, "Erreur, veuillez saisir toutes les donnees!", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                try {
                    pst = Connexion.connBD().prepareStatement("INSERT INTO chambre(numchambre,design,type,prixnuite) VALUES (?,?,?,?)");
                    pst.setString(1, numC);
                    pst.setString(2, des);
                    pst.setString(3, t);
                    pst.setInt(4, number);

                    int k = pst.executeUpdate();
                    if (k == 1) {
                        JOptionPane.showConfirmDialog(this, "La chambre numero " + numC + " est ajoute avec succes!", "Message de succes", JOptionPane.INFORMATION_MESSAGE);
                        txtNumChambre.setText("");
                        txtDesign.setText("");
                        txtType.setText("");
                        txtPrixNuite.setText(Integer.toString(0));
                        afficherTable();
                    } else {
                        JOptionPane.showConfirmDialog(this, "Erreur, veuillez reessayer!", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showConfirmDialog(this, "Erreur, veuillez entrer un nombre valide pour le prix nuite\n" + ex, "Message d'erreur", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(this, "Erreur, veuillez reessayer!\n" + ex, "Message d'erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void txtPrixNuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrixNuiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrixNuiteActionPerformed

    private void soldeTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_soldeTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_soldeTableFocusGained

    private void soldeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldeTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_soldeTableMouseClicked

    private void soldeTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldeTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_soldeTableMousePressed

    private void btnRechercher_soldeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercher_soldeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRechercher_soldeActionPerformed

    private void txtRecherche_soldeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecherche_soldeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecherche_soldeActionPerformed

    private void close_soldeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_soldeMousePressed
        System.exit(0);
    }//GEN-LAST:event_close_soldeMousePressed

    private void txtNomclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomclientActionPerformed

    private void btnAjouter_reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouter_reserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjouter_reserverActionPerformed

    private void btnModifier_reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifier_reserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifier_reserverActionPerformed

    private void btnSupprimer_reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimer_reserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupprimer_reserverActionPerformed

    private void reserverTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reserverTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_reserverTableFocusGained

    private void reserverTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserverTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reserverTableMouseClicked

    private void reserverTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserverTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reserverTableMousePressed

    private void btnRechercher_reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercher_reserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRechercher_reserverActionPerformed

    private void txtRecherche_reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecherche_reserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecherche_reserverActionPerformed

    private void close_reserverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_reserverMousePressed
        System.exit(0);
    }//GEN-LAST:event_close_reserverMousePressed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtPrixNuite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrixNuite1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrixNuite1ActionPerformed

    private void btnAjouter_sejournerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouter_sejournerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjouter_sejournerActionPerformed

    private void btnModifier_sejournerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifier_sejournerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifier_sejournerActionPerformed

    private void btnSupprimer_sejournerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimer_sejournerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupprimer_sejournerActionPerformed

    private void sejournerTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sejournerTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_sejournerTableFocusGained

    private void sejournerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sejournerTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sejournerTableMouseClicked

    private void sejournerTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sejournerTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sejournerTableMousePressed

    private void btnRechercher_sejournerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercher_sejournerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRechercher_sejournerActionPerformed

    private void txtRecherche_sejournerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecherche_sejournerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecherche_sejournerActionPerformed

    private void close_sejournerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_sejournerMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_close_sejournerMousePressed

    private void txtPrixNuite2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrixNuite2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrixNuite2ActionPerformed

    private void occuperTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_occuperTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_occuperTableFocusGained

    private void occuperTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_occuperTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_occuperTableMouseClicked

    private void occuperTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_occuperTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_occuperTableMousePressed

    private void btnRechercher_occuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercher_occuperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRechercher_occuperActionPerformed

    private void txtRecherche_occuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecherche_occuperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecherche_occuperActionPerformed

    private void close_occuperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_occuperMousePressed
       System.exit(0);
    }//GEN-LAST:event_close_occuperMousePressed

    private void btnAjouter_occuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouter_occuperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjouter_occuperActionPerformed

    private void btnModifier_occuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifier_occuperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifier_occuperActionPerformed

    private void btnSupprimer_occuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimer_occuperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupprimer_occuperActionPerformed

    void setColor(JPanel panel) {
        panel.setBackground(new Color(85, 65, 118));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(63, 43, 100));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnAjouter_occuper;
    private javax.swing.JButton btnAjouter_reserver;
    private javax.swing.JButton btnAjouter_sejourner;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnModifier_occuper;
    private javax.swing.JButton btnModifier_reserver;
    private javax.swing.JButton btnModifier_sejourner;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnRechercher_occuper;
    private javax.swing.JButton btnRechercher_reserver;
    private javax.swing.JButton btnRechercher_sejourner;
    private javax.swing.JButton btnRechercher_solde;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnSupprimer_occuper;
    private javax.swing.JButton btnSupprimer_reserver;
    private javax.swing.JButton btnSupprimer_sejourner;
    private javax.swing.JPanel btn_chambre;
    private javax.swing.JPanel btn_occuper;
    private javax.swing.JPanel btn_reserver;
    private javax.swing.JPanel btn_sejourner;
    private javax.swing.JPanel btn_solde;
    private javax.swing.JTable chambreTable;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close_occuper;
    private javax.swing.JLabel close_reserver;
    private javax.swing.JLabel close_sejourner;
    private javax.swing.JLabel close_solde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel menu;
    private javax.swing.JTable occuperTable;
    private javax.swing.JPanel page_chambre;
    private javax.swing.JPanel page_occuper;
    private javax.swing.JPanel page_occuper2;
    private javax.swing.JPanel page_reserver;
    private javax.swing.JPanel page_reserver1;
    private javax.swing.JPanel page_sejourner;
    private javax.swing.JPanel page_sejourner1;
    private javax.swing.JPanel page_solde;
    private javax.swing.JPanel page_solde1;
    private javax.swing.JPanel page_solde3;
    private javax.swing.JTable reserverTable;
    private javax.swing.JTable sejournerTable;
    private javax.swing.JTable soldeTable;
    private javax.swing.JTextField txtDateentree;
    private javax.swing.JTextField txtDatereserv;
    private javax.swing.JTextField txtDesign;
    private javax.swing.JTextField txtMail;
    private javax.swing.JSpinner txtNbjours;
    private javax.swing.JSpinner txtNbjours_sejourner;
    private javax.swing.JTextField txtNomclient;
    private javax.swing.JTextField txtNumChambre;
    private javax.swing.JComboBox<String> txtNumChambre_occuper;
    private javax.swing.JComboBox<String> txtNumChambre_reserver;
    private javax.swing.JComboBox<String> txtNumChambre_sejourner;
    private javax.swing.JTextField txtPrixNuite;
    private javax.swing.JTextField txtPrixNuite1;
    private javax.swing.JTextField txtPrixNuite2;
    private javax.swing.JTextField txtRecherche;
    private javax.swing.JTextField txtRecherche_occuper;
    private javax.swing.JTextField txtRecherche_reserver;
    private javax.swing.JTextField txtRecherche_sejourner;
    private javax.swing.JTextField txtRecherche_solde;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
