/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.machine;

import java.sql.*;
/**
 *
 * @author HP
 */
public class conn {
    
    Connection c ;
    Statement  s;
    
    public conn() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ass","root","manish");
            s = c.createStatement();
            
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
        