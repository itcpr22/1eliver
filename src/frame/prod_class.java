/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tedted29
 */
public class prod_class {
    conn con = new conn();
    
    public int product(String product_name, int quantity, Object price ){
    //String sql = "insert into users values(null,'"+username+"',md5('"+password+"'),'"+lastname+"','"+firstname+"',0)";    
    //System.out.println(sql);
    int x = 0;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);
        String sql = "insert into tblprod values(null,?,?,?)";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        
        String np = price.toString();
        float newprice = Float.parseFloat(np);
        
        pstmt.setString(1, product_name);
        pstmt.setInt(2, quantity);
        pstmt.setFloat(3, newprice);
       
        
        x = pstmt.executeUpdate();
        
        //System.out.println(x);
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    return x; 
    }
      public int checkProductname(String product_name){
        int x = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);
        
            String sql = "SELECT product_name FROM tblprod WHERE product_name = ?;";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        
            pstmt.setString(1, product_name);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                x = 1;
            }else{
                x = 0;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return x;
    }
       public int delproduct(String product_name, int quantity, Object price ){
    //String sql = "insert into users values(null,'"+username+"',md5('"+password+"'),'"+lastname+"','"+firstname+"',0)";    
    //System.out.println(sql);
    int x = 0;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);
        String sql = "delete * from tblprod where id = ?";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        
        String np = price.toString();
        float newprice = Float.parseFloat(np);
        
        pstmt.setString(1, product_name);
        pstmt.setInt(2, quantity);
        pstmt.setFloat(3, newprice);
       
        
        x = pstmt.executeUpdate();
        
        //System.out.println(x);
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(prod_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(prod_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    return x; 

       }
      

}
