
package Entidade;

public class Produto {
    
    int id;
    private String descricao;
    private double preco;
    private int qtd_estoque;
    private Fornecedores fonecedores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public Fornecedores getFonecedores() {
        return fonecedores;
    }

    public void setFonecedores(Fornecedores fonecedores) {
        this.fonecedores = fonecedores;
    }

   
}
