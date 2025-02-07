
package br.senai.sp.jandira.model;

import java.time.LocalDate;


public class Pessoa {
    
    //atributos
    
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    //Acessores
    //-----------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    //-----------------------------------------------------------------------------
    
}
