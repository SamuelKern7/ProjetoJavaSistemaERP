package apoio;


import java.sql.*;
import java.sql.DriverManager;


public class ConexaoBD {

    private static ConexaoBD instancia = null;
    private Connection conexao = null;

    public ConexaoBD() {  //conexao ao banco de dados

        try {
                String dbdriver = "org.postgresql.Driver";
                String dburl = "jdbc:postgresql://localhost:..../.....";
                String dbuser = "";
                String dbsenha = "";

                //carregar driver banco de dados
                Class.forName(dbdriver);

                if (dbuser.length() != 0) // conexao usuario e senha
                {
                    conexao = DriverManager.getConnection(dburl, dbuser, dbsenha);
                } else // conexao sem usuario e senha
                {
                    conexao = DriverManager.getConnection(dburl);
                }

              }  catch (Exception e) {
                      System.err.println(e);
                      }
            }

            //retorna instancia
            public static ConexaoBD getInstance() {

                if (instancia == null) {
                    instancia = new ConexaoBD();
                }
                return instancia;
            }

            //retorna conexao
            public Connection getConnection() {

                if (conexao == null) {
                    throw new RuntimeException("conexao==null");
                }
                return conexao;
            }

            //efetua fechamento da conexao
            public void ShutDown() {

                try {
                    conexao.close();
                    instancia = null;
                    conexao = null;
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
}
