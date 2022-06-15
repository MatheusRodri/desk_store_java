/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho;

import dao.FuncionarioDAO;
import entidade.Funcionario;

import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author deprilula
 */
public class Tela_Consultar_Funcionarios extends javax.swing.JFrame {

    boolean atendente;

    /**
     * Creates new form Tela_Consultar_Funcionarios
     */
    public Tela_Consultar_Funcionarios(boolean gerente) {
        initComponents();
        this.setLocationRelativeTo(null);
        if (gerente) {
            atendente= true;
            atualizarFunc.setVisible(true);
            removerFunc.setVisible(true);
            cadastrarFuncionarios.setVisible(true);
        } else {
            atendente = false;
            atualizarFunc.setVisible(false);
            removerFunc.setVisible(false);
            cadastrarFuncionarios.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();
        removerFunc = new javax.swing.JButton();
        atualizarFunc = new javax.swing.JButton();
        cadastrarFuncionarios = new javax.swing.JButton();
        ordenarTabela = new javax.swing.JComboBox<>();
        botaoVoltarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaFuncionarios);

        removerFunc.setText("Remover");
        removerFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerFuncMouseClicked(evt);
            }
        });

        atualizarFunc.setText("Atualizar");
        atualizarFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarFuncMouseClicked(evt);
            }
        });

        cadastrarFuncionarios.setText("Cadastrar");
        cadastrarFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarFuncionariosMouseClicked(evt);
            }
        });
        cadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionariosActionPerformed(evt);
            }
        });

        ordenarTabela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alfabético (Crescente)", "Alfabético (Decrescente)", "Data de Cadastro (Crescente)", "Data de Cadastro (Decrescente)" }));
        ordenarTabela.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ordenarTabelaItemStateChanged(evt);
            }
        });
        ordenarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarTabelaActionPerformed(evt);
            }
        });

        botaoVoltarFuncionario.setText("Voltar");
        botaoVoltarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarFuncionarioMouseClicked(evt);
            }
        });
        botaoVoltarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ordenarTabela, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removerFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atualizarFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(botaoVoltarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(atualizarFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ordenarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addComponent(cadastrarFuncionarios)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltarFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarFuncionariosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Carregar tabela quando janela abre
        atualizarTabela();
    }//GEN-LAST:event_formWindowOpened

    private void ordenarTabelaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ordenarTabelaItemStateChanged
        // Carregar tabela quando ordem mudar
        atualizarTabela();
    }//GEN-LAST:event_ordenarTabelaItemStateChanged

    private void removerFuncMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        List<Funcionario> funcionarios = listaFuncionarios();
        int[] selecionados = tabelaFuncionarios.getSelectedRows();
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.conectar();

        for (int i = 0; i < tabelaFuncionarios.getSelectedRowCount(); i++) {
            int item = selecionados[i];
            dao.remover(funcionarios.get(item).getId());
        }
        atualizarTabela();
    }

    private void atualizarFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarFuncMouseClicked
        if (tabelaFuncionarios.getSelectedRowCount() > 0) {
            int i = tabelaFuncionarios.getSelectedRows()[0];
            Funcionario funcionario = listaFuncionarios().get(i);

            // Abrir tela de cadastro de funcionário com os dados desse funcionário para atualizar
            Tela_Cadastro_Funcionario tela = new Tela_Cadastro_Funcionario();
            tela.nome.setText(funcionario.getNome());
            tela.email.setText(funcionario.getEmail());
            tela.senha.setText(funcionario.getSenha());
            tela.endereco.setText(funcionario.getEndereco());
            tela.salario.setText(String.valueOf(funcionario.getSalario()));
            tela.end_numero.setText(String.valueOf(funcionario.getNumero()));
            tela.setId(funcionario.getId());
            tela.setVisible(true);
        }
    }//GEN-LAST:event_atualizarFuncMouseClicked

    private void cadastrarFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFuncionariosMouseClicked
        // Abrir tela de cadastro de funcionário sem dados para cadastrar
        Tela_Cadastro_Funcionario tela = new Tela_Cadastro_Funcionario();
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarFuncionariosMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // Atualizar tabela quando clicar na janela
        atualizarTabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void ordenarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarTabelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenarTabelaActionPerformed

    private void botaoVoltarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarFuncionarioMouseClicked
        
        if (atendente) {
            Tela_Menu menu = new Tela_Menu(true);
            menu.setVisible(true);
            this.dispose();
        }else{
            Tela_Menu menu = new Tela_Menu(false);
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoVoltarFuncionarioMouseClicked

    private void botaoVoltarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltarFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarFunc;
    private javax.swing.JButton botaoVoltarFuncionario;
    private javax.swing.JButton cadastrarFuncionarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> ordenarTabela;
    private javax.swing.JButton removerFunc;
    private javax.swing.JTable tabelaFuncionarios;
    // End of variables declaration//GEN-END:variables

    private List<Funcionario> listaFuncionarios() {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.conectar();

        String ordenarItem;
        boolean ordenarCrescente;
        switch (ordenarTabela.getSelectedIndex()) {
            // Alfabético Crescente
            case 0:
                ordenarItem = "nome";
                ordenarCrescente = true;
                break;
            // Alfabético Decrescente
            case 1:
                ordenarItem = "nome";
                ordenarCrescente = false;
                break;
            // Data Crescente
            case 2:
                ordenarItem = "data_de_cadastrado";
                ordenarCrescente = true;
                break;
            // Data Decrescente
            case 3:
                ordenarItem = "data_de_cadastrado";
                ordenarCrescente = false;
                break;
            default:
                return null;
        }

        return dao.listarFuncionarios(ordenarItem, ordenarCrescente);
    }

    private void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelaFuncionarios.getModel();
        model.setNumRows(0);
        String[] colunas = new String[]{
            "Nome", "E-mail", "Endereço", "Número", "Salário", "Data de Cadastro"
        };
        model.setColumnIdentifiers(colunas);

        List<Funcionario> funcionarios = listaFuncionarios();

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            model.addRow(new Object[]{
                funcionario.getNome(),
                funcionario.getEmail(),
                funcionario.getEndereco(),
                funcionario.getNumero(),
                funcionario.getSalario(),
                
                funcionario.getDataDecadastrado(),});
        }
    }
}
