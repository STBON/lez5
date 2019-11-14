/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez00oggetti;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tss
 */


public class alunno {
    
    private String Cognome;
    private String Nome;
    private int voto;
    
    private LocalDateTime datanascita ;
    String segnozodiacale;
    //costruttore metodo con stesso nome classe

    alunno(String rossi, String mario, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getCognome() {
        return Cognome;
    }

    public String getNome() {
        return Nome;
    }

    public int getVoto() {
        return voto;
    }

    public String getSegnozodiacale() {
        return segnozodiacale;
    }

    public alunno(String Cognome, String Nome, int voto) {
        this.Cognome = Cognome;
        this.Nome = Nome;
        this.voto = voto;
        datanascita = LocalDateTime.now();
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
    
     public alunno(String Cognome, String Nome) {
        this.Cognome = Cognome;
        this.Nome = Nome;
        this.voto = voto;
        datanascita = LocalDateTime.now();
    }
    //costruttore metodo con stesso nome classe
    public alunno(String newcognome){
        //sistemo il cognome
        String okcognome;
        if(cognome.length()>50){ //taglialo
            okcognome=newcognome.substring(0,50);
        }
        else{
            okcognome=newcognome;
        okcognome=okcognome.toUpperCase();
        }
        this.Cognome=okcognome;
          
        Nome="";
        
        datanascita = LocalDateTime.now();
        
        int anno =datanascita.getYear();
        if (anno==2018) segnozodiacale="Drago";
        if (anno==2019) segnozodiacale="Serpente";
        if (anno==2020) segnozodiacale="Topo";
        
    }

    /**
     *
     * @return
     */
    public LocalDateTime getDatanascita(){
   
        return datanascita ;
    }
    
    public String getPresentazione(){
        
        String frase;
        frase = "mi chiamo " + Cognome + " " + Nome;
        //sistemo la data
        DateTimeFormatter myformatIT = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String dataOkIt = datanascita.format(myformatIT);
       
        frase+=" e sono nato il " + dataOkIt;
        
        return frase;
    }

    
    
    
}
