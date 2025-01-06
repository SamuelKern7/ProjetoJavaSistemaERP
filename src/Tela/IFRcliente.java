package Tela;

import Entidade.Clientes;
import apoio.Formatacao;
import apoio.Validacao;
import dao.ClientesDAO;
import java.awt.Color;
import javax.swing.JOptionPane;



public class IFRcliente extends javax.swing.JInternalFrame {

     int idCliente = 0;
    
    public IFRcliente() {
       
       //centralizar();
       initComponents();        
        
       Formatacao.formatarCpf(tffCpf);
       Formatacao.formatarTelefone(tffCelular);
       Formatacao.formatarCelular(tffTelefone);
       Formatacao.formatarCep(tffCep);
       Formatacao.formatarRg(tffRg);
       Formatacao.formatarEstado(tffEstado);
       Formatacao.formatarNumero(tffNumero);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        painel_guias = new javax.swing.JTabbedPane();
        TelaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_clientes = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtPesquisaNome = new javax.swing.JTextField();
        btnPesquisaNome = new javax.swing.JButton();
        TelaManutencao = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tffCpf = new javax.swing.JFormattedTextField();
        tffCelular = new javax.swing.JFormattedTextField();
        tffTelefone = new javax.swing.JFormattedTextField();
        tffRg = new javax.swing.JFormattedTextField();
        tffNumero = new javax.swing.JFormattedTextField();
        tffCep = new javax.swing.JFormattedTextField();
        tffEstado = new javax.swing.JFormattedTextField();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField2.setText("jTextField2");

        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro De Clientes");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tabela_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "rg", "cpf", "email", "telefone", "celular", "cep", "endereco", "N°", "complemento", "bairro", "cidade", "estado"
            }
        ));
        jScrollPane1.setViewportView(tabela_clientes);
        if (tabela_clientes.getColumnModel().getColumnCount() > 0) {
            tabela_clientes.getColumnModel().getColumn(0).setMinWidth(25);
            tabela_clientes.getColumnModel().getColumn(0).setMaxWidth(30);
            tabela_clientes.getColumnModel().getColumn(9).setMinWidth(25);
            tabela_clientes.getColumnModel().getColumn(9).setMaxWidth(30);
            tabela_clientes.getColumnModel().getColumn(13).setMinWidth(25);
            tabela_clientes.getColumnModel().getColumn(13).setMaxWidth(25);
        }

        jLabel15.setText("Nome:");

        btnPesquisaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar.png"))); // NOI18N
        btnPesquisaNome.setText("Pesquisar");
        btnPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaListagemLayout = new javax.swing.GroupLayout(TelaListagem);
        TelaListagem.setLayout(TelaListagemLayout);
        TelaListagemLayout.setHorizontalGroup(
            TelaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaListagemLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnPesquisaNome)
                .addContainerGap(365, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        TelaListagemLayout.setVerticalGroup(
            TelaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaListagemLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(TelaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painel_guias.addTab("Listagem", TelaListagem);

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

        jLabel13.setText("RG:");

        jLabel14.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Informações de localização.");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel16.setText("Informações do Cliente e de contato:");

        jLabel17.setText("Estado :");

        tffCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCpfFocusLost(evt);
            }
        });

        jLabel18.setText("Id:");

        txtId.setEditable(false);

        javax.swing.GroupLayout TelaManutencaoLayout = new javax.swing.GroupLayout(TelaManutencao);
        TelaManutencao.setLayout(TelaManutencaoLayout);
        TelaManutencaoLayout.setHorizontalGroup(
            TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaManutencaoLayout.createSequentialGroup()
                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaManutencaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaManutencaoLayout.createSequentialGroup()
                                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TelaManutencaoLayout.createSequentialGroup()
                                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel17))
                                        .addGap(38, 38, 38))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(5, 5, 5)
                                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tffCep, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tffEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tffNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(TelaManutencaoLayout.createSequentialGroup()
                                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(txtEndereco)
                                    .addComponent(txtCidade)))))
                    .addGroup(TelaManutencaoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TelaManutencaoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tffRg, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TelaManutencaoLayout.createSequentialGroup()
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5)
                            .addComponent(jLabel18))
                        .addGap(29, 29, 29)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tffCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        TelaManutencaoLayout.setVerticalGroup(
            TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaManutencaoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaManutencaoLayout.createSequentialGroup()
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaManutencaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tffNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tffCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tffEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaManutencaoLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(TelaManutencaoLayout.createSequentialGroup()
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tffCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        painel_guias.addTab("Manutenção", TelaManutencao);

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
                .addGap(25, 25, 25)
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

         String nomeCliente = txtNome.getText();
         String rgCliente = tffRg.getText();
         String cpfCliente = tffCpf.getText();
         String emailCliente = txtEmail.getText();
         String telefoneCliente = tffTelefone.getText();
         String celularCliente = tffCelular.getText();
         String cepCliente = tffCep.getText();
         String enderecoCliente = txtEndereco.getText();
         Integer numeroCliente = Integer.valueOf(tffNumero.getText());
         String complementoCliente = txtComplemento.getText();
         String bairroCliente = txtBairro.getText();
         String cidadeCliente = txtNome.getText();
         String estadoCliente = tffEstado.getText();
         
        // cricao obj Cidade
         Clientes dao = new Clientes();
         dao.setId(idCliente);
         dao.setNome(nomeCliente);
         dao.setRg(rgCliente);
         dao.setCpf(cpfCliente);
         dao.setEmail(emailCliente);
         dao.setTelefone(telefoneCliente);
         dao.setCelular(celularCliente);
         dao.setCep(cepCliente);
         dao.setEndereco(enderecoCliente);
         dao.setNumero(numeroCliente);
         dao.setComplemento(complementoCliente);
         dao.setBairro(bairroCliente);
         dao.setCidade(cidadeCliente);
         dao.setEstado(estadoCliente);
        
        // criacao do obj CidadeDAO
        ClientesDAO Clientes1 = new ClientesDAO();

        if (idCliente == 0) { // representa uma INSERCAO
            if (Clientes1.salvar(dao) == null) {
                txtNome.setText("");
                
                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                new ClientesDAO().LimparTela(TelaManutencao);
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Problemas ao salvar registro!");
            }
        } else {
            if (Clientes1.atualizar(dao) == null) {
                txtNome.setText("");

                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                new ClientesDAO().LimparTela(TelaManutencao);
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Problemas ao salvar registro!");
            }
        }

        idCliente = 0;
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
       new ClientesDAO().popularTabela(tabela_clientes, txtPesquisaNome.getText());
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        String idTabela = String.valueOf(tabela_clientes.getValueAt(tabela_clientes.getSelectedRow(), 0));

        idCliente = Integer.parseInt(idTabela);

        if (new ClientesDAO().excluir(idCliente) == null) {
            JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");

            new ClientesDAO().popularTabela(tabela_clientes, "");
        } else {
            JOptionPane.showMessageDialog(this, "Problemas ao excluir registro!");
        }

        idCliente = 0;

     
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        String idTabela = String.valueOf(tabela_clientes.getValueAt(tabela_clientes.getSelectedRow(), 0));

        idCliente = Integer.parseInt(idTabela);

        Clientes obj = new ClientesDAO().consultarId(idCliente);

       try{
        
        if (obj != null) {
            painel_guias.setSelectedIndex(1);

            txtId.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            tffRg.setText(obj.getRg());
            tffCpf.setText(obj.getCpf());
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
            JOptionPane.showMessageDialog(this, "Id do cliente não encontrado!");
        }
       }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao consultar cliente: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tffCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCpfFocusLost
        if (!Validacao.validarCPF(Formatacao.removerFormatacao(tffCpf.getText()))) {
            tffCpf.setBackground(Color.YELLOW);
        } else {
            tffCpf.setBackground(Color.WHITE);
        }
    
     
    }//GEN-LAST:event_tffCpfFocusLost

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel TelaListagem;
    public javax.swing.JPanel TelaManutencao;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTabbedPane painel_guias;
    private javax.swing.JTable tabela_clientes;
    private javax.swing.JFormattedTextField tffCelular;
    private javax.swing.JFormattedTextField tffCep;
    private javax.swing.JFormattedTextField tffCpf;
    private javax.swing.JFormattedTextField tffEstado;
    private javax.swing.JFormattedTextField tffNumero;
    private javax.swing.JFormattedTextField tffRg;
    private javax.swing.JFormattedTextField tffTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisaNome;
    // End of variables declaration//GEN-END:variables
}
