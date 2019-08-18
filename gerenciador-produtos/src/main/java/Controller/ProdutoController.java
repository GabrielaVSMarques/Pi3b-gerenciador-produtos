package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gabrielavsmarques
 */
public class ProdutoController {
    
    public static boolean Salvar(String nomeProduto, String descricaoProduto, double precoCompra, double precoVenda, int quantidade, boolean disponivel, String categoria, String dataCadastro) {

        Produto p = new Produto(nomeProduto, descricaoProduto, precoCompra, precoVenda,quantidade,disponivel,categoria,dataCadastro);
        return ProdutoDAO.salvar(p);
    }
    
    /*public static boolean Atualizar(String nomeProduto, String descricaoProduto, double precoCompra, double precoVenda, int quantidade, boolean disponivel, String categoria, String dataCadastro) {

        Produto p = new Produto(nomeProduto, descricaoProduto, precoCompra, precoVenda, quantidade,disponivel,categoria);
        return ProdutoDAO.atualizar(p);
    }
    
     public static boolean Excluir(int idProduto) {
        return ProdutoDAO.excluir(idProduto);
    }
     
     
    public static ArrayList<String[]> Pesquisar(int idProduto, String nomeProduto, String descricaoProduto, double precoCompra, double precoVenda, int quantidade, boolean disponivel, String categoria) throws SQLException {
        
        Produto p  = new Produto();
        p.setIdProduto(idProduto);
        p.setNomeProduto(nomeProduto);
        p.setDescricaoProduto(descricaoProduto);
        p.setPrecoCompra(precoCompra);
        p.setPrecoVenda(precoVenda);
        p.setQuantidade(quantidade);
        p.setDisponivel(disponivel);
        p.setCategoria(categoria);
        
        ArrayList<Produto> retorno = ProdutoDAO.pesquisar(p);
        
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < retorno.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(retorno.get(i).getIdProduto()),
                retorno.get(i).getNomeProduto(),
                retorno.get(i).getDescricaoProduto(),
                String.valueOf(retorno.get(i).getPrecoCompra()),
                String.valueOf(retorno.get(i).getPrecoVenda()),
                String.valueOf(retorno.get(i).getQuantidade()),
                retorno.get(i).getCategoria()});
        }
        return listaProdutos;

    }
    
    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> p = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < p.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(p.get(i).getCodigoProduto()),
                p.get(i).getDescricaoProduto(),
                String.valueOf(p.get(i).getQuantidadeProduto()),
                String.valueOf(p.get(i).getValorUni()),
                String.valueOf(p.get(i).getCategoriaProduto())});
        }

        return listaProdutos;

    }
*/
    
}
