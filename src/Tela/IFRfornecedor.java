
package Tela;

import DAO.FornecedoresDAO;
import Entidade.Fornecedores;
import apoio.Formatacao;
import apoio.Validacao;
import java.awt.Color;
import javax.swing.JOptionPane;

public class IFRfornecedor extends javax.swing.JInternalFrame {

     int idfornecedores = 0;
    
    public IFRfornecedor() {
        initComponents();
       

       Formatacao.formatarCnpj(tffCnpj);
       Formatacao.formatarTelefone(tffTelefone);
       Formatacao.formatarCelular(tffCelular);
       Formatacao.formatarCep(tffCep);
       Formatacao.formatarEstado(tffEstado);
       Formatacao.formatarNumero(tffNumero);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        painel_guias = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Fornecedor = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtPesquisaNome = new javax.swing.JTextField();
        btnPesquisaNome = new javax.swing.JButton();
        tela_manu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tffCnpj = new javax.swing.JFormattedTextField();
        tffCelular = new javax.swing.JFormattedTextField();
        tffTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JFormattedTextField();
        tffNumero = new javax.swing.JFormattedTextField();
        tffCep = new javax.swing.JFormattedTextField();
        tffEstado = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        jLabel21.setText("jLabel21");

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextField2.setText("jTextField2");

        jScrollPane5.setViewportView(jTextPane2);

        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(true);
        setTitle("Cadastro de Funcionários");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro De Fornecedor");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tabela_Fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "cnpj", "email", "telefone", "celular", "cep", "endereco", "numero", "complemento", "bairro", "cidade", "estado"
            }
        ));
        tabela_Fornecedor.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela_Fornecedor);
        if (tabela_Fornecedor.getColumnModel().getColumnCount() > 0) {
            tabela_Fornecedor.getColumnModel().getColumn(0).setMinWidth(25);
            tabela_Fornecedor.getColumnModel().getColumn(0).setMaxWidth(25);
            tabela_Fornecedor.getColumnModel().getColumn(1).setMinWidth(120);
            tabela_Fornecedor.getColumnModel().getColumn(1).setMaxWidth(120);
            tabela_Fornecedor.getColumnModel().getColumn(2).setMinWidth(70);
            tabela_Fornecedor.getColumnModel().getColumn(2).setMaxWidth(70);
            tabela_Fornecedor.getColumnModel().getColumn(3).setMinWidth(130);
            tabela_Fornecedor.getColumnModel().getColumn(3).setMaxWidth(130);
            tabela_Fornecedor.getColumnModel().getColumn(8).setMinWidth(25);
            tabela_Fornecedor.getColumnModel().getColumn(8).setMaxWidth(25);
            tabela_Fornecedor.getColumnModel().getColumn(12).setMinWidth(25);
            tabela_Fornecedor.getColumnModel().getColumn(12).setMaxWidth(25);
        }

        jLabel15.setText("Nome:");

        btnPesquisaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        btnPesquisaNome.setText("Pesquisar");
        btnPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnPesquisaNome)
                .addContainerGap(324, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painel_guias.addTab("Listagem/Consulta", jPanel5);

        jLabel2.setText("Celular:");

        jLabel5.setText("Nome:");

        jLabel6.setText("E-mail:");

        jLabel8.setText("Telefone:");

        jLabel4.setText("CEP:");

        jLabel7.setText("Bairro:");

        jLabel9.setText("N°:");

        jLabel10.setText("Endereço:");

        jLabel11.setText("Complemento:");

        jLabel12.setText("Cidade:");

        jLabel14.setText("CNPJ:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Informações de localização");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel16.setText("Informações do Fornecedor /Contatos");

        jLabel17.setText("Estado :");

        tffCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCnpjFocusLost(evt);
            }
        });

        tffCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCepFocusLost(evt);
            }
        });

        jLabel13.setText("Id:");

        txtid.setEditable(false);

        javax.swing.GroupLayout tela_manuLayout = new javax.swing.GroupLayout(tela_manu);
        tela_manu.setLayout(tela_manuLayout);
        tela_manuLayout.setHorizontalGroup(
            tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_manuLayout.createSequentialGroup()
                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_manuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela_manuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel17)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tffEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCep, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBairro)
                                .addComponent(txtCidade)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_manuLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tela_manuLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tela_manuLayout.createSequentialGroup()
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13))
                                .addGap(29, 29, 29)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome)
                                    .addGroup(tela_manuLayout.createSequentialGroup()
                                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tffCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        tela_manuLayout.setVerticalGroup(
            tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_manuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(tela_manuLayout.createSequentialGroup()
                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tela_manuLayout.createSequentialGroup()
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tffNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tffCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tffEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addGroup(tela_manuLayout.createSequentialGroup()
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(tffCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tffTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tela_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        painel_guias.addTab("Manutenção", tela_manu);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/printer.png"))); // NOI18N
        btnImprimir.setText("Imprimir");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addGap(35, 35, 35)
                .addComponent(btnFechar)
                .addGap(71, 71, 71))
            .addComponent(painel_guias)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_guias, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnImprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

         String nomeFornecedor = txtNome.getText();
         String cnpjFornecedor = tffCnpj.getText();
         String emailFornecedor = txtEmail.getText();
         String telefoneFornecedor = tffTelefone.getText();
         String celularFornecedor = tffCelular.getText();
         String cepFornecedor = tffCep.getText();
         String enderecoFornecedor = txtEndereco.getText();
         Integer numeroFornecedor = 0;
         String complementoFornecedor = txtComplemento.getText();
         String bairroFornecedor = txtBairro.getText();
         String cidadeFornecedor = txtCidade.getText();
         String estadoFornecedor = tffEstado.getText();
         
         try {
        if (!tffNumero.getText().trim().isEmpty()) {
            numeroFornecedor = Integer.valueOf(tffNumero.getText().trim());
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Número inválido. Verifique se foi digitado corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; 
    }     
        
        // cricao obj
        Fornecedores dao = new Fornecedores();
        dao.setId(idfornecedores);
        dao.setNome(nomeFornecedor);
        dao.setCnpj(cnpjFornecedor);
        dao.setEmail(emailFornecedor);
        dao.setTelefone(telefoneFornecedor);
        dao.setCelular(celularFornecedor);
        dao.setCep(cepFornecedor);
        dao.setEndereco(enderecoFornecedor);
        dao.setNumero(numeroFornecedor);
        dao.setComplemento(complementoFornecedor);
        dao.setBairro(bairroFornecedor);
        dao.setCidade(cidadeFornecedor);
        dao.setEstado(estadoFornecedor);
        
        // criacao do obj
        FornecedoresDAO fornec = new FornecedoresDAO();

        if (idfornecedores == 0) { 
            if (fornec.salvar(dao) == null) {
                txtNome.setText("");
                
                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                new FornecedoresDAO().LimparTela(tela_manu);
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Problemas ao salvar registro!");
            }
        } else {
            if (fornec.atualizar(dao) == null) {
                txtNome.setText("");
                 
                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                new FornecedoresDAO().LimparTela(tela_manu);
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Problemas ao salvar registro!");
            }
        }

        idfornecedores = 0;
      
    }//GEN-LAST:event_btnSalvarActionPerformed
 
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
       new FornecedoresDAO().popularTabela(tabela_Fornecedor, txtPesquisaNome.getText());
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed
        
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String idTabela = String.valueOf(tabela_Fornecedor.getValueAt(tabela_Fornecedor.getSelectedRow(), 0));

        idfornecedores = Integer.parseInt(idTabela);

        if (new FornecedoresDAO().excluir(idfornecedores) == null) {
            JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");

            new FornecedoresDAO().popularTabela(tabela_Fornecedor, "");
        } else {
            JOptionPane.showMessageDialog(this, "Problemas ao excluir registro!");
        }

        idfornecedores = 0; 
      
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
         String idTabela = String.valueOf(tabela_Fornecedor.getValueAt(tabela_Fornecedor.getSelectedRow(), 0));

    idfornecedores = Integer.parseInt(idTabela);

    Fornecedores obj = new FornecedoresDAO().consultarId(idfornecedores);

    try {
        if (obj != null) {
            painel_guias.setSelectedIndex(1);

            txtid.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            tffCnpj.setText(obj.getCnpj());
            txtEmail.setText(obj.getEmail());
            tffTelefone.setText(obj.getTelefone());
            tffCelular.setText(obj.getCelular());
            tffCep.setText(obj.getCep());
            txtEndereco.setText(obj.getEndereco());
            tffNumero.setText(String.valueOf(obj.getNumero()));
            txtComplemento.setText(obj.getComplemento());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            tffEstado.setText(obj.getEstado());

            txtNome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Id do Fornecedor não encontrado!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao consultar Fornecedores: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tffCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCnpjFocusLost
        // TODO add your handling code here:
        
        if (!Validacao.validarCPF(Formatacao.removerFormatacao(tffCnpj.getText()))) {
            tffCnpj.setBackground(Color.YELLOW);
        } else {
            tffCnpj.setBackground(Color.WHITE);
        }
        
    }//GEN-LAST:event_tffCnpjFocusLost

    private void tffCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCepFocusLost
        if (!Validacao.validarCep(tffCep)) {
            tffCep.setBackground(Color.YELLOW);
        } else {
            tffCep.setBackground(Color.WHITE);
        }
      
        
        
    }//GEN-LAST:event_tffCepFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane2;
    public javax.swing.JTabbedPane painel_guias;
    private javax.swing.JTable tabela_Fornecedor;
    public javax.swing.JPanel tela_manu;
    private javax.swing.JFormattedTextField tffCelular;
    private javax.swing.JFormattedTextField tffCep;
    private javax.swing.JFormattedTextField tffCnpj;
    private javax.swing.JFormattedTextField tffEstado;
    private javax.swing.JFormattedTextField tffNumero;
    private javax.swing.JFormattedTextField tffTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
