
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class MedicosDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;
    
    //----------------------------------------------------------------------------        
    public MedicosDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico) {
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao; 
        this.medico = medico;
        
        //prencher campos
        if(tipoOperacao== TipoOperacao.ALTERAR){
            preecherFormulario();
        
        }
   }
    
   //--------------------------------------------------------------------------- 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        text_Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        textTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textDataNascimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textNomeDoMedico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textCRM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        buttonCancelar1 = new javax.swing.JButton();
        moverDireitaParaEsquerda = new javax.swing.JButton();
        moverDireitaParaEsquerda1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEspecialidadesMedicas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEspecialidades = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/7847520_hospital_clinic_covid_icon.png"))); // NOI18N
        jLabel1.setText("Adicionar medico a nossa equipe  ♡ ♡ ♡");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 530, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 50);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da(o) médica(o):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(51, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("Código:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 50, 50, 16);

        text_Codigo.setEditable(false);
        text_Codigo.setBackground(new java.awt.Color(204, 204, 204));
        text_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_CodigoActionPerformed(evt);
            }
        });
        jPanel2.add(text_Codigo);
        text_Codigo.setBounds(20, 70, 90, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Telefone");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(590, 170, 110, 20);

        textEmail.setBackground(new java.awt.Color(204, 204, 204));
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        jPanel2.add(textEmail);
        textEmail.setBounds(130, 190, 450, 30);

        buttonSalvar.setBackground(new java.awt.Color(204, 204, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar Cadastro");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(660, 330, 80, 60);

        textTelefone.setBackground(new java.awt.Color(204, 204, 204));
        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(textTelefone);
        textTelefone.setBounds(590, 190, 150, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Data Nascimento");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 170, 100, 16);

        textDataNascimento.setBackground(new java.awt.Color(204, 204, 204));
        textDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(textDataNascimento);
        textDataNascimento.setBounds(20, 190, 90, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("E-MAIL");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(170, 170, 110, 16);

        textNomeDoMedico.setBackground(new java.awt.Color(204, 204, 204));
        textNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(280, 70, 460, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("NOME MEDICO");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(290, 50, 110, 16);

        textCRM.setBackground(new java.awt.Color(204, 204, 204));
        textCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCRMActionPerformed(evt);
            }
        });
        jPanel2.add(textCRM);
        textCRM.setBounds(120, 70, 150, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("CRM");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(120, 50, 50, 16);

        buttonCancelar1.setBackground(new java.awt.Color(204, 204, 204));
        buttonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar1);
        buttonCancelar1.setBounds(570, 330, 80, 60);

        moverDireitaParaEsquerda.setBackground(new java.awt.Color(102, 0, 0));
        moverDireitaParaEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/2638290_arrow_dirrection_dyagonal_scale_symbol_icon.png"))); // NOI18N
        moverDireitaParaEsquerda.setText("mover");
        moverDireitaParaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverDireitaParaEsquerdaActionPerformed(evt);
            }
        });
        jPanel2.add(moverDireitaParaEsquerda);
        moverDireitaParaEsquerda.setBounds(230, 270, 60, 40);

        moverDireitaParaEsquerda1.setBackground(new java.awt.Color(102, 0, 0));
        moverDireitaParaEsquerda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/9110918_arrow_reply_all_icon.png"))); // NOI18N
        moverDireitaParaEsquerda1.setText("mover");
        moverDireitaParaEsquerda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverDireitaParaEsquerda1ActionPerformed(evt);
            }
        });
        jPanel2.add(moverDireitaParaEsquerda1);
        moverDireitaParaEsquerda1.setBounds(230, 320, 60, 40);

        listEspecialidadesMedicas.setBackground(new java.awt.Color(204, 204, 204));
        listEspecialidadesMedicas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listEspecialidadesMedicas);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(310, 276, 170, 120);

        listaEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        listaEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaEspecialidades);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(30, 270, 170, 130);

        jLabel8.setText("Lista Especialidades");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 250, 170, 16);

        jLabel9.setText("Especialidades do medico");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(310, 260, 170, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 770, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

//------------------------------------------------------------------------------        

        Medico medico = new Medico();
        
        medico.setCrm(textEmail.getText());
        medico.setEmail(textEmail.getText());
        medico.setNome(textNomeDoMedico.getText());
        medico.setTelefone(textTelefone.getText());
       
        
        
        
        
        if (validarCadastroMedico()){
           MedicoDAO.gravar(medico);

            JOptionPane.showMessageDialog(
                this,
                "Novo medico gravado com sucesso!",
                "Medico",
                JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
//------------------------------------------------------------------------------
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void text_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_CodigoActionPerformed
        
    }//GEN-LAST:event_text_CodigoActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataNascimentoActionPerformed

    private void textNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDoMedicoActionPerformed

    private void textCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCRMActionPerformed

    private void moverDireitaParaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverDireitaParaEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moverDireitaParaEsquerdaActionPerformed

    private void moverDireitaParaEsquerda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverDireitaParaEsquerda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moverDireitaParaEsquerda1ActionPerformed

    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed
      
    }//GEN-LAST:event_buttonCancelar1ActionPerformed
//-----------------------------------------------------------------------------------
  private boolean validarCadastroMedico() {
        
        if (textNomeDoMedico.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor preencha o nome da medico!", 
                    "medico", 
                    JOptionPane.ERROR_MESSAGE);
            
            textNomeDoMedico.requestFocus();
            
            return false;
            
        }
        
        if (textEmail.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor preencha o email do medico !", 
                    "Medico", 
                    JOptionPane.ERROR_MESSAGE);
            
            textEmail.requestFocus();
            
            return false;
            
        }
        
        if (textTelefone.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor preencha o telefone do medico!", 
                    "medico", 
                    JOptionPane.ERROR_MESSAGE);
            
            textTelefone.requestFocus();
            
            return false;
            
        }
        
        
        if (textCRM.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor preencha o crm do medico!", 
                    "medico", 
                    JOptionPane.ERROR_MESSAGE);
            
            textCRM.requestFocus();
            
            return false;
            
        }
        
         if (textDataNascimento.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor preencha a data de nascimento do medico!", 
                    "medico", 
                    JOptionPane.ERROR_MESSAGE);
            
            textDataNascimento.requestFocus();
            
            return false;
            
        }
        
        return true;
        
    }
    
//-----------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listEspecialidadesMedicas;
    private javax.swing.JList<String> listaEspecialidades;
    private javax.swing.JButton moverDireitaParaEsquerda;
    private javax.swing.JButton moverDireitaParaEsquerda1;
    private javax.swing.JTextField textCRM;
    private javax.swing.JTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    private javax.swing.JTextField text_Codigo;
    // End of variables declaration//GEN-END:variables

    private void preecherFormulario() {
      textEmail.setText(medico.getEmail());
      textCRM.setText(medico.getCrm());
      textNomeDoMedico.setText(medico.getNome());
      textTelefone.setText(medico.getTelefone());
      textEmail.setText(medico.getEmail());
      
      
    }
}
