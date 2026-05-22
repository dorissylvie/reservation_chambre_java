/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design;

/**
 *
 * @author nirin
 */
import java.awt.Color;
import java.awt.Font;

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

public class Index extends javax.swing.JFrame {
 

    Chambre ch = new Chambre();
    Solde so =new Solde();
    Occuper oc = new Occuper(so);
    Sejourner2 sj = new Sejourner2(so);
    Reserver2 rj = new Reserver2(oc);

    public Index() {
        initComponents();
        
        
        ch.setLocation(0, 0);
        ch.setSize(1300, 880);
        ch.setVisible(true);
        panel.add(ch);

        sj.setVisible(false);
        rj.setVisible(false);
        oc.setVisible(false);
        so.setVisible(false);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        btn_occuper = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1520, 860));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1520, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(3, 45, 76));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_occuper.setBackground(new java.awt.Color(3, 45, 76));
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

        menu.add(btn_occuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 300, 110));

        jPanel3.setBackground(new java.awt.Color(3, 45, 76));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/image/accueil.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(42, 42, 42))
        );

        menu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 150));

        btn_solde.setBackground(new java.awt.Color(3, 45, 76));
        btn_solde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_soldeMouseClicked(evt);
            }
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

        menu.add(btn_solde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 300, 100));

        btn_chambre.setBackground(new java.awt.Color(10, 73, 105));
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

        menu.add(btn_chambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 100));

        btn_reserver.setBackground(new java.awt.Color(3, 45, 76));
        btn_reserver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reserverMouseClicked(evt);
            }
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

        menu.add(btn_reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 300, 110));

        btn_sejourner.setBackground(new java.awt.Color(3, 45, 76));
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

        menu.add(btn_sejourner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 300, 110));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 880));

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1220, 880));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_occuperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_occuperMousePressed
        

    
        oc.setLocation(0, 0);
        oc.setSize(1300, 880);
        oc.setVisible(true);
        panel.add(oc);
        
        sj.setVisible(false);
        rj.setVisible(false);
        so.setVisible(false);
        ch.setVisible(false);
        
        
        setColor(btn_occuper);
        resetColor(btn_chambre);
        resetColor(btn_reserver);
        resetColor(btn_sejourner);
        resetColor(btn_solde);

    }//GEN-LAST:event_btn_occuperMousePressed

    private void btn_soldeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_soldeMousePressed
    
        so.setLocation(0, 0);
        so.setSize(1300, 880);
        so.setVisible(true);
        panel.add(so);
        
        sj.setVisible(false);
        rj.setVisible(false);
        oc.setVisible(false);
        ch.setVisible(false);
        
        setColor(btn_solde);
        resetColor(btn_chambre);
        resetColor(btn_reserver);
        resetColor(btn_sejourner);
        resetColor(btn_occuper);

    }//GEN-LAST:event_btn_soldeMousePressed

    private void btn_chambreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_chambreMousePressed
        
    
        
            ch.setLocation(0, 0);
            ch.setSize(1300, 880);
            ch.setVisible(true);
            panel.add(ch);

            sj.setVisible(false);
            rj.setVisible(false);
            oc.setVisible(false);
            so.setVisible(false);

            setColor(btn_chambre);
            resetColor(btn_solde);
            resetColor(btn_reserver);
            resetColor(btn_sejourner);
            resetColor(btn_occuper);
      

    }//GEN-LAST:event_btn_chambreMousePressed

    private void btn_reserverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reserverMousePressed

     
     
            rj.setLocation(0, 0);
            rj.setSize(1300, 880);
            rj.setVisible(true);
            panel.add(rj);

            sj.setVisible(false);
            ch.setVisible(false);
            oc.setVisible(false);
            so.setVisible(false);

            setColor(btn_reserver);
            resetColor(btn_chambre);
            resetColor(btn_solde);
            resetColor(btn_sejourner);
            resetColor(btn_occuper);

     

    }//GEN-LAST:event_btn_reserverMousePressed

    private void btn_sejournerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sejournerMousePressed

  
    
            sj.setLocation(0, 0);
            sj.setSize(1300, 880);
            sj.setVisible(true);
            panel.add(sj);
         

            rj.setVisible(false);
            ch.setVisible(false);
            oc.setVisible(false);
            so.setVisible(false);

            setColor(btn_sejourner);
            resetColor(btn_chambre);
            resetColor(btn_reserver);
            resetColor(btn_solde);
            resetColor(btn_occuper);

   

    }//GEN-LAST:event_btn_sejournerMousePressed

    private void btn_soldeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_soldeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_soldeMouseClicked

    private void btn_reserverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reserverMouseClicked

    }//GEN-LAST:event_btn_reserverMouseClicked

    void setColor(JPanel panel) {
        panel.setBackground(new Color(10, 73, 105));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(3, 45, 76));
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Index index = new Index();
                index.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_chambre;
    private javax.swing.JPanel btn_occuper;
    private javax.swing.JPanel btn_reserver;
    private javax.swing.JPanel btn_sejourner;
    private javax.swing.JPanel btn_solde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
