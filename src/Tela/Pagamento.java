package Tela;

import DAO.ItensVendasDAO;
import DAO.ProdutoDAO;
import Entidade.Clientes;
import Entidade.ItensVendas;
import javax.swing.table.DefaultTableModel;
import DAO.VendasDAO;
import Entidade.Produto;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import Entidade.Vendas;

public class Pagamento extends javax.swing.JInternalFrame {

   ItensVendas obj = new ItensVendas();
    Clientes clientes = new Clientes();
    DefaultTableModel meus_produtos;
    private Date dataInicioVenda;

    public Pagamento(Date dataInicioVenda) {
        this.dataInicioVenda = dataInicioVenda;
        initComponents();
        txtDinheiro.setText("0");
        txtCartao.setText("0");
        txtCheque.setText("0");
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalvenda = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        txtCheque = new javax.swing.JTextField();
        txtCartao = new javax.swing.JTextField();
        txtDinheiro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        btnPagar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAGAMENTO");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-dinheiro-48.png"))); // NOI18N
        jLabel2.setText("Dinheiro:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cartão-visa-45.png"))); // NOI18N
        jLabel3.setText("Cartão:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-verificar-45_1.png"))); // NOI18N
        jLabel4.setText("Cheque:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-moedas-45_1.png"))); // NOI18N
        jLabel5.setText("Troco:");

        jLabel6.setText("Total:");

        jLabel7.setText("Observações:");

        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelPrincipalLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(painelPrincipalLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))))))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDinheiro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCartao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCheque, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTroco))
                        .addGap(36, 36, 36)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(txtTotalvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTotalvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed

      try {
            double dinheiro, cartao, cheque, totalVenda, troco, totalPago;

            dinheiro = Double.valueOf(txtDinheiro.getText());
            cartao = Double.valueOf(txtCartao.getText());
            cheque = Double.valueOf(txtCheque.getText());
            totalVenda = Double.valueOf(txtTotalvenda.getText());
            totalPago = dinheiro + cartao + cheque;
            troco = totalPago - totalVenda;
            txtTroco.setText(String.valueOf(troco));

            if (totalPago >= totalVenda) {
                Vendas v = new Vendas();
                v.setClientes(clientes);

                // Usando a data de início da venda fixa
                SimpleDateFormat dateEUA = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dataMysql = dateEUA.format(dataInicioVenda);
                v.setData_venda(dataMysql);

                // Vendas
                v.setTotal_venda(totalVenda);
                v.setObservacoes(txtObservacoes.getText());
                VendasDAO vd = new VendasDAO();
                vd.salvar(v);
                v.setId(vd.retornaUltimoIdVenda());
                JOptionPane.showMessageDialog(null, "Id da última venda: " + v.getId());

                for (int i = 0; i < meus_produtos.getRowCount(); i++) {
                      int qtd_estoque, qtd_compra, qtd_atualizada;
                      Produto p = new Produto();
                      ProdutoDAO pd = new ProdutoDAO();
                      ItensVendas item = new ItensVendas();

                    item.setVendas(v);
                    p.setId(Integer.valueOf(meus_produtos.getValueAt(i, 0).toString()));
                    item.setProduto(p);
                    item.setQtd(Integer.valueOf(meus_produtos.getValueAt(i, 2).toString()));
                    item.setSubtotal(Double.valueOf(meus_produtos.getValueAt(i, 4).toString()));
                    
                    qtd_estoque = pd.retornaQtdAtualEstoque(p.getId());
                    qtd_compra = Integer.valueOf(meus_produtos.getValueAt(i, 2).toString());
                    qtd_atualizada = qtd_estoque - qtd_compra;
                    pd.Baixaestoque(p.getId(), qtd_atualizada);
                    ItensVendasDAO ivd = new ItensVendasDAO();
                    ivd.salvar(item);
                    
                    this.dispose(); //alterei para sair
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível efetuar a venda! O valor pago é menor que o valor da venda.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar venda, dê uma olhadinha no código muquinha! " + e);
        }
 
    }//GEN-LAST:event_btnPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextArea txtObservacoes;
    public javax.swing.JTextField txtTotalvenda;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
