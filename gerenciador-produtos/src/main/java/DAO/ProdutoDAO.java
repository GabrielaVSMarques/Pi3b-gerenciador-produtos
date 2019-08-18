package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author gabrielavsmarques
 */
public class ProdutoDAO {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "PRODUTOBD";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;
    
    
    
        public static boolean salvar(Produto p) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/" + "PRODUTOBD";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO PRODUTO(nomeProduto,descricaoProduto,precoCompra,precoVenda,quantidade,categoria,dataCadastro)VALUES(?, ?, ?, ?, ?, ?, ?);");
            comando.setString(1, p.getNomeProduto());
            comando.setString(2, p.getDescricaoProduto());
            comando.setDouble(3, p.getPrecoCompra());
            comando.setDouble(4, p.getPrecoVenda());
            comando.setInt(5,p.getQuantidade());
            comando.setString(6, p.getCategoria());
            comando.setString(7, p.getdataCadastro());

            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
        }

        return retorno;
    }
    
}
