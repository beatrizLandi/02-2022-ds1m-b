/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesDAO {

    //atributos
    private Especialidade especialidade;
    //listas
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282076\\java\\especialidades";
    private static final  Path PATH = Paths.get(ARQUIVO);
   
            
//------------------------------------------------------------------------------
    //metodosS2
    public EspecialidadesDAO(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }
//------------------------------------------------------------------------------
    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
        //gravar a especialidades2s2
         try {
            // gravar planos de saude em arquivo txt
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            bw.write(especialidade.getEspecialidadeSeparado());
            bw.newLine();
            bw.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao gravar a especialidade. \n\nEntre em contato com o suporte.", 
                    "Erro ", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
//------------------------------------------------------------------------------
    public static boolean excluir(Integer codigo) {
        for (Especialidade p : especialidades) {
            if (p.getCodigoEspecialidade().equals(codigo)) {
                especialidades.remove(p);
                return true;
            }
        }
        return false;

    }
    
    //--------------------------------------------
    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade p : especialidades) {
            if (p.getCodigoEspecialidade().equals(codigo)) {
                return p;
            }
        }

        return null;
    }
//-------------------------------------------
    public static void alterar(Especialidade especialidade) {

        for (Especialidade p : especialidades) {
            if (p.getCodigoEspecialidade().equals(especialidade.getCodigoEspecialidade())) {
                especialidades.set(especialidades.indexOf(p), especialidade);
                break;
            }

        }
    }
//-----------------------------------------------------------------------------------------
    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public static void getEspecialidadesTeste() {
       // Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração");
        //Especialidade e2 = new Especialidade("hematologia", "especialista em identificar e tratar problemas no sangue");
        //Especialidade e3 = new Especialidade("angiologista", "especialista em diagnosticar e tratar doenças do sistemas venoso.");
        //especialidades.add(e1);
        //especialidades.add(e2);
       // especialidades.add(e3);

    }
//-------------------------------------------------------------------------------------------------------------
    public static DefaultTableModel getTableModel() {

        Object[][] dados = new Object[especialidades.size()][3];

        int i = 0;
        for (Especialidade p : especialidades) {
            dados[i][0] = p.getCodigoEspecialidade();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getDescricao();
            i++;
        }
        // Defnir um vetor com os nomes das colunas da tabela 
        String[] titulos = {"Código", "Nome da especialidade ", "Descrição"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }
//----------------------------------------------------------------------------------
}
