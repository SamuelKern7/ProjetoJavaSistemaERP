package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import Entidade.Fornecedores;
import java.awt.Component;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.sql.PreparedStatement;



public class FornecedoresDAO implements IDAOT <Fornecedores> {

    @Override
    public String salvar(Fornecedores o) {
        //insercao
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO tb_fornecedores "
                    + "(nome, cnpj, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado) "
                    + "VALUES ("
                    + "'" + o.getNome() + "', "
                    + "'" + o.getCnpj() + "', "
                    + "'" + o.getEmail() + "', "
                    + "'" + o.getTelefone() + "', "
                    + "'" + o.getCelular() + "', "
                    + "'" + o.getCep() + "', "
                    + "'" + o.getEndereco() + "', "
                    + o.getNumero() + ", "
                    + "'" + o.getComplemento() + "', "
                    + "'" + o.getBairro() + "', "
                    + "'" + o.getCidade() + "', "
                    + "'" + o.getEstado() + "'"
                    + ")";
            
             
            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao inserir Fornecedor: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Fornecedores o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

                String sql = "UPDATE tb_fornecedores SET "
                    + "nome = '" + o.getNome() + "', "
                    + "cnpj = '" + o.getCnpj() + "', "
                    + "email = '" + o.getEmail() + "', "
                    + "telefone = '" + o.getTelefone() + "', "
                    + "celular = '" + o.getCelular() + "', "
                    + "cep = '" + o.getCep() + "', "
                    + "endereco = '" + o.getEndereco() + "', "
                    + "numero = " + o.getNumero() + ", "
                    + "complemento = '" + o.getComplemento() + "', "
                    + "bairro = '" + o.getBairro() + "', "
                    + "cidade = '" + o.getCidade() + "', "
                    + "estado = '" + o.getEstado() + "' "
                    + "WHERE id = " + o.getId();
             
            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar fornecedor: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "delete from tb_fornecedores "
                    + "where id = " + id;

            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir forneceder: " + e);
            return e.toString();
        }

    }

    @Override
    public ArrayList<Fornecedores> consultarTodos() {

        ArrayList<Fornecedores> Cl = new ArrayList();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "select * "
                    + "from tb_fornecedores "
                    + "order by nome";

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Fornecedores cl = new Fornecedores();

                cl.setId(retorno.getInt("id"));
                cl.setNome(retorno.getString("nome"));
                cl.setCnpj(retorno.getString("cnpj"));
                cl.setEmail(retorno.getString("email"));
                cl.setTelefone(retorno.getString("telefone"));
                cl.setCelular(retorno.getString("celular"));
                cl.setCep(retorno.getString("cep"));
                cl.setEndereco(retorno.getString("endereco"));
                cl.setNumero(retorno.getInt(Integer.SIZE));
                cl.setComplemento(retorno.getString("complemento"));
                cl.setBairro(retorno.getString("bairro"));
                cl.setCidade(retorno.getString("cidade"));
                cl.setEstado(retorno.getString("estado"));
                
                
                
                
                        
                 Cl.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar fornecedores: " + e);
        }

        return Cl;
    }

    @Override
    public ArrayList<Fornecedores> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); 
        
    }

    @Override
    public Fornecedores consultarId(int id) {

        Fornecedores cao = null;

    try {
        Statement st = ConexaoBD.getInstance().getConnection().createStatement();

        String sql = "SELECT * FROM tb_fornecedores WHERE id = " + id;

        System.out.println("SQL: " + sql);

        ResultSet retorno = st.executeQuery(sql);

        if (retorno.next()) {
            cao = new Fornecedores();

            cao.setId(retorno.getInt("id"));
            cao.setNome(retorno.getString("nome"));
            cao.setCnpj(retorno.getString("cnpj"));
            cao.setEmail(retorno.getString("email"));
            cao.setTelefone(retorno.getString("telefone"));
            cao.setCelular(retorno.getString("celular"));
            cao.setCep(retorno.getString("cep"));
            cao.setEndereco(retorno.getString("endereco"));
            cao.setNumero(retorno.getInt("numero"));
            cao.setComplemento(retorno.getString("complemento"));
            cao.setBairro(retorno.getString("bairro"));
            cao.setCidade(retorno.getString("cidade"));
            cao.setEstado(retorno.getString("estado"));

            
        } else {
            System.out.println("Fornecedor não encontrado com ID: " + id);
        }

    } catch (Exception e) {
        System.out.println("Erro ao consultar Fornecedor: " + e);
    }

    return cao;
    }

    public void popularTabela(JTable tabela, String criterio) {

        ResultSet resultadoQ;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[13];
        cabecalho[0] = "Id";
        cabecalho[1] = "nome";
        cabecalho[2] = "cnpj";
        cabecalho[3] = "email";
        cabecalho[4] = "telefone";
        cabecalho[5] = "celular";
        cabecalho[6] = "cep";
        cabecalho[7] = "endereco";
        cabecalho[8] = "numero";
        cabecalho[9] = "complemento";
        cabecalho[10] = "bairro";
        cabecalho[11] = "cidade";
        cabecalho[12] = "estado";
        
        // cria matriz de acordo com nº de registros da tabela
        try {
             resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM tb_fornecedores "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%' "
                    + "ORDER BY nome");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][13];

        } catch (Exception e) {
            System.out.println("Erro ao consultar tb_fornecedores: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM tb_fornecedores "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%' "
                    + "ORDER BY nome");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("cnpj");
                dadosTabela[lin][3] = resultadoQ.getString("email");
                dadosTabela[lin][4] = resultadoQ.getString("telefone");
                dadosTabela[lin][5] = resultadoQ.getString("celular");
                dadosTabela[lin][6] = resultadoQ.getString("cep");
                dadosTabela[lin][7] = resultadoQ.getString("endereco");
                dadosTabela[lin][8] = resultadoQ.getInt("numero");
                dadosTabela[lin][9] = resultadoQ.getString("complemento");
                dadosTabela[lin][10] = resultadoQ.getString("bairro");
                dadosTabela[lin][11] = resultadoQ.getString("cidade");
                dadosTabela[lin][12] = resultadoQ.getString("estado");
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela fornecedores");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
               
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 13) {
                //return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite selecao de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(13);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;

            }
        }

    }
    
    public void LimparTela(JPanel container){
        
        Component components[] = container.getComponents();
        
        for(Component component: components){
            
           if(component instanceof JTextField){
            
           ((JTextField)component).setText(null);
       
           }
       }
        
    }
    
    public Fornecedores consultarPorDescricao(String nome) {
    Fornecedores fornecedor = null;

    try {
        String sql = "SELECT * FROM tb_funcionarios WHERE nome LIKE ?";
        PreparedStatement pst = ConexaoBD.getInstance().getConnection().prepareStatement(sql);
        pst.setString(1, "%" + nome + "%");

        System.out.println("SQL: " + pst.toString());

        ResultSet retorno = pst.executeQuery();

        if (retorno.next()) {
            fornecedor = new Fornecedores(); 

            fornecedor.setId(retorno.getInt("id"));
            fornecedor.setNome(retorno.getString("nome"));
            fornecedor.setCnpj(retorno.getString("cnpj"));
            fornecedor.setEmail(retorno.getString("email"));
            fornecedor.setTelefone(retorno.getString("telefone"));
            fornecedor.setCelular(retorno.getString("celular"));
            fornecedor.setCep(retorno.getString("cep"));
            fornecedor.setEndereco(retorno.getString("endereco"));
            fornecedor.setNumero(retorno.getInt("numero"));
            fornecedor.setComplemento(retorno.getString("complemento"));
            fornecedor.setBairro(retorno.getString("bairro"));
            fornecedor.setCidade(retorno.getString("cidade"));
            fornecedor.setEstado(retorno.getString("estado"));
        }

    } catch (Exception e) {
        System.out.println("Erro ao consultar fornecedor: " + e);
    }

    return fornecedor;
}

}
