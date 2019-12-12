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

    public int product(String product_name, int quantity, Object price) {
        //String sql = "insert into users values(null,'"+username+"',md5('"+password+"'),'"+lastname+"','"+firstname+"',0)";    
        //System.out.println(sql);
        int x = 0;

        try {
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public int checkProductname(String product_name) {
        int x = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);

            String sql = "SELECT product_name FROM tblprod WHERE product_name = ?;";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);

            pstmt.setString(1, product_name);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                x = 1;
            } else {
                x = 0;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }

        return x;
    }

    public int deleteProduct(Object id) {
        int r = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);

            String sql = "DELETE FROM tblprod WHERE id = ?;";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);

            int newid = Integer.parseInt(id.toString());
            pstmt.setInt(1, newid);

            r = pstmt.executeUpdate();
            //System.out.println(pstmt);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(prod_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(prod_class.class.getName()).log(Level.SEVERE, null, ex);
        }

        return r;
    }

    public int editProduct(Object id, String product_name, Object price) {
        int r = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);

            String sql = "UPDATE tblprod SET product_name = ?, price = ? WHERE id = ?;";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);

            pstmt.setString(1, product_name);
            float newprice = Float.parseFloat(price.toString());
            pstmt.setFloat(2, newprice);
            String newid = (String) id;
            pstmt.setString(3, newid);

            //System.out.println(pstmt);
            r = pstmt.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(prod_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(prod_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

     public int product_addQty(int id, Object quantity){int y = 0;
       int r = 0;
     try{
       
    String sql = "update tblprod set quantity =quantity+ ? where id=?;";
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection conn = (java.sql.Connection)DriverManager.getConnection("jdbc:mysql://localhost/eliverdb?", "root", "");
    java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
    
    pstmt.setString(1, quantity.toString());
    pstmt.setInt(2, id);
    y=pstmt.executeUpdate();
    
    
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(prod_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(prod_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }   

}
