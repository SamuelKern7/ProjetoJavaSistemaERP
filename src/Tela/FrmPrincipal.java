package Tela;

import apoio.ConexaoBD;
import apoio.PosicaoTela;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class FrmPrincipal extends javax.swing.JFrame {

   
    
    PosicaoTela form = new PosicaoTela();
    
     private Timer timer;
    
    public FrmPrincipal() {
         initComponents();

       setTitle("Gestão De Empresas");
        
       this.setExtendedState(MAXIMIZED_BOTH);
         
         
        // Inicia o Timer para atualizar a data e hora a cada segundo
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date agora = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy | HH:mm:ss");
                String dataFormatada = formato.format(agora);
                tffdata.setText(dataFormatada);
            }
        });
        timer.start();
      
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        ImageIcon icon = new ImageIcon(getClass().getResource("/ImgFundo/olaria.jpg"));
        Image image = icon.getImage();
        Desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(), getHeight(),this);

            }

        };
        jLabel3 = new javax.swing.JLabel();
        tffdata = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Cliente = new javax.swing.JMenu();
        Menu_Cadastro_Cliente = new javax.swing.JMenuItem();
        Menu_Consulta_Cliente = new javax.swing.JMenuItem();
        Menu_Fornecedores = new javax.swing.JMenu();
        Menu_Cadastro_Fornecedores = new javax.swing.JMenuItem();
        Menu_Consulta_Fornecedor = new javax.swing.JMenuItem();
        Menu_Funcionarios = new javax.swing.JMenu();
        M_Item_Cadastro_Funcionários = new javax.swing.JMenuItem();
        Menu_Consulta_Funcionarios = new javax.swing.JMenuItem();
        Menu_Produtos = new javax.swing.JMenu();
        Cadastro_produto = new javax.swing.JMenuItem();
        Consulta_Produto = new javax.swing.JMenuItem();
        Estoque = new javax.swing.JMenuItem();
        Menu_Vendas = new javax.swing.JMenu();
        FrenteDeCaixa = new javax.swing.JMenuItem();
        HistoricoDeVendas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Menu_Ajuda = new javax.swing.JMenu();
        Mtem_Ajuda_Sair = new javax.swing.JMenuItem();
        Mtem_Ajuda_Infosytm = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("By Samuel Kern");

        tffdata.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Desktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(tffdata, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addGap(0, 743, Short.MAX_VALUE)
                .addComponent(tffdata, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addComponent(tffdata, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel1.setText("jLabel1");

        Menu_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionarios_1.png"))); // NOI18N
        Menu_Cliente.setText("Cadastro Clientes");

        Menu_Cadastro_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cadastro-38.png"))); // NOI18N
        Menu_Cadastro_Cliente.setText("Cadastro_Cliente");
        Menu_Cadastro_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Cadastro_ClienteActionPerformed(evt);
            }
        });
        Menu_Cliente.add(Menu_Cadastro_Cliente);

        Menu_Consulta_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-histórico-38.png"))); // NOI18N
        Menu_Consulta_Cliente.setText("Consulta_Cliente");
        Menu_Consulta_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Consulta_ClienteActionPerformed(evt);
            }
        });
        Menu_Cliente.add(Menu_Consulta_Cliente);

        jMenuBar1.add(Menu_Cliente);

        Menu_Fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fornecedores_1.png"))); // NOI18N
        Menu_Fornecedores.setText("Fornecedores");

        Menu_Cadastro_Fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cadastro-38.png"))); // NOI18N
        Menu_Cadastro_Fornecedores.setText("Cadastro_Fornecedor");
        Menu_Cadastro_Fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Cadastro_FornecedoresActionPerformed(evt);
            }
        });
        Menu_Fornecedores.add(Menu_Cadastro_Fornecedores);

        Menu_Consulta_Fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-histórico-38.png"))); // NOI18N
        Menu_Consulta_Fornecedor.setText("Consulta_Fornecedor");
        Menu_Consulta_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Consulta_FornecedorActionPerformed(evt);
            }
        });
        Menu_Fornecedores.add(Menu_Consulta_Fornecedor);

        jMenuBar1.add(Menu_Fornecedores);

        Menu_Funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clientes_1.png"))); // NOI18N
        Menu_Funcionarios.setText("Funcionários");

        M_Item_Cadastro_Funcionários.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cadastro-38.png"))); // NOI18N
        M_Item_Cadastro_Funcionários.setText("Cadastro_Funcionário");
        M_Item_Cadastro_Funcionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Item_Cadastro_FuncionáriosActionPerformed(evt);
            }
        });
        Menu_Funcionarios.add(M_Item_Cadastro_Funcionários);

        Menu_Consulta_Funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-histórico-38.png"))); // NOI18N
        Menu_Consulta_Funcionarios.setText("Consulta_Funcionário");
        Menu_Consulta_Funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Consulta_FuncionariosActionPerformed(evt);
            }
        });
        Menu_Funcionarios.add(Menu_Consulta_Funcionarios);

        jMenuBar1.add(Menu_Funcionarios);

        Menu_Produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produtos.png"))); // NOI18N
        Menu_Produtos.setText("Produtos");

        Cadastro_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-caixa-38.png"))); // NOI18N
        Cadastro_produto.setText("Cadastro_Produto");
        Cadastro_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_produtoActionPerformed(evt);
            }
        });
        Menu_Produtos.add(Cadastro_produto);

        Consulta_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-histórico-38.png"))); // NOI18N
        Consulta_Produto.setText("Consulta_Produto");
        Consulta_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta_ProdutoActionPerformed(evt);
            }
        });
        Menu_Produtos.add(Consulta_Produto);

        Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-caixa-38.png"))); // NOI18N
        Estoque.setText("Ajuste de Estoque");
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });
        Menu_Produtos.add(Estoque);

        jMenuBar1.add(Menu_Produtos);

        Menu_Vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vendas_1.png"))); // NOI18N
        Menu_Vendas.setText("Vendas");

        FrenteDeCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-dinheiro-38.png"))); // NOI18N
        FrenteDeCaixa.setText("Frente de Caixa");
        FrenteDeCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrenteDeCaixaActionPerformed(evt);
            }
        });
        Menu_Vendas.add(FrenteDeCaixa);

        HistoricoDeVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-histórico-38.png"))); // NOI18N
        HistoricoDeVendas.setText("Histórico de vendas");
        HistoricoDeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoDeVendasActionPerformed(evt);
            }
        });
        Menu_Vendas.add(HistoricoDeVendas);

        jMenuBar1.add(Menu_Vendas);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-relatório-38.png"))); // NOI18N
        jMenu2.setText("Relatórios");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-caixa-38.png"))); // NOI18N
        jMenuItem2.setText("Relatórios Estoque");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-dinheiro-38.png"))); // NOI18N
        jMenuItem3.setText("Relatório vendas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        Menu_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        Menu_Ajuda.setText("Ajuda");

        Mtem_Ajuda_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-sair-38.png"))); // NOI18N
        Mtem_Ajuda_Sair.setText("Sair");
        Mtem_Ajuda_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mtem_Ajuda_SairActionPerformed(evt);
            }
        });
        Menu_Ajuda.add(Mtem_Ajuda_Sair);

        Mtem_Ajuda_Infosytm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar1.png"))); // NOI18N
        Mtem_Ajuda_Infosytm.setText("Informações Sistema");
        Mtem_Ajuda_Infosytm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mtem_Ajuda_InfosytmActionPerformed(evt);
            }
        });
        Menu_Ajuda.add(Mtem_Ajuda_Infosytm);

        jMenuBar1.add(Menu_Ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Mtem_Ajuda_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mtem_Ajuda_SairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_Mtem_Ajuda_SairActionPerformed
 
    private void M_Item_Cadastro_FuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Item_Cadastro_FuncionáriosActionPerformed
        
        IFRfuncionarios aaaa = new IFRfuncionarios();
        aaaa.painelFuncionarios.setSelectedIndex(1);
        form.posicao(aaaa, Desktop);
    
    }//GEN-LAST:event_M_Item_Cadastro_FuncionáriosActionPerformed

    private void Menu_Cadastro_FornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Cadastro_FornecedoresActionPerformed
        
        IFRfornecedor aaaa = new IFRfornecedor(); 
        aaaa.painel_guias.setSelectedIndex(1);
        form.posicao(aaaa, Desktop);
     
    }//GEN-LAST:event_Menu_Cadastro_FornecedoresActionPerformed

    private void Menu_Consulta_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Consulta_ClienteActionPerformed

        IFRcliente ifrcliente = new IFRcliente();
        
        ifrcliente.painel_guias.setSelectedIndex(0);

        form.posicao(ifrcliente,  Desktop);

    }//GEN-LAST:event_Menu_Consulta_ClienteActionPerformed

    private void Menu_Cadastro_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Cadastro_ClienteActionPerformed

        IFRcliente ifrcliente = new IFRcliente();        
        
        ifrcliente.painel_guias.setSelectedIndex(1);
        
        form.posicao(ifrcliente, Desktop);


    }//GEN-LAST:event_Menu_Cadastro_ClienteActionPerformed

    private void Cadastro_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_produtoActionPerformed

        
          IFR_Produto zz = new IFR_Produto();
          zz.Painel.setSelectedIndex(1);
          form.posicao(zz, Desktop);
         
        
    }//GEN-LAST:event_Cadastro_produtoActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        
        IFR_estoque1 zz1 = new IFR_estoque1();
        System.out.println("tela estoque = " + zz1);
        form.posicao(zz1 = new IFR_estoque1(), Desktop);
        
    }//GEN-LAST:event_EstoqueActionPerformed

    private void Consulta_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta_ProdutoActionPerformed
       
        IFR_Produto zz = new IFR_Produto();
        zz.Painel.setSelectedIndex(0);
        form.posicao(zz, Desktop);
        
    }//GEN-LAST:event_Consulta_ProdutoActionPerformed

    private void Menu_Consulta_FuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Consulta_FuncionariosActionPerformed

        IFRfuncionarios xx = new IFRfuncionarios();
          
        xx.painelFuncionarios.setSelectedIndex(0);
        
        form.posicao(xx, Desktop);
    }//GEN-LAST:event_Menu_Consulta_FuncionariosActionPerformed

    private void Menu_Consulta_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Consulta_FornecedorActionPerformed
       
        IFRfornecedor aaaa = new IFRfornecedor();
        aaaa.painel_guias.setSelectedIndex(0);
        form.posicao(aaaa, Desktop);
        
        
    }//GEN-LAST:event_Menu_Consulta_FornecedorActionPerformed

    private void FrenteDeCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrenteDeCaixaActionPerformed
        
       IFR_Vendas ifr = new IFR_Vendas();
        form.posicao(ifr, Desktop);
      
    }//GEN-LAST:event_FrenteDeCaixaActionPerformed

    private void HistoricoDeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoDeVendasActionPerformed

        IFR_Historico_Venda f1 = new IFR_Historico_Venda();
        form.posicao(f1, Desktop);

    }//GEN-LAST:event_HistoricoDeVendasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
           
        try {
            // Compila o relatorio
            JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/Relatorios/Relatorio_Estoque.jrxml"));

            // Mapeia campos de parametros para o relatorio, mesmo que nao existam
            Map parametros = new HashMap();

            // Executa relatoio
            JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoBD.getInstance().getConnection());

            // Exibe resultado em video
            JasperViewer.viewReport(impressao, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e);
        }
     

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        Relatoriovendas1 rl = new Relatoriovendas1();
        
        Desktop.add(rl);
        
        rl.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void Mtem_Ajuda_InfosytmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mtem_Ajuda_InfosytmActionPerformed
         
        InformacoesSistema ifs = new InformacoesSistema();
        form.posicao(ifs, Desktop);
    }//GEN-LAST:event_Mtem_Ajuda_InfosytmActionPerformed
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cadastro_produto;
    private javax.swing.JMenuItem Consulta_Produto;
    public javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem Estoque;
    private javax.swing.JMenuItem FrenteDeCaixa;
    private javax.swing.JMenuItem HistoricoDeVendas;
    private javax.swing.JMenuItem M_Item_Cadastro_Funcionários;
    private javax.swing.JMenu Menu_Ajuda;
    private javax.swing.JMenuItem Menu_Cadastro_Cliente;
    private javax.swing.JMenuItem Menu_Cadastro_Fornecedores;
    private javax.swing.JMenu Menu_Cliente;
    private javax.swing.JMenuItem Menu_Consulta_Cliente;
    private javax.swing.JMenuItem Menu_Consulta_Fornecedor;
    private javax.swing.JMenuItem Menu_Consulta_Funcionarios;
    private javax.swing.JMenu Menu_Fornecedores;
    private javax.swing.JMenu Menu_Funcionarios;
    private javax.swing.JMenu Menu_Produtos;
    private javax.swing.JMenu Menu_Vendas;
    private javax.swing.JMenuItem Mtem_Ajuda_Infosytm;
    private javax.swing.JMenuItem Mtem_Ajuda_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField tffdata;
    // End of variables declaration//GEN-END:variables

}
