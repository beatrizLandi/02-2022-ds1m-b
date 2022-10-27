package br.senai.sp.jandira.model;

public class Especialidade {
	
	private String nome;
	private String descricao;
	private static int quantidade;
        private static int contador = 1;
	private Integer codigoEspecialidade;
        
        // Construtores da classe
	public Especialidade(String nome) {
		this.nome = nome;
		atualizarCodigoEspecialidade();
	}
        
        
        public Especialidade(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		atualizarCodigoEspecialidade();
	}
	
        public Especialidade() {
		atualizarCodigoEspecialidade();
	}
        
        private void atualizarCodigoEspecialidade() {
		this.codigoEspecialidade = contador;
		contador++;
	}
        
       //
        
        
       
	
	// Métodos de acesso getters and setters
	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

    public Integer getCodigoEspecialidade() {
        return codigoEspecialidade;
    }

    public void setCodigoEspecialidade(Integer codigoEspecialidade) {
        this.codigoEspecialidade = codigoEspecialidade;
    }
        
        
		
}
