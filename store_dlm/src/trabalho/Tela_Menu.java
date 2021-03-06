/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho;

/**
 *
 * @author mathe
 */
public class Tela_Menu extends javax.swing.JFrame {

    boolean atendente;
    public Tela_Menu(boolean gerente) {
        initComponents();
        this.setLocationRelativeTo(null);
        if(gerente){
            menuFuncionario.setVisible(true);
            menuRelatorio.setVisible(true);
            atendente = false;
                    
        }else{
            menuRelatorio.setVisible(false);
            atendente = true;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        voltarMenu = new javax.swing.JMenu();
        menuFuncionario = new javax.swing.JMenu();
        menuVendas = new javax.swing.JMenu();
        menuRelatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        voltarMenu.setText("Voltar");
        voltarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(voltarMenu);

        menuFuncionario.setText("Funcionario");
        menuFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFuncionarioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuFuncionario);

        menuVendas.setText("Vendas");
        menuVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVendasMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVendas);

        menuRelatorio.setText("Relatorio");
        menuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRelatorioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncionarioMouseClicked
       if (atendente) {
        Tela_Consultar_Funcionarios tela = new Tela_Consultar_Funcionarios(false);
        tela.setVisible(true);
        this.dispose();
        }else{
            
            
        Tela_Consultar_Funcionarios tela = new Tela_Consultar_Funcionarios(true);
        tela.setVisible(true);
        this.dispose();
        }
        
    }//GEN-LAST:event_menuFuncionarioMouseClicked

    private void menuVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVendasMouseClicked
        if (atendente) {
            Tela_Venda venda = new Tela_Venda(true);
            venda.setVisible(true);
            this.dispose();
        }else{
            
            
            Tela_Venda venda = new Tela_Venda(false);
            venda.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_menuVendasMouseClicked

    private void menuRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRelatorioMouseClicked
       Tela_Relatorio tela = new Tela_Relatorio();
       tela.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_menuRelatorioMouseClicked

    private void voltarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMenuMouseClicked
       Tela_login login = new Tela_login();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_voltarMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuFuncionario;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuVendas;
    private javax.swing.JMenu voltarMenu;
    // End of variables declaration//GEN-END:variables
}
