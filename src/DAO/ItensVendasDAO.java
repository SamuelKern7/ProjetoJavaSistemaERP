package DAO;

import Entidade.ItensVendas;
import Entidade.Produto;
import apoio.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ItensVendasDAO {
   
     private Connection conn;
    
    public ItensVendasDAO(){
        this.conn = new ConexaoBD().getConnection();  
    } 
    
     public void salvar(ItensVendas obj) {

         try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

                String sql = "INSERT INTO tb_itensvendas (venda_id, produto_id, qtd, subtotal) VALUES ("
                    + "'" + obj.getVendas().getId() + "', "
                    + "'" + obj.getProduto().getId() + "', "
                    + "'" + obj.getQtd() + "', "
                    + "'" + obj.getSubtotal() + "'"
                    + ")";
            
             
            System.out.println("SQL: " + sql);
            
            int retorno = st.executeUpdate(sql);
             System.out.println("id+" + retorno);
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir cliente: " + e);
        }
    }
    
    
   public List<ItensVendas> listaItens(int venda_id) {
    try {
        List<ItensVendas> lista = new ArrayList<>();
        String sql = "SELECT p.id, p.descricao, i.qtd, p.preco, i.subtotal FROM tb_itensvendas AS i " +
                     "INNER JOIN tb_produtos AS p ON (i.produto_id = p.id) WHERE i.venda_id = ?";
        
        PreparedStatement st = ConexaoBD.getInstance().getConnection().prepareStatement(sql);
        st.setInt(1, venda_id);
        
        ResultSet rs = st.executeQuery();
        
        while (rs.next()) {
            ItensVendas iv = new ItensVendas();
            Produto p = new Produto();
            
            p.setId(rs.getInt("id"));  // Usar nome simples da coluna
            p.setDescricao(rs.getString("descricao"));  // Usar nome simples da coluna
            p.setPreco(rs.getDouble("preco"));  // Usar nome simples da coluna
            
            iv.setProduto(p);
            iv.setQtd(rs.getInt("qtd"));  // Usar nome simples da coluna
            iv.setSubtotal(rs.getDouble("subtotal"));  // Usar nome simples da coluna
            
            lista.add(iv);
        }
        
        rs.close();
        st.close();
        return lista;
        
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao listar itens da venda: " + e.getMessage());
    }
}

    
}
