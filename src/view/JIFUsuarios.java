/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.UsuarioData;
import extras.tratarFormularios;
//import extras.TratarFormularios;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
/**
 *
 * @author onerb
 */
public class JIFUsuarios extends javax.swing.JInternalFrame {
    private Usuario obj;
    private UsuarioData DAO;
    private ArrayList<Usuario> listadeUsuarios;
    private int acao;
    /**
     * Creates new form JIFUsuarios
     */
    public JIFUsuarios() {
        try {
           obj = new Usuario();
           DAO = new UsuarioData();
           listadeUsuarios = new ArrayList<>();
           acao=0;
        initComponents();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlid = new javax.swing.JLabel();
        jlnome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jtfnomeusuario = new javax.swing.JTextField();
        jtfCPF = new javax.swing.JTextField();
        jlcadusu = new javax.swing.JLabel();
        jtfcadusu = new javax.swing.JTextField();
        jpfcadsenha = new javax.swing.JPasswordField();
        jlCadsenha = new javax.swing.JLabel();
        jltipo = new javax.swing.JLabel();
        jcbtipo = new javax.swing.JComboBox<>();
        jlCidade = new javax.swing.JLabel();
        jtfcidade = new javax.swing.JTextField();
        jlrua = new javax.swing.JLabel();
        jtfrua = new javax.swing.JTextField();
        jlnumero = new javax.swing.JLabel();
        jtfnumero = new javax.swing.JTextField();
        jlbairro = new javax.swing.JLabel();
        jtfbairro = new javax.swing.JTextField();
        jlCEP = new javax.swing.JLabel();
        jtfcep = new javax.swing.JTextField();
        jlCNH = new javax.swing.JLabel();
        jtfCNH = new javax.swing.JTextField();
        jlformacao = new javax.swing.JLabel();
        jtfFormacao = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbsalvar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        jbeditar = new javax.swing.JButton();
        jlidusuario = new javax.swing.JLabel();
        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuarios = new javax.swing.JTable();
        jtfPesquisar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastros de Usuários");

        jlid.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlid.setText("ID");

        jlnome.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlnome.setText("Nome");

        jlCPF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlCPF.setText("CPF");

        jtfnomeusuario.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfnomeusuario.setEnabled(false);

        jtfCPF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfCPF.setEnabled(false);

        jlcadusu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlcadusu.setText("Usuário");

        jtfcadusu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfcadusu.setEnabled(false);
        jtfcadusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcadusuActionPerformed(evt);
            }
        });

        jpfcadsenha.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jpfcadsenha.setEnabled(false);

        jlCadsenha.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlCadsenha.setText("Senha");

        jltipo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jltipo.setText("Tipo");

        jcbtipo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jcbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Motorista" }));
        jcbtipo.setEnabled(false);

        jlCidade.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlCidade.setText("Cidade");

        jtfcidade.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfcidade.setEnabled(false);
        jtfcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcidadeActionPerformed(evt);
            }
        });

        jlrua.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlrua.setText("Rua");

        jtfrua.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfrua.setEnabled(false);

        jlnumero.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlnumero.setText("Numero");

        jtfnumero.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfnumero.setEnabled(false);

        jlbairro.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlbairro.setText("Bairro");

        jtfbairro.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfbairro.setEnabled(false);

        jlCEP.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlCEP.setText("CEP");

        jtfcep.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfcep.setEnabled(false);

        jlCNH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlCNH.setText("CNH");

        jtfCNH.setEnabled(false);

        jlformacao.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlformacao.setText("Formação");

        jtfFormacao.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfFormacao.setEnabled(false);

        jbNovo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Add User.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setContentAreaFilled(false);
        jbNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbsalvar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jbsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Salvar.png"))); // NOI18N
        jbsalvar.setText("Salvar");
        jbsalvar.setContentAreaFilled(false);
        jbsalvar.setEnabled(false);
        jbsalvar.setFocusable(false);
        jbsalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbsalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });

        jbcancelar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Cancel.png"))); // NOI18N
        jbcancelar.setText("Cancelar");
        jbcancelar.setToolTipText("");
        jbcancelar.setContentAreaFilled(false);
        jbcancelar.setEnabled(false);
        jbcancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbcancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        jbeditar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jbeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Editar.png"))); // NOI18N
        jbeditar.setText("Editar");
        jbeditar.setToolTipText("");
        jbeditar.setContentAreaFilled(false);
        jbeditar.setEnabled(false);
        jbeditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbeditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditarActionPerformed(evt);
            }
        });

        jlidusuario.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jlidusuario.setText("0");

        jbExcluir.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Delete User.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setContentAreaFilled(false);
        jbExcluir.setEnabled(false);
        jbExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jtbUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_Usuario", "Nome", "CPF", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUsuarios);

        jtfPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfPesquisar.setText("Digite um nome...");
        jtfPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfPesquisarMouseClicked(evt);
            }
        });
        jtfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarActionPerformed(evt);
            }
        });
        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Pesquisar: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbairro)
                            .addComponent(jlnome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlcadusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlformacao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfnomeusuario)
                                .addGap(21, 21, 21)
                                .addComponent(jlCPF)
                                .addGap(3, 3, 3)
                                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfcidade)
                                    .addComponent(jtfbairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfcadusu, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlCadsenha)
                                            .addComponent(jlCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jlrua)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfcep, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(jpfcadsenha)
                                    .addComponent(jtfrua, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jlnumero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(jlCNH)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jltipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlid)
                        .addGap(63, 63, 63)
                        .addComponent(jlidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jbcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlid)
                    .addComponent(jlidusuario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlnome))
                    .addComponent(jtfnomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCPF)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCidade)
                            .addComponent(jtfcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlrua))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlnumero)
                        .addComponent(jtfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbairro)
                    .addComponent(jtfcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCEP)
                    .addComponent(jcbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jltipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcadusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcadusu)
                    .addComponent(jlCadsenha)
                    .addComponent(jpfcadsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCNH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlformacao)
                    .addComponent(jtfFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbeditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbsalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfcadusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcadusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcadusuActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jtfnomeusuario.setEnabled(true);
        jtfCPF.setEnabled(true);
        jtfcidade.setEnabled(true);
        jtfbairro.setEnabled(true);
        jtfcadusu.setEnabled(true);
        jtfcep.setEnabled(true);
        jtfrua.setEnabled(true);
        jpfcadsenha.setEnabled(true);
        jtfnumero.setEnabled(true);
        jcbtipo.setEnabled(true);
        jcbtipo.setSelectedIndex(0);
        jbcancelar.setEnabled(true);
        jbsalvar.setEnabled(true);
        jtfFormacao.setEnabled(true);
        jtfCNH.setEnabled(true);
        try {
            extras.tratarFormularios.limparCampos(this);
        } catch (Exception ex) {
            Logger.getLogger(JIFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        acao=1;
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
    if(validarCampos()){
              if(preencherObjeto()){
                  if(acao==1){
                  try {
                      if(DAO.incluir(obj)){
                          JOptionPane.showMessageDialog(this, "Salvo com sucesso!", "Meu Sistema", JOptionPane.INFORMATION_MESSAGE);
                          jbcancelarActionPerformed(evt);
                      } else{
                          JOptionPane.showMessageDialog(this, "Não Salvou!");
                      }
                  } catch (Exception ex) {
                      Logger.getLogger(JIFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  }
                  if(acao==2){
                  try {
                      if(DAO.editar(obj)){
                          JOptionPane.showMessageDialog(this, "Atualizado com sucesso!", "Meu Sistema", JOptionPane.INFORMATION_MESSAGE);
                          jbcancelarActionPerformed(evt);
                      } else{
                          JOptionPane.showMessageDialog(this, "Não Atualizou!");
                      }
                  } catch (Exception ex) {
                      Logger.getLogger(JIFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  }
         }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jbsalvarActionPerformed

    private void jbeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditarActionPerformed
        try {
            tratarFormularios.habilitarCampos(this);
                    } catch (Exception ex) {
            Logger.getLogger(JIFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
       acao = 2;

    }//GEN-LAST:event_jbeditarActionPerformed

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        try {
            tratarFormularios.desabilitarCampos(this);
        } catch (Exception ex) {
            Logger.getLogger(JIFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtfPesquisar.setEnabled(true);
        jLabel2.setEnabled(true);
        jbNovo.setEnabled(true);
        try {
            extras.tratarFormularios.limparCampos(this);
        } catch (Exception ex) {
            Logger.getLogger(JIFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void jtfcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcidadeActionPerformed

    private void jtfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisarActionPerformed

    private void jtfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyReleased
        try {DefaultTableModel mp = (DefaultTableModel) jtbUsuarios.getModel();
            mp.setNumRows(0);
            if(jtfPesquisar.getText().length()>=0){
                listadeUsuarios=DAO.Pesquisar(jtfPesquisar.getText());
                for(Usuario u: listadeUsuarios){
                    mp.addRow(new String[]{""+u.getId(),u.getNome(),""+u.getCpf(),""+u.getTipo()});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:"+e.getMessage(),"Erro ao pesquisar",JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisarKeyReleased

    private void jtbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUsuariosMouseClicked
try {
            int linhaSelecionada = jtbUsuarios.getSelectedRow();
            if(linhaSelecionada>-1){
                jlidusuario.setText(""+listadeUsuarios.get(linhaSelecionada).getId());
                jtfnomeusuario.setText(listadeUsuarios.get(linhaSelecionada).getNome());
                jtfcadusu.setText(listadeUsuarios.get(linhaSelecionada).getUsuario());
                jpfcadsenha.setText(listadeUsuarios.get(linhaSelecionada).getSenha());
                jtfCPF.setText(""+listadeUsuarios.get(linhaSelecionada).getCpf());
                jtfcidade.setText(listadeUsuarios.get(linhaSelecionada).getCidade());
                jtfrua.setText(listadeUsuarios.get(linhaSelecionada).getRua());
                jtfnumero.setText(""+listadeUsuarios.get(linhaSelecionada).getNumero());
                jtfbairro.setText(listadeUsuarios.get(linhaSelecionada).getBairro());
                jtfcep.setText(""+listadeUsuarios.get(linhaSelecionada).getCep());
                jcbtipo.setSelectedIndex(listadeUsuarios.get(linhaSelecionada).getTipo());
                jtfFormacao.setText(listadeUsuarios.get(linhaSelecionada).getFormacao());
                jtfCNH.setText(listadeUsuarios.get(linhaSelecionada).getCnh());
                jbeditar.setEnabled(true);
                jbExcluir.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:"+e.getMessage(),"Erro ao pesquisar",JOptionPane.ERROR_MESSAGE);
        }     
// TODO add your handling code here:
    }//GEN-LAST:event_jtbUsuariosMouseClicked

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
try {
            if (DAO.excluir(Integer.parseInt(jlidusuario.getText()))) {
                JOptionPane.showMessageDialog(this, "Excluído com sucesso!", "Meu sistema", JOptionPane.INFORMATION_MESSAGE);
                jbeditar.setEnabled(false);
                jbExcluir.setEnabled(false);
                tratarFormularios.limparCampos(this);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtfPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPesquisarMouseClicked
    jtfPesquisar.setText("");
    }//GEN-LAST:event_jtfPesquisarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbeditar;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JComboBox<String> jcbtipo;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCNH;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCadsenha;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlbairro;
    private javax.swing.JLabel jlcadusu;
    private javax.swing.JLabel jlformacao;
    private javax.swing.JLabel jlid;
    private javax.swing.JLabel jlidusuario;
    private javax.swing.JLabel jlnome;
    private javax.swing.JLabel jlnumero;
    private javax.swing.JLabel jlrua;
    private javax.swing.JLabel jltipo;
    private javax.swing.JPasswordField jpfcadsenha;
    private javax.swing.JTable jtbUsuarios;
    private javax.swing.JTextField jtfCNH;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfFormacao;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfbairro;
    private javax.swing.JTextField jtfcadusu;
    private javax.swing.JTextField jtfcep;
    private javax.swing.JTextField jtfcidade;
    private javax.swing.JTextField jtfnomeusuario;
    private javax.swing.JTextField jtfnumero;
    private javax.swing.JTextField jtfrua;
    // End of variables declaration//GEN-END:variables

private boolean validarCampos(){
    String msg = "";
    if(jtfnomeusuario.getText().length()<3)
        msg+="\nO nome deve ter pelo menos 3 caracteres";
    if(jtfnomeusuario.getText().length()>100)
        msg+="\nO nome deve ter menos de 100 caracteres"; 
    if(jpfcadsenha.getText().length()<5)
        msg+="\nA senha deve ter pelo menos 5 caracteres";
    if(jpfcadsenha.getText().length()>20)
        msg+="\nA senha deve ter no máximo 20 caracteres";
    if(jcbtipo.getSelectedIndex()==0)
        msg+="\nSelecione um tipo";
    if(jtfCPF.getText().length()<11)
        msg+="\nDigite o CPF Correto";
    if(jtfcadusu.getText().length()<1)
        msg+="\nO Usuário deve ter no mínimo 1 caractere";
    if(jtfcadusu.getText().length()>10)
        msg+="\nO Usuário deve ter no máximo 10 caracteres";
    if(msg.length()==0)
       return true;
    else{
       JOptionPane.showMessageDialog(this, "Corrija os seguintes campos" + msg, "Meu sistema", JOptionPane.ERROR_MESSAGE);
       return false;
    }
}
private boolean preencherObjeto(){
    obj.setId(Integer.parseInt(jlidusuario.getText()));
    obj.setNome(jtfnomeusuario.getText());
    obj.setUsuario(jtfcadusu.getText());
    obj.setSenha(jpfcadsenha.getText());
    obj.setTipo(jcbtipo.getSelectedIndex());
    obj.setCidade(jtfcidade.getText());
    obj.setBairro(jtfbairro.getText());
    obj.setCep(Integer.parseInt(jtfcep.getText()));
    obj.setCnh(jtfCNH.getText());
    obj.setFormacao(jtfFormacao.getText());
    obj.setNumero(Integer.parseInt(jtfnumero.getText()));
    obj.setRua(jtfrua.getText());
    obj.setCpf(Long.parseLong(jtfCPF.getText()));
    
    return true;
}
}
