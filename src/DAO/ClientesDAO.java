package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import Entidade.Clientes;
import java.awt.Component;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class ClientesDAO implements IDAOT <Clientes> {

    @Override
    public String salvar(Clientes o) {
        // exemplo de insercao
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO tb_clientes "
                    + "(nome, rg, cpf, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado) "
                    + "VALUES ("
                    + "'" + o.getNome() + "', "
                    + "'" + o.getRg() + "', "
                    + "'" + o.getCpf() + "', "
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
            System.out.println("Erro ao inserir cliente: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Clientes o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

                String sql = "UPDATE tb_clientes SET "
                    + "nome = '" + o.getNome() + "', "
                    + "rg = '" + o.getRg() + "', "
                    + "cpf = '" + o.getCpf() + "', "
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
            System.out.println("Erro ao atualizar cliente: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "delete from tb_clientes "
                    + "where id = " + id;

            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir cliente: " + e);
            return e.toString();
        }

    }

    @Override
    public ArrayList<Clientes> consultarTodos() {

        ArrayList<Clientes> Cl = new ArrayList();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "select * "
                    + "from tb_clientes "
                    + "order by nome";

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Clientes cl = new Clientes();

                cl.setId(retorno.getInt("id"));
                cl.setNome(retorno.getString("nome"));
                cl.setRg(retorno.getString("rg"));
                cl.setCpf(retorno.getString("cpf"));
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
            System.out.println("Erro ao consultar clientes: " + e);
        }

        return Cl;
    }

    @Override
    public ArrayList<Clientes> consultar(String name) {
          throw new UnsupportedOperationException("Not supported yet.");  
    }     

    @Override
    public Clientes consultarId(int id) {

        Clientes clientes = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "select * "
                    + "from tb_clientes "
                    + "where id = " + id;

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                clientes = new Clientes();

                clientes.setId(retorno.getInt("id"));
                clientes.setNome(retorno.getString("nome"));
                clientes.setRg(retorno.getString("rg"));
                clientes.setCpf(retorno.getString("cpf"));
                clientes.setEmail(retorno.getString("email"));
                clientes.setTelefone(retorno.getString("telefone"));
                clientes.setCelular(retorno.getString("celular"));
                clientes.setCep(retorno.getString("cep"));
                clientes.setEndereco(retorno.getString("endereco"));
                clientes.setNumero(retorno.getInt("numero"));
                clientes.setComplemento(retorno.getString("complemento"));
                clientes.setBairro(retorno.getString("bairro"));
                clientes.setCidade(retorno.getString("cidade"));
                clientes.setEstado(retorno.getString("estado"));
                        
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Cliente: " + e);
    }

        return clientes;
    }

    public void popularTabela(JTable tabela, String criterio) {

        ResultSet resultadoQ;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[14];
        cabecalho[0] = "Id";
        cabecalho[1] = "nome";
        cabecalho[2] = "rg";
        cabecalho[3] = "cpf";
        cabecalho[4] = "email";
        cabecalho[5] = "telefone";
        cabecalho[6] = "celular";
        cabecalho[7] = "cep";
        cabecalho[8] = "endereco";
        cabecalho[9] = "numero";
        cabecalho[10] = "complemento";
        cabecalho[11] = "bairro";
        cabecalho[12] = "cidade";
        cabecalho[13] = "estado";
        
        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM tb_clientes "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][14];

        } catch (Exception e) {
            System.out.println("Erro ao consultar tb_clientes: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM tb_clientes "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%' "
                    + "ORDER BY nome");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("rg");
                dadosTabela[lin][3] = resultadoQ.getString("cpf");
                dadosTabela[lin][4] = resultadoQ.getString("email");
                dadosTabela[lin][5] = resultadoQ.getString("telefone");
                dadosTabela[lin][6] = resultadoQ.getString("celular");
                dadosTabela[lin][7] = resultadoQ.getString("cep");
                dadosTabela[lin][8] = resultadoQ.getString("endereco");
                dadosTabela[lin][9] = resultadoQ.getInt("numero");
                dadosTabela[lin][10] = resultadoQ.getString("complemento");
                dadosTabela[lin][11] = resultadoQ.getString("bairro");
                dadosTabela[lin][12] = resultadoQ.getString("cidade");
                dadosTabela[lin][13] = resultadoQ.getString("estado");
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
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

                if (column == 14) {
//                    return ImageIcon.class;
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
                    column.setPreferredWidth(17);
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
  
    public Clientes consultarcpf(String cpf) {

        Clientes clientes = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM tb_clientes WHERE cpf = '" + cpf + "'";

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                clientes = new Clientes();

                clientes.setId(retorno.getInt("id"));
                clientes.setNome(retorno.getString("nome"));
                clientes.setRg(retorno.getString("rg"));
                clientes.setCpf(retorno.getString("cpf"));
                clientes.setEmail(retorno.getString("email"));
                clientes.setTelefone(retorno.getString("telefone"));
                clientes.setCelular(retorno.getString("celular"));
                clientes.setCep(retorno.getString("cep"));
                clientes.setEndereco(retorno.getString("endereco"));
                clientes.setNumero(retorno.getInt("numero"));
                clientes.setComplemento(retorno.getString("complemento"));
                clientes.setBairro(retorno.getString("bairro"));
                clientes.setCidade(retorno.getString("cidade"));
                clientes.setEstado(retorno.getString("estado"));
                        
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Cliente: " + e);
    }

        return clientes;
    }

     public Clientes consultarnome(String nome) {

        Clientes clientes = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "select * "
                    + "from tb_clientes "
                    + "where nome = " + nome;

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                clientes = new Clientes();

                clientes.setId(retorno.getInt("id"));
                clientes.setNome(retorno.getString("nome"));
                clientes.setRg(retorno.getString("rg"));
                clientes.setCpf(retorno.getString("cpf"));
                clientes.setEmail(retorno.getString("email"));
                clientes.setTelefone(retorno.getString("telefone"));
                clientes.setCelular(retorno.getString("celular"));
                clientes.setCep(retorno.getString("cep"));
                clientes.setEndereco(retorno.getString("endereco"));
                clientes.setNumero(retorno.getInt("numero"));
                clientes.setComplemento(retorno.getString("complemento"));
                clientes.setBairro(retorno.getString("bairro"));
                clientes.setCidade(retorno.getString("cidade"));
                clientes.setEstado(retorno.getString("estado"));
                        
            }

        } catch (Exception e) {
            System.out.println("erro na tabela consultarnome == " + e);
    }

        return clientes;
    }
}
