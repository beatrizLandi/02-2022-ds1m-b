/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;

/**
 *
 * @author sn1006137
 */
public class PlanosDeSaudeDialog extends javax.swing.JDialog {

    /**
     * Creates new form PlanosDeSaudeDialog
     */
    public PlanosDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        text_Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNomeDaOperadora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textTipoDoPlano = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        jLabel1.setText("Cadastro de Planos de Saúde - NOVO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 530, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do plano de saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setText("Código:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 50, 110, 16);

        text_Codigo.setEditable(false);
        jPanel2.add(text_Codigo);
        text_Codigo.setBounds(30, 70, 71, 30);

        jLabel3.setText("Nome da operadora:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 110, 230, 16);
        jPanel2.add(textNomeDaOperadora);
        textNomeDaOperadora.setBounds(30, 130, 500, 30);

        jLabel4.setText("Tipo de plano:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 170, 230, 16);

        textTipoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textTipoDoPlano);
        textTipoDoPlano.setBounds(30, 190, 500, 30);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(370, 260, 80, 60);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar Cadastro");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(460, 260, 80, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 60, 560, 340);

        setBounds(0, 0, 602, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void textTipoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoDoPlanoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // Criar um objeto Plano de Saúde
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());
        
        if (validarCadastro()){
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Plano de saúde gravado com sucesso!", 
                    "Plano de Saúde", 
                    JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        }
        
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private boolean validarCadastro() {
        
        if (textNomeDaOperadora.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor preencha o nome da operadora!", 
                    "Plano de Saúde", 
                    JOptionPane.ERROR_MESSAGE);
            
            textNomeDaOperadora.requestFocus();
            
            return false;
            
        }
        
        if (textTipoDoPlano.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor preencha o tipo do plano!", 
                    "Plano de Saúde", 
                    JOptionPane.ERROR_MESSAGE);
            
            textTipoDoPlano.requestFocus();
            
            return false;
            
        }
        
        return true;
        
    }
    
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
            java.util.logging.Logger.getLogger(PlanosDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanosDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanosDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanosDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlanosDeSaudeDialog dialog = new PlanosDeSaudeDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textNomeDaOperadora;
    private javax.swing.JTextField textTipoDoPlano;
    private javax.swing.JTextField text_Codigo;
    // End of variables declaration//GEN-END:variables
}
