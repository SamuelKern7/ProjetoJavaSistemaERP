package DAO;

import Entidade.Funcionarios;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import apoio.ConexaoBD;
import apoio.IDAOT;
import java.awt.Component;

public class FuncionariosDAO implements IDAOT <Funcionarios> {

    @Override
    public String salvar(Funcionarios o) {
         try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            // Hash da senha usando SHA-1
            String hashedPassword = hashSHA1(o.getSenha());
            o.setSenha(hashedPassword);

//            String sql = "INSERT INTO tb_funcionarios "
//                    + "(nome, rg, cpf, email, senha, cargo, nivel_acesso, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado) "
//                    + "VALUES ("
//                    + "'" + o.getNome() + "', "
//                    + "'" + o.getRg() + "', "
//                    + "'" + o.getCpf() + "', "
//                    + "'" + o.getEmail() + "', "
//                    + "'" + o.getSenha() + "', "
//                    + "'" + o.getCargo() + "', "
//                    + "'" + o.getNivel_acesso() + "', "
//                    + "'" + o.getTelefone() + "', "
//                    + "'" + o.getCelular() + "', "
//                    + "'" + o.getCep() + "', "
//                    + "'" + o.getEndereco() + "', "
//                    + o.getNumero() + ", "
//                    + "'" + o.getComplemento() + "', "
//                    + "'" + o.getBairro() + "', "
//                    + "'" + o.getCidade() + "', "
//                    + "'" + o.getEstado() + "'"
//                    + ")";
//            
            String sql = "INSERT INTO tb_funcionarios "
                    + "(nome, rg, cpf, email, cargo, nivel_acesso, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado) "
                    + "VALUES ("
                    + "'" + o.getNome() + "', "
                    + "'" + o.getRg() + "', "
                    + "'" + o.getCpf() + "', "
                    + "'" + o.getEmail() + "', "
                    //+ "'" + o.getSenha() + "', "
                    + "'" + o.getCargo() + "', "
                    + "'" + o.getNivel_acesso() + "', "
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
            System.out.println("Erro ao inserir funcionário: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Funcionarios o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

//             if (!o.getSenha().isEmpty()) {
//                String hashedPassword = hashSHA1(o.getSenha());
//                o.setSenha(hashedPassword);} 
            
            
                String sql = "UPDATE tb_funcionarios SET "
                    + "nome = '" + o.getNome() + "', "
                    + "rg = '" + o.getRg() + "', "
                    + "cpf = '" + o.getCpf() + "', "
                    + "email = '" + o.getEmail() + "', "
                    //+ "senha = '" + o.getSenha()+ "', "
                    + "cargo = '" + o.getCargo()+ "', "    
                    + "nivel_acesso = '" + o.getNivel_acesso()+ "', "    
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
            System.out.println("Erro ao atualizar funcionario: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "delete from tb_funcionarios "
                    + "where id = " + id;

            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir funcionario: " + e);
            return e.toString();
        }

    }

    @Override
    public ArrayList<Funcionarios> consultarTodos() {

        ArrayList<Funcionarios> Cl = new ArrayList();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "select * "
                    + "from tb_funcionarios "
                    + "order by nome";

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Funcionarios cl = new Funcionarios();

                cl.setId(retorno.getInt("id"));
                cl.setNome(retorno.getString("nome"));
                cl.setRg(retorno.getString("rg"));
                cl.setCpf(retorno.getString("cpf"));
                cl.setEmail(retorno.getString("email"));
                cl.setSenha(retorno.getString("senha"));
                cl.setCargo(retorno.getString("cargo"));
                cl.setNivel_acesso(retorno.getString("nivel_acesso"));
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
            System.out.println("Erro ao consultar funcionarios: " + e);
        }
        ArrayList<Funcionarios> cl;

        return Cl;
    }

    @Override
    public ArrayList<Funcionarios> consultar(String criterio) {
      throw new UnsupportedOperationException("Not supported yet."); 
    }
  
    public Funcionarios consultarId (int id) {

        Funcionarios a1 = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "select * "
                    + "from tb_funcionarios "
                    + "where id = " + id;

            System.out.println("SQL: " + sql);

            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                a1 = new Funcionarios();

                a1.setId(retorno.getInt("id"));
                a1.setNome(retorno.getString("nome"));
                a1.setRg(retorno.getString("rg"));
                a1.setCpf(retorno.getString("cpf"));
                a1.setEmail(retorno.getString("email"));
                //a1.setSenha(retorno.getString("senha"));
                a1.setCargo(retorno.getString("cargo"));
                a1.setNivel_acesso(retorno.getString("nivel_acesso"));
                a1.setTelefone(retorno.getString("telefone"));
                a1.setCelular(retorno.getString("celular"));
                a1.setCep(retorno.getString("cep"));
                a1.setEndereco(retorno.getString("endereco"));
                a1.setNumero(retorno.getInt(Integer.SIZE));
                a1.setComplemento(retorno.getString("complemento"));
                a1.setBairro(retorno.getString("bairro"));
                a1.setCidade(retorno.getString("cidade"));
                a1.setEstado(retorno.getString("estado"));
                        
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar funcionarios: " + e);
    }

