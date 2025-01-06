package gestãodenegocio;

import Tela.Login;
import javax.swing.JOptionPane;
import apoio.ConexaoBD;
import java.sql.Connection;

public class GestãoDeNegocio {


    static Connection conexao = null;

    
    public static void main(String[] args) {
     
        conexao = ConexaoBD.getInstance().getConnection();
        
        if (conexao != null) {
             new Login().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no Banco de Dados!");
        }
    }
        
}

