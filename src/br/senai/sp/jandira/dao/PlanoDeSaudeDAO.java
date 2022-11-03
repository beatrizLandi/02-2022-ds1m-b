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
        
        try {
            //abrir p leitura
            
            BufferedReader br = Files.newBufferedReader(PATH);
            
            String linha = br.readLine();
            
            //loping while
            
            while (linha != null && linha.isEmpty()) {
            String[] linhaVetor = linha.split(";");
            PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude(
                    Integer.valueOf(linhaVetor[0]),
                    linhaVetor[1],
                    linhaVetor[2]);
                //colocar dentro da lista
                
                planos.add(novoPlanoDeSaude);
                //fechar o luping
                linha = br.readLine();
         }
            br.close();        
            
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, 
                   "erroao abrir",
                   "erro de leitura", 
                   JOptionPane.ERROR_MESSAGE);
        }
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
    public static DefaultTableModel getTableModel() {

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
