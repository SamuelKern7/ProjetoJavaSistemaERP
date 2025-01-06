package Tela;

import DAO.FuncionariosDAO;
import Entidade.Funcionarios;
import apoio.ComboItem;
import apoio.Formatacao;
import apoio.Validacao;
import java.awt.Color;
import javax.swing.JOptionPane;

public class IFRfuncionarios extends javax.swing.JInternalFrame {

     int idfUNF = 0;
    
    public IFRfuncionarios() {
        initComponents();
        
        Formatacao.formatarTelefone(tffCelular);
        Formatacao.formatarCelular(tffTelefone);
        Formatacao.formatarRg(tffRg);
        Formatacao.formatarCpf(tffCpf);
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
        painelFuncionarios = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Funcionarios = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtPesquisaNome = new javax.swing.JTextField();
        btnPesquisaNome = new javax.swing.JButton();
        Menu_manu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tffRg = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        tffCpf = new javax.swing.JFormattedTextField();
        tffCelular = new javax.swing.JFormattedTextField();
        tffTelefone = new javax.swing.JFormattedTextField();
        btnPesquisar1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        tffEstado = new javax.swing.JFormattedTextField();
        tffCep = new javax.swing.JFormattedTextField();
        tffNumero = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        cbNivel = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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
        jLabel1.setText("Cadastro De Funcionários");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tabela_Funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "rg", "cpf", "email", "cargo", "nivel_acesso", "telefone", "celular", "cep", "endereco", "numero", "complemento", "bairro", "cidade", "estado"
            }
        ));
        tabela_Funcionarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela_Funcionarios);
        if (tabela_Funcionarios.getColumnModel().getColumnCount() > 0) {
            tabela_Funcionarios.getColumnModel().getColumn(0).setMinWidth(25);
            tabela_Funcionarios.getColumnModel().getColumn(0).setMaxWidth(25);
            tabela_Funcionarios.getColumnModel().getColumn(1).setMinWidth(120);
            tabela_Funcionarios.getColumnModel().getColumn(1).setMaxWidth(120);
            tabela_Funcionarios.getColumnModel().getColumn(3).setMinWidth(70);
            tabela_Funcionarios.getColumnModel().getColumn(3).setMaxWidth(70);
            tabela_Funcionarios.getColumnModel().getColumn(4).setMinWidth(130);
            tabela_Funcionarios.getColumnModel().getColumn(4).setMaxWidth(130);
            tabela_Funcionarios.getColumnModel().getColumn(11).setMinWidth(25);
            tabela_Funcionarios.getColumnModel().getColumn(11).setMaxWidth(25);
            tabela_Funcionarios.getColumnModel().getColumn(15).setMinWidth(25);
            tabela_Funcionarios.getColumnModel().getColumn(15).setMaxWidth(25);
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
                .addContainerGap(451, Short.MAX_VALUE))
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

        painelFuncionarios.addTab("Listagem/Consulta", jPanel5);

        jLabel6.setText("E-mail:");

        jLabel13.setText("RG:");

        jLabel8.setText("Telefone:");

        jLabel2.setText("Celular:");

        jLabel14.setText("CPF:");

        jLabel5.setText("Nome:");

        tffCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCpfFocusLost(evt);
            }
        });

        btnPesquisar1.setText("Pesquisar");
        btnPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel16.setText("Informações do Cliente e de contato:");

        tffCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCepFocusLost(evt);
            }
        });

        jLabel11.setText("Complemento:");

        jLabel17.setText("Estado :");

        jLabel4.setText("CEP:");

        jLabel9.setText("N°:");

        jLabel10.setText("Endereço:");

        jLabel7.setText("Bairro:");

        jLabel12.setText("Cidade:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Informações de localização.");

        jLabel20.setText("Nivel de acesso:");

        jLabel18.setText("Senha:");

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "USUÁRIO" }));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel19.setText("Cadastro/Formatação de Senha");

        jLabel22.setText("ID:");

        txtId.setEditable(false);

        jLabel23.setText("Cargo:");

        jButton1.setText("Alterar senha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_manuLayout = new javax.swing.GroupLayout(Menu_manu);
        Menu_manu.setLayout(Menu_manuLayout);
        Menu_manuLayout.setHorizontalGroup(
            Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_manuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_manuLayout.createSequentialGroup()
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Menu_manuLayout.createSequentialGroup()
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel17))
                                .addGap(38, 38, 38))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5)
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tffCep, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Menu_manuLayout.createSequentialGroup()
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(32, 32, 32)
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBairro)
                            .addComponent(txtEndereco)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Menu_manuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Menu_manuLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tffRg, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tffTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Menu_manuLayout.createSequentialGroup()
                            .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel14)
                                .addComponent(jLabel5)
                                .addComponent(jLabel22))
                            .addGap(29, 29, 29)
                            .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tffCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5)
                .addComponent(btnPesquisar1)
                .addGap(30, 30, 30)
                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(Menu_manuLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(18, 18, 18)
                            .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Menu_manuLayout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addGap(18, 18, 18)
                            .addComponent(txtCargo)))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Menu_manuLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Menu_manuLayout.setVerticalGroup(
            Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_manuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel3))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_manuLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Menu_manuLayout.createSequentialGroup()
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel22)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Menu_manuLayout.createSequentialGroup()
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(btnPesquisar1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(tffCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tffTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tffRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Menu_manuLayout.createSequentialGroup()
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Menu_manuLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tffNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tffCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tffEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Menu_manuLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Menu_manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        painelFuncionarios.addTab("Manutenção", Menu_manu);

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
                .addGap(28, 28, 28)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addGap(35, 35, 35)
                .addComponent(btnFechar)
                .addGap(71, 71, 71))
            .addComponent(painelFuncionarios)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    String nomeFuncionario = txtNome.getText();
    String rgFuncionario = tffRg.getText();
    String cpfFuncionario = tffCpf.getText();
    String emailFuncionario = txtEmail.getText();
    String cargoFuncionario = txtCargo.getText();
    String nivel_acessoFuncionario = cbNivel.getSelectedItem().toString();
    String telefoneFuncionario = tffTelefone.getText();
    String celularFuncionario = tffCelular.getText();
    String cepFuncionario = tffCep.getText();
    String enderecoFuncionario = txtEndereco.getText();
    Integer numeroFuncionario = 0;    
    String complementoFuncionario = txtComplemento.getText();
    String bairroFuncionario = txtBairro.getText();
    String cidadeFuncionario = txtCidade.getText();
    String estadoFuncionario = tffEstado.getText();
    
     try {
        if (!tffNumero.getText().trim().isEmpty()) {
            numeroFuncionario = Integer.valueOf(tffNumero.getText().trim());
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Número inválido. Verifique se foi digitado corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; 
    }     
    
    // Criação do objeto Funcionarios
    Funcionarios dao = new Funcionarios();
    dao.setId(idfUNF);
    dao.setNome(nomeFuncionario);
    dao.setRg(rgFuncionario);
    dao.setCpf(cpfFuncionario);
    dao.setEmail(emailFuncionario);
    dao.setCargo(cargoFuncionario);
    dao.setNivel_acesso(nivel_acessoFuncionario);
    dao.setTelefone(telefoneFuncionario);
    dao.setCelular(celularFuncionario);
    dao.setCep(cepFuncionario);
    dao.setEndereco(enderecoFuncionario);
    dao.setNumero(numeroFuncionario);
    dao.setComplemento(complementoFuncionario);
    dao.setBairro(bairroFuncionario);
    dao.setCidade(cidadeFuncionario);
    dao.setEstado(estadoFuncionario);

    // Criação do objeto FuncionariosDAO
    FuncionariosDAO funf12 = new FuncionariosDAO();

    if (idfUNF == 0) { 
        if (funf12.salvar(dao) == null) {
            txtNome.setText("");
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
            new FuncionariosDAO().LimparTela(Menu_manu);
            txtNome.requestFocus();
            
        } else {
            JOptionPane.showMessageDialog(this, "Problemas ao salvar registro!");
        }
    } else {
        if (funf12.atualizar(dao) == null) {
            txtNome.setText("");
            JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso!");
            new FuncionariosDAO().LimparTela(Menu_manu);
            txtNome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Problemas ao atualizar registro!");
        }
    }

    idfUNF = 0;
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed
   
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed
        
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        String idTabela = String.valueOf(tabela_Funcionarios.getValueAt(tabela_Funcionarios.getSelectedRow(), 0));

        idfUNF = Integer.parseInt(idTabela);

        if (new FuncionariosDAO().excluir(idfUNF) == null) {
            JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");

            new FuncionariosDAO().popularTabela(tabela_Funcionarios, "");
        } else {
            JOptionPane.showMessageDialog(this, "Problemas ao excluir registro!");
        }

        idfUNF = 0;

     
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        String idTabela = String.valueOf(tabela_Funcionarios.getValueAt(tabela_Funcionarios.getSelectedRow(), 0));

        idfUNF = Integer.parseInt(idTabela);

        Funcionarios obj = new FuncionariosDAO().consultarId(idfUNF);

       try{
        
        if (obj != null) {
            
            painelFuncionarios.setSelectedIndex(1);
            txtNome.setText(obj.getNome());
            txtNome.requestFocus();
            
        } else {
            JOptionPane.showMessageDialog(this, "Id do funcionario não encontrado!");
        }
       }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao consultar funcionario: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
        new FuncionariosDAO().popularTabela(tabela_Funcionarios, txtPesquisaNome.getText());
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed

    private void tffCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCpfFocusLost
        if (!Validacao.validarCPF(Formatacao.removerFormatacao(tffCpf.getText()))) {
            tffCpf.setBackground(Color.YELLOW);
        } else {
            tffCpf.setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_tffCpfFocusLost

    private void tffCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCepFocusLost

    }//GEN-LAST:event_tffCepFocusLost

    private void btnPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar1ActionPerformed
        
         String nome = txtNome.getText();

    FuncionariosDAO dao = new FuncionariosDAO();
    Funcionarios obj = dao.consultarPorDescricao(nome);

    if (obj != null && obj.getNome() != null) {
        txtId.setText(String.valueOf(obj.getId()));
        txtNome.setText(obj.getNome());
        tffCpf.setText(obj.getCpf());
        tffRg.setText(obj.getRg());
        txtEmail.setText(obj.getEmail());
        txtCargo.setText(obj.getCargo());
        tffTelefone.setText(obj.getTelefone());
        tffCelular.setText(obj.getCelular());
        tffCep.setText(obj.getCep());
        txtEndereco.setText(obj.getEndereco());
        tffNumero.setText(String.valueOf(obj.getNumero()));
        txtComplemento.setText(obj.getComplemento());
        txtBairro.setText(obj.getBairro());
        txtCidade.setText(obj.getCidade());
        tffEstado.setText(obj.getEstado());
    } else {
        JOptionPane.showMessageDialog(this, "Cliente não encontrado com o nome: " + nome, "Erro", JOptionPane.ERROR_MESSAGE);
    }
        
        
    }//GEN-LAST:event_btnPesquisar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String senhaFuncionario = txtSenha.getText();
    
     // Criação do objeto Funcionarios
    Funcionarios dao = new Funcionarios();
    dao.setId(idfUNF);
    dao.setSenha(senhaFuncionario);
    

    // Criação do objeto FuncionariosDAO
    FuncionariosDAO funf12 = new FuncionariosDAO();

    if (idfUNF == 0) { 
        if (funf12.salvarsenha(dao) == null) {
            txtNome.setText("");
            JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
            new FuncionariosDAO().LimparTela(Menu_manu);
            txtNome.requestFocus();
            
        } else {
            JOptionPane.showMessageDialog(this, "Problemas ao salvar registro!");
        }
    } else {
        if (funf12.atualizarsenha(dao) == null) {
            txtNome.setText("");
            JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso!");
            new FuncionariosDAO().LimparTela(Menu_manu);
            txtNome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Problemas ao atualizar registro!");
        }
    }

    idfUNF = 0;
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Menu_manu;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnPesquisar1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    public javax.swing.JTabbedPane painelFuncionarios;
    private javax.swing.JTable tabela_Funcionarios;
    private javax.swing.JFormattedTextField tffCelular;
    private javax.swing.JFormattedTextField tffCep;
    private javax.swing.JFormattedTextField tffCpf;
    private javax.swing.JFormattedTextField tffEstado;
    private javax.swing.JFormattedTextField tffNumero;
    private javax.swing.JFormattedTextField tffRg;
    private javax.swing.JFormattedTextField tffTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
