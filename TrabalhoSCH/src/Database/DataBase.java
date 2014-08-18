/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class DataBase {
    
    private Connection conn = null;
    
    
    public Connection conectar(String usuario,String senha){
        try {
            this.conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/sch",usuario,senha);
            JOptionPane.showMessageDialog(null, "Conectado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return this.conn;
    }
    
    
    public void desconectar(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
