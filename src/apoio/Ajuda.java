package apoio;

import Entidade.Fornecedores;
import Entidade.Produto;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ajuda {
  
    public Produto consultarPorDescricao(String descricao) {
        Produto produto = null;

        try {
            // Utilizando PreparedStatement para maior segurança
            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome AS fornecedor_nome " +
                         "FROM tb_produtos p " +
                         "INNER JOIN tb_fornecedores f ON p.for_id = f.id " +
                         "WHERE p.descricao LIKE ?";

            PreparedStatement pst = ConexaoBD.getInstance().getConnection().prepareStatement(sql);
            pst.setString(1, "%" + descricao + "%");

            System.out.println("SQL: " + pst.toString());

            ResultSet retorno = pst.executeQuery();

            if (retorno.next()) {
                produto = new Produto();
                Fornecedores fornecedor = new Fornecedores();

                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setPreco(retorno.getDouble("preco"));
                produto.setQtd_estoque(retorno.getInt("qtd_estoque"));
                fornecedor.setNome(retorno.getString("fornecedor_nome"));
                produto.setFonecedores(fornecedor);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar produto: " + e);
        }

        return produto;
    }

    public void LimparTela(JPanel container){
        
        Component components[] = container.getComponents();
        
        for(Component component: components){
            
           if(component instanceof JTextField){
            
           ((JTextField)component).setText(null);
       
           }
       }
        
    }

}
