/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;


import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.model.TipoOperacao;
import java.awt.Frame;

import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JPanel {

     
   private TipoOperacao tipoOperacao;
    private Especialidade especialidade;

    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Especialidade especialidade) {

        //super(parent,modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
        
        
    }
 
    
    private void preencherFormulario(){
        
        
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sena/sp/jandira/imagens/")));
        text_Codigo.setText(especialidade.getCodigoEspecialidade().toString());
        textNomeDaEspecialidade.setText(especialidade.getNome());
        textDescricaoEspecialidade.setText(especialidade.getDescricao());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        text_Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNomeDaEspecialidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textDescricaoEspecialidade = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(810, 50));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/7847520_hospital_clinic_covid_icon.png"))); // NOI18N
        jLabel1.setText("Cadastro de Especialidade - NOVO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 530, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 50);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(560, 340));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("Código:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 50, 110, 16);

        text_Codigo.setEditable(false);
        text_Codigo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(text_Codigo);
        text_Codigo.setBounds(30, 70, 71, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Nome da especialidade:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 110, 230, 16);

        textNomeDaEspecialidade.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(textNomeDaEspecialidade);
        textNomeDaEspecialidade.setBounds(30, 130, 500, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Descrição especialidade:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 170, 230, 16);

        textDescricaoEspecialidade.setBackground(new java.awt.Color(204, 204, 204));
        textDescricaoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescricaoEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textDescricaoEspecialidade);
        textDescricaoEspecialidade.setBounds(30, 190, 500, 30);

        buttonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(370, 260, 80, 60);

        buttonSalvar.setBackground(new java.awt.Color(204, 204, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar Cadastro");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(460, 260, 80, 60);

        add(jPanel2);
        jPanel2.setBounds(0, 90, 810, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void textDescricaoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescricaoEspecialidadeActionPerformed
     
    }//GEN-LAST:event_textDescricaoEspecialidadeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
           
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed
  private void atualizar() {
        
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricaoEspecialidade.getText());

        if (validarCadastro()) {
            EspecialidadesDAO.alterar(especialidade);
            
            JOptionPane.showMessageDialog(
                    null,
                    "Especialidade atualizada com sucesso!",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);

            //dispose();
        }
    }
            
      private void gravar() {
        //Criar um objeto plano de saúde 
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricaoEspecialidade.getText());

        if (validarCadastro()) {
            EspecialidadesDAO.gravar(especialidade);

            JOptionPane.showMessageDialog(
                    this,
                    "Especialidade gravada com sucesso!",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
          //  dispose();
        }
    }
    
    private boolean validarCadastro() {
        if (textNomeDaEspecialidade.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o nome da especialidade!",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);

            textNomeDaEspecialidade.requestFocus();

            return false;
        }
        if (textDescricaoEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha a descrição da especialidade!",
                    "Plano de saúde",
                    JOptionPane.ERROR_MESSAGE);

            textDescricaoEspecialidade.requestFocus();

            return false;
        }
        return true;
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
    private javax.swing.JTextField textDescricaoEspecialidade;
    private javax.swing.JTextField textNomeDaEspecialidade;
    private javax.swing.JTextField text_Codigo;
    // End of variables declaration//GEN-END:variables
 
}
