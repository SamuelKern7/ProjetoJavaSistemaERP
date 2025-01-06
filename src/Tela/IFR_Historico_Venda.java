package Tela;

import DAO.ItensVendasDAO;
import DAO.VendasDAO;
import Entidade.ItensVendas;
import Entidade.Vendas;
import apoio.Formatacao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import apoio.PosicaoTela;

public class IFR_Historico_Venda extends javax.swing.JInternalFrame {

   PosicaoTela form = new PosicaoTela();
    public IFR_Historico_Venda() {
        initComponents();
        
        Formatacao.formatarData(tffDataInicio);
        Formatacao.formatarData(tffDataFim);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tffDataInicio = new javax.swing.JFormattedTextField();
        tffDataFim = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_HistoricoVendas = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        setTitle("Histórico de Vendas");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Histórico de Vendas");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Data"));

        jLabel2.setText("Data inicio:");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("data fim:");

        tabela_HistoricoVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "cliente", "data de venda", "Total ", "Observações"
            }
        ));
        tabela_HistoricoVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_HistoricoVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_HistoricoVendas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tffDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tffDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tffDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair_1.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
         try {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data_inicio = LocalDate.parse(tffDataInicio.getText(), formato);
        LocalDate data_fim = LocalDate.parse(tffDataFim.getText(), formato);
        VendasDAO vd = new VendasDAO();
        List<Vendas> lista = vd.historicovendas(data_inicio, data_fim);
        DefaultTableModel historico = (DefaultTableModel) tabela_HistoricoVendas.getModel();
        historico.setNumRows(0);
        
        for (Vendas v : lista) {
            historico.addRow(new Object[]{
                v.getId(),
                v.getClientes().getNome(),
                v.getData_venda(),
                v.getTotal_venda(),
                v.getObservacoes(),
            });
        }
        JOptionPane.showMessageDialog(null, "Sucesso ao buscar!");
        System.out.println("Número de vendas encontradas: " + lista.size());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar! " + e.getMessage());
    }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tabela_HistoricoVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_HistoricoVendasMouseClicked

       try {
        // Cria uma nova instância de IFR_Detalhes_Venda
        IFR_Detalhes_Venda f2 = new IFR_Detalhes_Venda();
        
        // Define os valores dos campos baseados na linha selecionada na tabela
        String idVenda = tabela_HistoricoVendas.getValueAt(tabela_HistoricoVendas.getSelectedRow(), 0).toString();
        String cliente = tabela_HistoricoVendas.getValueAt(tabela_HistoricoVendas.getSelectedRow(), 1).toString();
        String dataVenda = tabela_HistoricoVendas.getValueAt(tabela_HistoricoVendas.getSelectedRow(), 2).toString();
        String totalVenda = tabela_HistoricoVendas.getValueAt(tabela_HistoricoVendas.getSelectedRow(), 3).toString();
        String observacoes = tabela_HistoricoVendas.getValueAt(tabela_HistoricoVendas.getSelectedRow(), 4).toString();
        
        // Define os campos na nova instância
        f2.txtIDvenda.setText(idVenda);
        f2.txtCliente.setText(cliente);
        f2.tffDatadevenda.setText(dataVenda);
        f2.txtTotalvenda.setText(totalVenda);
        f2.txtObs.setText(observacoes);
        
        // Depuração: imprime os valores no console
        System.out.println("ID Venda: " + idVenda);
        System.out.println("Cliente: " + cliente);
        System.out.println("Data Venda: " + dataVenda);
        System.out.println("Total Venda: " + totalVenda);
        System.out.println("Observações: " + observacoes);
        
        // Obtém o ID da venda
        int venda_id = Integer.parseInt(idVenda);
        System.out.println("ID da venda selecionada: " + venda_id);
        
        // Busca os itens da venda
        ItensVendasDAO dao = new ItensVendasDAO();
        List<ItensVendas> lista = dao.listaItens(venda_id);
        System.out.println("Número de itens encontrados: " + lista.size());
        
        // Popula a tabela de produtos
        DefaultTableModel dados = (DefaultTableModel) f2.tabela_produtos1.getModel();
        dados.setRowCount(0);
        
        for (ItensVendas i : lista) {
            System.out.println("Produto ID: " + i.getProduto().getId());
            System.out.println("Descrição: " + i.getProduto().getDescricao());
            System.out.println("Quantidade: " + i.getQtd());
            System.out.println("Preço: " + i.getProduto().getPreco());
            System.out.println("Subtotal: " + i.getSubtotal());
            
            dados.addRow(new Object[]{
                i.getProduto().getId(),
                i.getProduto().getDescricao(),
                i.getQtd(),
                i.getProduto().getPreco(),
                i.getSubtotal()
            });
        }
        
        // Adiciona a nova instância ao container pai e exibe
        this.getParent().add(f2);
        f2.setVisible(true);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar itens da venda: " + e.getMessage());
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_tabela_HistoricoVendasMouseClicked


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_HistoricoVendas;
    private javax.swing.JFormattedTextField tffDataFim;
    private javax.swing.JFormattedTextField tffDataInicio;
    // End of variables declaration//GEN-END:variables
}
