
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/uc11at01?useSSL=false";
            String usuario = "root";
            String senha = "0";
            conn = DriverManager.getConnection(url, usuario, senha);
            } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no estabelecimento da conexão com o banco de dados: " + erro.getMessage());
        }
        return conn;
    }
    
}
