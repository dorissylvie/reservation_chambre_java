/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design;
import java.sql.Date;
import java.sql.*;
import javax.swing.JOptionPane;
        
public class Reserver {
  private String numChambre ; 
  private Date dateReservation ;
  private  Date dateEntree ;
  private int nbrJours;
  private String nomClient ;
  private String mailClient ;
  
  public Reserver(){
     
    
  }
  
  public Reserver(String nC,Date dR , Date dE , int nJ , String nCli , String mCli ){
       this.numChambre=nC;
       this.dateReservation=dR;
       this.dateEntree=dE;
       this.nbrJours=nJ;
       this.nomClient=nCli;
       this.mailClient=mCli;
          
  }
  
  public void ajouterReservation(){
        try{
            int conf =JOptionPane.showConfirmDialog(null, " Voulez-vous vraiment ajouter cette réservation ? ");
            
            if(conf == JOptionPane.YES_OPTION){
                
                PreparedStatement prepare = Connexion.connBD().prepareStatement( "INSERT INTO reserver (numchambre,datereserv,dateentree,nbrjours,nomclient,mailclient) VALUES (?,?,?,?,?,?)");
                prepare.setString(1, this.numChambre);
                prepare.setDate(2,this.dateReservation );
                prepare.setDate(3,this.dateEntree );
                prepare.setInt(4, this.nbrJours);
                prepare.setString(5, this.nomClient);
                prepare.setString(6, this.mailClient);

                if(prepare.executeUpdate() !=1 ){
                    JOptionPane.showMessageDialog(null," Erreur lors de l'ajout", "Message", JOptionPane.ERROR_MESSAGE);
                }
                else{
                   JOptionPane.showMessageDialog(null," Ajout avec succées", "Message", JOptionPane.INFORMATION_MESSAGE); 
                  
                };       
            }
            
        }
        catch(SQLException e){
            System.out.println(e); 
        }
      
  }
  public void modifierReservation(int id ){
      
      try{
          int conf =JOptionPane.showConfirmDialog(null, " Voulez-vous vraiment modifier cette réservation ?");
            
            if(conf == JOptionPane.YES_OPTION){
            
                PreparedStatement prepare = Connexion.connBD().prepareStatement( "UPDATE reserver set numchambre = ? , datereserv = ? , dateentree =? , nbrjours = ? , nomclient= ? , mailclient = ? where idreserv = ?");
                prepare.setString(1, this.numChambre);
                prepare.setDate(2,this.dateReservation );
                prepare.setDate(3,this.dateEntree );
                prepare.setInt(4, this.nbrJours);
                prepare.setString(5, this.nomClient);
                prepare.setString(6, this.mailClient);
                prepare.setInt(7, id);

                if(prepare.executeUpdate() !=1 ){
                    JOptionPane.showMessageDialog(null," Erreur lors de la modification", "Message", JOptionPane.ERROR_MESSAGE);
                }
                else{
                   JOptionPane.showMessageDialog(null," Modification avec succées", "Message", JOptionPane.INFORMATION_MESSAGE); 
                };
            }
       
        }
        catch(SQLException e){
            System.out.println(e); 
        }
      
      
  }
  public void supprimerReservation(int id){
      
    try{
        int conf =JOptionPane.showConfirmDialog(null, " Voulez-vous vraiment supprimer cette réservation ?");

         if(conf == JOptionPane.YES_OPTION){
             PreparedStatement prepare = Connexion.connBD().prepareStatement("DELETE from reserver where idreserv = ? ");
             prepare .setInt(1, id);
             prepare.executeUpdate();

         }
    }
    catch(SQLException e){
        System.out.println(e); 
    }
      
  }
  

  
}
