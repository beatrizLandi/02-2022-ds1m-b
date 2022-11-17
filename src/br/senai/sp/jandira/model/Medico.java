package br.senai.sp.jandira.model;

import java.util.ArrayList;


public class Medico extends Pessoa{

	
	private String sexo;
	private String crm;
	private ArrayList<Especialidade> especialidades;
        private static int contador = 100;
        
        private Integer codigo;
        private ArrayList<Medico> medicos = new ArrayList<>();
       private  static int quantidade;
    

//-----------------------------------------------------------------------

	public String getSexo() {
		return sexo;
	}
//-------------------------------------------------------------------------------
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
//-------------------------------------------------------------------------------
	public String getCrm() {
		return crm;
	}
//-------------------------------------------------------------------------------
	public void setCrm(String crm) {
		this.crm = crm;
	}
//-------------------------------------------------------------------------------
	public ArrayList<Especialidade> getEspecialidades() {
		return especialidades;
	}
//-------------------------------------------------------------------------------
	public void setEspecialidades(ArrayList<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}
//-------------------------------------------------------------------------------
        
  public Medico() {
        atualizarCodigo();
    }
 //-------------------------------------------------------------------------------
        
         public Medico(Integer codigo, String nome, String crm) {
        
        this.codigo = codigo;
        this.codigo = codigo;
        contador++;
    }
//-------------------------------------------------------------------------------
   private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }
//-------------------------------------------------------------------------------
         public ArrayList<Medico> getMedico() {
        return medicos;
    }
//-------------------------------------------------------------------------------
         
         //cuidado com o encademento logico
  
    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }       
         
//-------------------------------------------------------------------------------
     public int getQuantidade() {
        return quantidade;
    }
      
//-------------------------------------------------------------------------------
public Integer getCodigo() {
        return codigo;
    } 
//-------------------------------------------------------------------------------
     public int getContador() {
        return contador;
    }      
//-------------------------------------------------------------------------------

    public String getMedicoSeparadoPorPontoEVingula() {
          return this.codigo + ";" + this.crm + ";" + this.getNome() + ";"
                + this.getTelefone() + ";" + this.getEmail() + ";" + this.getDataNascimento();
    }
}
