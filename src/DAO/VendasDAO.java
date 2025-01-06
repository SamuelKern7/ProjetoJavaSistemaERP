package DAO;

import Entidade.Clientes;
import Entidade.Vendas;
import apoio.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.time.LocalDate;


public class VendasDAO {
    
    private Connection conn;
    
    public VendasDAO(){
        this.conn = new ConexaoBD().getConnection();  
    } 
    
    public void salvar(Vendas obj) {
       
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            
            String sql = "INSERT INTO tb_vendas (cliente_id, data_venda, total, observacoes) "
                       + "VALUES ("
                    + "'" + obj.getClientes().getId() + "', "
                    + "'" + obj.getData_venda() + "', "
                    + "'" + obj.getTotal_venda() + "', "
                    + "'" + obj.getObservacoes() + "'"
                    + ")";
            
             
            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao inserir cliente: " + e);
        }
    }
    
    
    public int retornaUltimoIdVenda(){
    
        try {
        int ultimoid = 0;
        String sql = "SELECT id FROM tb_vendas ORDER BY data_venda DESC LIMIT 1";
        
        PreparedStatement st = conn.prepareStatement(sql); 
        ResultSet rs = st.executeQuery();
        while(rs.next()){
        Vendas v = new Vendas();
        v.setId(rs.getInt("id"));
        ultimoid = v.getId();
        
        
        }
        return ultimoid;
            
            
        } catch (Exception e) {
        throw new RuntimeException("Erro ao retornar o ultimo ID da venda!");
        }
    }
   
    public List<Vendas> historicovendas(LocalDate data_inicio, LocalDate data_fim) {
    try {
        List<Vendas> lista = new ArrayList<>();
        String sql = "SELECT v.id, c.nome, to_char(v.data_venda, 'DD/MM/YYYY') AS data_formatada, v.total, v.observacoes " +
                     "FROM tb_vendas v INNER JOIN tb_clientes c ON v.cliente_id = c.id " +
                     "WHERE v.data_venda BETWEEN ? AND ?";

        PreparedStatement st = ConexaoBD.getInstance().getConnection().prepareStatement(sql);

        //parâmetros para Date
        st.setDate(1, java.sql.Date.valueOf(data_inicio));
        st.setDate(2, java.sql.Date.valueOf(data_fim));

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Vendas v = new Vendas();
            Clientes c = new Clientes();

            v.setId(rs.getInt("id"));
            c.setNome(rs.getString("nome"));
            v.setClientes(c);
            v.setData_venda(rs.getString("data_formatada")); 
            v.setTotal_venda(rs.getDouble("total"));
            v.setObservacoes(rs.getString("observacoes"));

            lista.add(v);
        }

        return lista;
    } catch (Exception e) {
        throw new RuntimeException("Erro" + e.getMessage());
    }
}

    
    
    
}
