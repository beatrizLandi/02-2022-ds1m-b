/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

///-----------------------------------------------------------------------------------
public class EspecialidadesPanel extends javax.swing.JPanel {

    int linha;
    
    public EspecialidadesPanel(){
        initComponents();
        criarTabelaEspecialidadess();
    
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        scrollTableEspecialidade = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonAlterarEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("♡❤ESPECIALIDADES❤♡");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 230, 20);

        tableEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTableEspecialidade.setViewportView(tableEspecialidades);

        add(scrollTableEspecialidade);
        scrollTableEspecialidade.setBounds(20, 40, 905, 240);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(700, 294, 70, 60);

        buttonAlterarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarEspecialidade.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAlterarEspecialidade);
        buttonAlterarEspecialidade.setBounds(780, 294, 70, 60);

        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/7847520_hospital_clinic_covid_icon.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(860, 294, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed

       //--------------------------------------------------------------------------------------------------------------------------
        //obetnhamos linha selecionada na tabela
       linha = tableEspecialidades.getSelectedRow();
        
        if (linha != -1 ){
            // Excluir especialidade
            excluir();
            
        } else {
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor, selecione a especialidade que você deseja excluir!",
                    "Especialidades",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed
//-------------------------------------------------------------------------------------------------------------------------------------
    private void buttonAlterarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEspecialidadeActionPerformed

        linha = tableEspecialidades.getSelectedRow();
        if (linha != -1) {
            editar();
        } else {

            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione a especialidade de saúde que você deseja alterar!",
                "Especialidade",
                JOptionPane.WARNING_MESSAGE
                );

        }

    }//GEN-LAST:event_buttonAlterarEspecialidadeActionPerformed
//--------------------------------------------------------------------------------------------------------------
    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed

        
        //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
         EspecialidadeDialog especialidadeDialog = 
                new EspecialidadeDialog(
                        null, 
                        true,
                        TipoOperacao.ADICIONAR,
                        null);
        
        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidadess();
        

    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed
//-------------------------------------------------------------------------------------------
private void editar() {
        
        Especialidade especialidade = EspecialidadesDAO.getEspecialidade(getCodigo());
        
        EspecialidadeDialog especialidadeDialog = 
                new EspecialidadeDialog(
                        null, 
                        true, 
                        TipoOperacao.ALTERAR, 
                        especialidade);
        
        especialidadeDialog.setVisible(true);
        
        criarTabelaEspecialidadess();
    }
    //---------------------------------------------------------------------------------
    private void excluir(){
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Voce,confirma a exclusao da especialidade de saude selecionado?", 
                "Especialidade", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        
        if (resposta ==0){
            String codigoStr = tableEspecialidades.getValueAt(linha, 0).toString();
            Integer codigo = Integer.valueOf(codigoStr);
            EspecialidadesDAO.excluir(codigo);
            criarTabelaEspecialidadess();
        }
        
    
    }
    //-------------------------------------------------------------------------------
     private Integer getCodigo() {
        String codigoStr = tableEspecialidades.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }

    //-----------------------------------------------------------------------------------
      private Integer retornarCodigoSelecionadoEspecialidade(){
     return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonAlterarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTableEspecialidade;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

   private void criarTabelaEspecialidadess() {

        tableEspecialidades.setModel(EspecialidadesDAO.getTableModel());

        // Desativar o redimensionamento da JTable
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(300);

        // Impedir/bloquear a movimentação das colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tableEspecialidades.setDefaultEditor(Object.class, null);

    }
 

}
