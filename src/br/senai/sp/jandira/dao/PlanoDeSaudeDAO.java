package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    private static  final String ARQUIVO = "C:\\Users\\22282076\\java\\plano_de_saude.txt";
    private static  final String ARQUIVO_TEMP = "C:\\Users\\22282076\\java\\plano_de_saude_temp.txt";
    private static final  Path PATH = Paths.get(ARQUIVO);
   private static final  Path PATH__TEMP = Paths.get(ARQUIVO_TEMP);
    
//------------------------------------------------------------------------------
    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
         try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            String novoPlanoDeSaude = planoDeSaude.getPlanoDeSaudeSeparado();
            
            bw.write(novoPlanoDeSaude);
         
            bw.newLine();
            bw.write(this.planoDeSaude.getPlanoDeSaudeSeparado());
            bw.write("conteudo gravado");
            bw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
            null,
            "erro ao gravar", 
            "erro de gravação",
            JOptionPane.ERROR_MESSAGE);
        }
    }
//------------------------------------------------------------------------------
    public PlanoDeSaudeDAO() {

    }
//------------------------------------------------------------------------------
    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);
        
        try {
            // gravar planos de saude em arquivo txt
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write(planoDeSaude.getPlanoDeSaudeSeparado());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao gravar o plano de saúde. \n\nEntre em contato com o suporte.",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
   
    //--------------------------------------------------------------------------
    //especialidades
    public static boolean excluir(Integer codigo) {
        for(PlanoDeSaude p : planos) {
            if(p.getCodigo().equals(codigo)){
                planos.remove(p);
               break;
            }
        }
        return false;
}
    //--------------------------------------------------------------------------
    //RECOSTRUI ARQUIVO ATUALIZADO
    
 ///REFAZER ISTO
    //criar uma representação dos arquivos que serão manipulados
   private static void atualizarArquivo() {
   
   File arquivoAtual = new File(ARQUIVO);
   File arquivoTemp = new File(ARQUIVO_TEMP);
   
    try {
            //Criar arquivo temporário
            arquivoTemp.createNewFile();

            // Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH__TEMP, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
                    

            //Iterar na lista para adicionar os planos no arquivo temporário
            for (PlanoDeSaude p : planos) {
                bwTemp.write(p.getPlanoDeSaudeSeparado());
                bwTemp.newLine();
            }
            
             //Fechar o arquivo temporario
            bwTemp.close();

            //Excluir arquivo atual - plano_de_saude.txt
            arquivoAtual.delete();

            // Renomear arquivo temporário 
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
   
   
   }
   
    
    //------------------------------------------------------------------------------
    public static  PlanoDeSaude getPlanoDeSaude(Integer codigo){
       for(PlanoDeSaude p:planos){
        if (p.getCodigo().equals(codigo)){
          return p;
       }
     }
        
        return null;
    }
    
    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }
    //--------------------------------------------------------------------------
 

    public static void getListaPlanosDeSaude() {

        //Abrir o arquivo para leitura
        try {
            BufferedReader br = Files.newBufferedReader(PATH);
            String linha = "";

            linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                System.out.println(linhaVetor[0]);
                PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude(
                        Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]);

                planos.add(novoPlanoDeSaude);
                linha = br.readLine();
            }

            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.", "Erro na leitura", JOptionPane.ERROR_MESSAGE);
        }
    //--------------------------------------------------------------------------
    // PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze");
            // PlanoDeSaude p2 = new PlanoDeSaude("Unimed", "Ouro");
            //PlanoDeSaude p3 = new PlanoDeSaude("Amil", "Advanced");
            // PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Exclusive");
            // planos.add(p1);
            //planos.add(p2);
            //planos.add(p3);
            //planos.add(p4);
    
    //--------------------------------------------------------------------------

}    public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Nome da operadora", "Tipo do plano"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }
//------------------------------------------------------------------------------





}
