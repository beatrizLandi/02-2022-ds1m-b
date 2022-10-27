/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;


public class EspecialidadesDAO {
    //atributos
    private Especialidade especialidade;
    //listas
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    
    //metodosS2
    
    public EspecialidadesDAO (Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }
    
     public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }
         
         public static boolean excluir(Integer codigo) {
        for (Especialidade p : especialidades) {
            if (p.getCodigoEspecialidade().equals(codigo)) {
                especialidades.remove(p);
                return true;
            }
        }
        return false;

    }
    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade p : especialidades) {
            if (p.getCodigoEspecialidade().equals(codigo)) {
                return p;
            }
        }

        return null;
    }
    
    
    public static void alterar(Especialidade especialidade) {

        for (Especialidade p : especialidades) {
            if (p.getCodigoEspecialidade().equals(especialidade.getCodigoEspecialidade())) {
                especialidades.set(especialidades.indexOf(p), especialidade);
                break;
            }

        }
    }
    
    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }
    
    public static void criarEspecialidadesTeste() {
        Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração");
        Especialidade e2 = new Especialidade("hematologia", "especialista em identificar e tratar problemas no sangue");
        Especialidade e3 = new Especialidade("angiologista", "especialista em diagnosticar e tratar doenças do sistemas venoso.");
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);

    }
    
    
    
   
 }
