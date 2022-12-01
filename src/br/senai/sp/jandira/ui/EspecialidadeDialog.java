
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;


public class EspecialidadeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;

    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Especialidade especialidade) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade;

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormularioESpecialidade();
        }

    }

    private void preencherFormularioESpecialidade() {

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        text_Codigo.setText(especialidade.getCodigoEspecialidade().toString());
        textNomeDaEspecialidade.setText(especialidade.getNome());
        textDescricao.setText(especialidade.getDescricao());
    }

    @SuppressWarnings("unchecked")
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
        textDescricao = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(250, 500));
        setPreferredSize(new java.awt.Dimension(250, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/7847520_hospital_clinic_covid_icon.png"))); // NOI18N
        jLabel1.setText("Cadastro de Especialidades - NOVO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 530, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 50);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(51, 0, 0))); // NOI18N
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
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Descrição:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 170, 230, 16);

        textDescricao.setBackground(new java.awt.Color(204, 204, 204));
        textDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescricaoActionPerformed(evt);
            }
        });
        jPanel2.add(textDescricao);
        textDescricao.setBounds(30, 190, 500, 30);

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

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        jPanel2.add(jButton1);
        jButton1.setBounds(365, 260, 80, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 60, 560, 340);

        setBounds(0, 0, 602, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void textDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDescricaoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // Criar um objeto Plano de Saúde

        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());

        if (validarCadastro()) {
            EspecialidadesDAO.gravar(especialidade);

            JOptionPane.showMessageDialog(
                    this,
                    "especialidade gravada com sucesso!",
                    "especialidades",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textNomeDaEspecialidade;
    private javax.swing.JTextField text_Codigo;
    // End of variables declaration//GEN-END:variables

    private boolean validarCadastro() {
        if (textNomeDaEspecialidade.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome da especialidade!",
                    "especialidade",
                    JOptionPane.ERROR_MESSAGE);

            textNomeDaEspecialidade.requestFocus();

            return false;

        }

        if (textDescricao.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o descrição da especialidadeo!",
                    "especialidade",
                    JOptionPane.ERROR_MESSAGE);

            textDescricao.requestFocus();

            return false;

        }

        return true;
    }

}
