package com.crud.Clientes;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mezzo
 * 
 */
public class Clientes {
    
    private String nome;
    private String email;
    private String cpf;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String salvar(){
        
        try {
            FileWriter fw = new FileWriter("clientes.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: "+this.nome);
            pw.println("Email: "+this.email);
            pw.println("CPF: "+this.cpf);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Cadastrado com Sucesso!";
    }
    
}
