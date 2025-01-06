package DAO;

import Entidade.Fornecedores;
import apoio.ConexaoBD;
import apoio.IDAOT;
import Entidade.Produto;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ProdutoDAO implements IDAOT<Produto> {
  private Connection conn;
    
    public ProdutoDAO(){
        this.conn = new ConexaoBD().getConnection();  
    }
    
    
    @Override
    public String salvar(Produto o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO tb_produtos (descricao, preco, qtd_estoque, for_id) VALUES ('" 
                    + o.getDescricao() + "', '" 
                    + o.getPreco() + "', '" 
                    + o.getQtd_estoque() + "', '" 
                    + o.getFonecedores().getId() + "')";

            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        //JOptionPane.showMessageDialog(null, "Produto Salvo com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir produto: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Produto produto) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE tb_produtos SET " +
                    "descricao = '" + produto.getDescricao() + "', " +
                    "preco = " + produto.getPreco() + ", " +
                    "qtd_estoque = " + produto.getQtd_estoque()+ ", " +
                    "for_id = " + produto.getFonecedores().getId() + " " +
                    "WHERE id = " + produto.getId();

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            if (resultado == 0) {
                return "Erro ao atualizar produto: Nenhum registro foi atualizado";
            }
        } catch (Exception e) {
            return "Erro ao atualizar produto: " + e.getMessage();
        }

        return null;
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM tb_produtos WHERE id = " + id;

            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir produto: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Produto> consultarTodos() {
        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome AS fornecedor_nome " +
                    "FROM tb_produtos p " +
                    "INNER JOIN tb_fornecedores f ON p.for_id = f.id";
            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Produto produto = new Produto();
                Fornecedores fornecedor = new Fornecedores();

                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setPreco(retorno.getDouble("preco"));
                produto.setQtd_estoque(retorno.getInt("qtd_estoque"));
                fornecedor.setNome(retorno.getString("fornecedor_nome"));
                produto.setFonecedores(fornecedor);

                produtos.add(produto);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar produtos: " + e);
        }

        return produtos;
    }

    @Override
    public ArrayList<Produto> consultar(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Produto consultarId(int id) {
        Produto produto = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome AS fornecedor_nome " +
                    "FROM tb_produtos p " +
                    "INNER JOIN tb_fornecedores f ON p.for_id = f.id " +
                    "WHERE p.id = " + id;

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

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

    public void popularTabela(JTable tabela, String criterio) {
    ResultSet resultadoQ = null;

    Object[][] dadosTabela = null;

    Object[] cabecalho = new Object[]{"Id", "Descrição", "Preço", "Qtd. Estoque", "Fornecedor"};

    try {
        // Consulta para obter o número de linhas
        String countQuery = "SELECT count(*) " +
                            "FROM tb_produtos p " +
                            "JOIN tb_fornecedores f ON p.for_id = f.id " +
                            "WHERE p.descricao ILIKE ?";

        PreparedStatement countStmt = ConexaoBD.getInstance().getConnection().prepareStatement(countQuery);
        countStmt.setString(1, "%" + criterio + "%");
        resultadoQ = countStmt.executeQuery();

        if (resultadoQ.next()) {
            dadosTabela = new Object[resultadoQ.getInt(1)][5];
        }

    } catch (SQLException e) {
        System.out.println("Erro ao consultar tb_produtos (contagem): " + e);
    } finally {
        try {
            if (resultadoQ != null) resultadoQ.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    int lin = 0;

    try {
        // Consulta para obter os dados
        String dataQuery = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome AS fornecedor_nome " +
                            "FROM tb_produtos p " +
                            "JOIN tb_fornecedores f ON p.for_id = f.id " +
                            "WHERE p.descricao ILIKE ? " +
                            "ORDER BY p.descricao";

        PreparedStatement dataStmt = ConexaoBD.getInstance().getConnection().prepareStatement(dataQuery);
        dataStmt.setString(1, "%" + criterio + "%");
        resultadoQ = dataStmt.executeQuery();

        while (resultadoQ.next()) {
            dadosTabela[lin][0] = resultadoQ.getInt("id");
            dadosTabela[lin][1] = resultadoQ.getString("descricao");
            dadosTabela[lin][2] = resultadoQ.getDouble("preco");
            dadosTabela[lin][3] = resultadoQ.getInt("qtd_estoque");
            dadosTabela[lin][4] = resultadoQ.getString("fornecedor_nome");
            lin++;
        }

    } catch (SQLException e) {
        System.out.println("Problemas para popular tabela: " + e);
    } finally {
        try {
            if (resultadoQ != null) resultadoQ.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Configura o modelo da tabela
    tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return Object.class;
        }
    });

    tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Ajusta as larguras das colunas
    TableColumn column;
    for (int i = 0; i < tabela.getColumnCount(); i++) {
        column = tabela.getColumnModel().getColumn(i);
        switch (i) {
            case 0:
                column.setPreferredWidth(30); 
                break;
            case 1:
                column.setPreferredWidth(200); 
                break;
            case 2:
                column.setPreferredWidth(80); 
                break;
            case 3:
                column.setPreferredWidth(80); 
                break;
            case 4:
                column.setPreferredWidth(150);
                break;
        }
    }
}


    public void adicionarEstoque(Produto o, int qtd_nova, int id) {
        String sql = "UPDATE tb_produtos SET qtd_estoque = ?, for_id = ? WHERE id = ?";

        try (Connection conn = ConexaoBD.getInstance().getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            int novaQuantidade = o.getQtd_estoque() + qtd_nova;

            pst.setInt(1, novaQuantidade);
            pst.setInt(2, o.getFonecedores().getId());
            pst.setInt(3, id);

            System.out.println("SQL: " + pst);

            int retorno = pst.executeUpdate();

            if (retorno > 0) {
                System.out.println("Estoque atualizado com sucesso.");
            } else {
                System.out.println("Nenhum produto foi atualizado.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }
    
    public Produto consultarPorDescricao(String descricao) {
        Produto produto = null;

        try {
            
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

    public void Adicioanrestoque(int id, int qtd_nova) throws SQLException {
     try {
        String sql = "UPDATE tb_produtos SET qtd_estoque = ? WHERE id = ?";
        System.out.println("Script: " + sql);

        PreparedStatement pst = ConexaoBD.getInstance().getConnection().prepareStatement(sql);
        pst.setInt(1, qtd_nova); 
        pst.setInt(2, id); 
        pst.execute();
        pst.close();
 
        JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
     } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao adicionar itens ao estoque!" + e);
     }
}

    public void Baixaestoque(int id, int qtd_nova) throws SQLException{
        
         try{
        
        String sql = "Update tb_produtos set qtd_estoque=? where id=?";
         System.out.println("Script " + sql);
        
         PreparedStatement pst = ConexaoBD.getInstance().getConnection().prepareStatement(sql);
        pst.setInt(1, qtd_nova); 
        pst.setInt(2, id);
        pst.execute();
        pst.close();
           JOptionPane.showMessageDialog(null, "Item removido do estoque!");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro ao remover itens ao estoque!" + e);
        
        }
        
        
    }
   
    public int retornaQtdAtualEstoque(int id) {
    try {
        int qtd_atual_estoque = 0;
        String sql = "SELECT qtd_estoque FROM tb_produtos WHERE id = ?";
        
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        
        if (rs.next()) {
            qtd_atual_estoque = rs.getInt("qtd_estoque");
        }
        
        return qtd_atual_estoque;
    } catch (Exception e) {
        throw new RuntimeException("Erro ao retornar quantidade atual em estoque: " + e.getMessage());
    }
}
   
}
