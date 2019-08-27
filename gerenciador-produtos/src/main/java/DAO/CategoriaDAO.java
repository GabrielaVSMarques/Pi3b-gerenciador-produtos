/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author paulobelfi
 */
public class CategoriaDAO {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "PRODUTOBD";
    private static final String PORTA = "3306";
    private static final String LOGIN = "root";
    private static final String SENHA = "121296Pk!";
    private static String url = "";
    private static Connection conexao;
    
    private static Connection conectaBanco() throws SQLException{

            url = "jdbc:mysql://"+SERVIDOR+":"+PORTA+ "/PRODUTOBD?useTimezone=true&serverTimezone=UTC";
            //System.out.print(url);
            return DriverManager.getConnection(url, LOGIN, SENHA);
    }
    
    public static int pesquisar(String p) {


        try {
            Class.forName(DRIVER);
            conexao = conectaBanco();
            PreparedStatement comando = conexao.prepareStatement("SELECT ID FROM CATEGORIA WHERE ID = ?;");
            comando.setString(1, p);
            
            ResultSet rs = comando.executeQuery();
            return rs.getInt("ID");

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
            }
        }
        return -1;
    }
    
    
}