        return a1;
    }

    public void popularTabela(JTable tabela, String criterio) {

        ResultSet resultadoQ;

        // dados da tabela
        Object[][] dadosTabela = null;

          Object[] cabecalho = new Object[16];
        cabecalho[0] = "Id";
        cabecalho[1] = "nome";
        cabecalho[2] = "rg";
        cabecalho[3] = "cpf";
        cabecalho[4] = "email";
        cabecalho[5] = "cargo";
        cabecalho[6] = "nivel_acesso";
        cabecalho[7] = "telefone";
        cabecalho[8] = "celular";
        cabecalho[9] = "cep";
        cabecalho[10] = "endereco";
        cabecalho[11] = "numero";
        cabecalho[12] = "complemento";
        cabecalho[13] = "bairro";
        cabecalho[14] = "cidade";
        cabecalho[15] = "estado";
        
        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM tb_funcionarios "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][16];

        } catch (Exception e) {
            System.out.println("Erro ao consultar tb_funcionarios: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM tb_funcionarios "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%' "
                    + "ORDER BY nome");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("rg");
                dadosTabela[lin][3] = resultadoQ.getString("cpf");
                dadosTabela[lin][4] = resultadoQ.getString("email");
                dadosTabela[lin][5] = resultadoQ.getString("cargo");
                dadosTabela[lin][6] = resultadoQ.getString("nivel_acesso");
                dadosTabela[lin][7] = resultadoQ.getString("telefone");
                dadosTabela[lin][8] = resultadoQ.getString("celular");
                dadosTabela[lin][9] = resultadoQ.getString("cep");
                dadosTabela[lin][10] = resultadoQ.getString("endereco");
                dadosTabela[lin][11] = resultadoQ.getInt("numero");
                dadosTabela[lin][12] = resultadoQ.getString("complemento");
                dadosTabela[lin][13] = resultadoQ.getString("bairro");
                dadosTabela[lin][14] = resultadoQ.getString("cidade");
                dadosTabela[lin][15] = resultadoQ.getString("estado");
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

                if (column == 17) {
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
                    column.setPreferredWidth(18);
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
    
    public Funcionarios consultarPorDescricao(String nome) {
         Funcionarios f1 = null;

    try {
        String sql = "SELECT * FROM tb_funcionarios WHERE nome LIKE ?";
        
        PreparedStatement pst = ConexaoBD.getInstance().getConnection().prepareStatement(sql);
        pst.setString(1, "%" + nome + "%");

        System.out.println("SQL: " + pst);

        ResultSet retorno = pst.executeQuery();

        while (retorno.next()) {
            f1 = new Funcionarios();

            f1.setId(retorno.getInt("id"));
            f1.setNome(retorno.getString("nome"));
            f1.setRg(retorno.getString("rg"));
            f1.setCpf(retorno.getString("cpf"));
            f1.setCargo(retorno.getString("cargo"));
            f1.setEmail(retorno.getString("email"));
            f1.setTelefone(retorno.getString("telefone"));
            f1.setCelular(retorno.getString("celular"));
            f1.setCep(retorno.getString("cep"));
            f1.setEndereco(retorno.getString("endereco"));
            f1.setNumero(retorno.getInt("numero"));
            f1.setComplemento(retorno.getString("complemento"));
            f1.setBairro(retorno.getString("bairro"));
            f1.setCidade(retorno.getString("cidade"));
            f1.setEstado(retorno.getString("estado"));
        }

        if (f1 == null) {
            System.out.println("Cliente não encontrado com o nome: " + nome);
        }

    } catch (Exception e) {
        System.out.println("Erro ao consultar Cliente: " + e);    
    }

    return f1;
    
    }
    
    public boolean autenticar(Funcionarios o) {
        try {
            String sql = "SELECT email, senha FROM tb_funcionarios WHERE email = ? AND senha = ?";
            
           
            String hashedPassword = hashSHA1(o.getSenha());
            
            System.out.println("Hash SHA-1 da senha: " + hashedPassword);
            
            Connection connection = ConexaoBD.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, o.getEmail());
            preparedStatement.setString(2, hashedPassword);

            System.out.println("SQL: " + preparedStatement.toString());

            ResultSet resultadoQ = preparedStatement.executeQuery();
            
            if (resultadoQ.next()) {
                System.out.println("Usuario correto! ");
                return true;
            } else {
                System.out.println("Usuario incorreto! ");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro ao autenticar usuário: " + e);
            return false;
        }
    }

    private String hashSHA1(String input) {
        try {
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
            byte[] inputBytes = input.getBytes();
            byte[] hashedBytes = sha1.digest(inputBytes);

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao calcular hash SHA-1", e);
        }
    }
        
    public String salvarsenha(Funcionarios o){
    
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            // Hash da senha usando SHA-1
            String hashedPassword = hashSHA1(o.getSenha());
            o.setSenha(hashedPassword);
            
            String sql = "INSERT INTO tb_funcionarios "
                    + "(senha) "
                    + "VALUES ("
                    + "'" + o.getSenha() + "'"
                    + ")";

            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao inserir funcionário: " + e);
            return e.toString();
        }
    
    }  
    public String atualizarsenha(Funcionarios o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

             if (!o.getSenha().isEmpty()) {
                String hashedPassword = hashSHA1(o.getSenha());
                o.setSenha(hashedPassword);} 
            
            
                String sql = "UPDATE tb_funcionarios SET "
                   
                    + "senha = '" + o.getSenha()+ "'"
                    
                    + "WHERE id = " + o.getId();
             
            System.out.println("SQL: " + sql);

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar senha: " + e);
            return e.toString();
        }
    }
    
}
