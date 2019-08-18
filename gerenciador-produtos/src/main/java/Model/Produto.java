package Model;

/**
 *
 * @author gabrielavsmarques
 */
public class Produto {
    
    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private double precoCompra;
    private double precoVenda; 
    private int quantidade;
    private boolean disponivel;
    private String categoria;
    private String dataCadastro;

    public Produto(){
    }
    
    public Produto(int idProduto, String nomeProduto, String descricaoProduto, double precoCompra, double precoVenda, int quantidade, boolean disponivel, String categoria, String dataCadastro) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
        this.disponivel = disponivel;
        this.categoria = categoria;
        this.dataCadastro = dataCadastro;
        
    }
    
    public Produto( String nomeProduto, String descricaoProduto, double precoCompra, double precoVenda, int quantidade, boolean disponivel, String categoria, String dataCadastro) {
    
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
        this.disponivel = disponivel;
        this.categoria = categoria;
        this.dataCadastro = dataCadastro;
        
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getdataCadastro() {
        return dataCadastro;
    }

    public void setdataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
}
