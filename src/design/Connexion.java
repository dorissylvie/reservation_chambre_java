/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private static Connection conn ;
    
    public static Connection connBD (){
        if(conn == null){
            try{
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chambreReservation","postgres","nirina");  
                if(conn!= null)  System.out.println("connexion etablie pour la premiere fois ");
                else System.out.println("connexion echouée");

            }
            catch( ClassNotFoundException | SQLException e ){
                System.out.println(e);
            }
            
        }
        
  
        
        
        return conn;
    }
    
   
    
}
