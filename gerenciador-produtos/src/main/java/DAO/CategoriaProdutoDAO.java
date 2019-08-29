/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class CategoriaProdutoDAO {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "PRODUTOBD";
    private static final String PORTA = "3306";
    private static final String LOGIN = "root";
    private static final String SENHA = "root";
    private static String url = "";
    private static Connection conexao;
    
    private static Connection conectaBanco() throws SQLException{

            url = "jdbc:mysql://"+SERVIDOR+":"+PORTA+ "/PRODUTOBD?useTimezone=true&serverTimezone=UTC";
            //System.out.print(url);
            return DriverManager.getConnection(url, LOGIN, SENHA);
    }
    
    public static ArrayList<Categoria> pesquisarPorProduto(int p) {


        try {
            Class.forName(DRIVER);
            conexao = conectaBanco();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM PRODUTO_CATEGORIA WHERE ID_PRODUTO = ?;");
            comando.setInt(1, p);
            
            ResultSet rs = comando.executeQuery();
            
            ArrayList<Categoria> categorias = new ArrayList<Categoria>();
            while (rs.next()) {
               categorias.add(new Categoria(rs.getInt("ID"),CategoriaDAO.pesquisarPorId(rs.getInt("ID"))));
            }

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            }
        }
        return -1;
    }
}
