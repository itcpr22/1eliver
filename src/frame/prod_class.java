/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tedted29
 */
public class prod_class {
    conn con = new conn();
    
    public int product(String product_name, String quantity, String price ){
    //String sql = "insert into users values(null,'"+username+"',md5('"+password+"'),'"+lastname+"','"+firstname+"',0)";    
    //System.out.println(sql);
    int x = 0;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);
        String sql = "insert into tblprod values(null,?,?,?)";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        
        pstmt.setString(1, product_name);
        pstmt.setString(2, quantity);
        pstmt.setString(3, price);
       
        
        x = pstmt.executeUpdate();
        
        //System.out.println(x);
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(registration_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registration_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    return x; 
    }
}
