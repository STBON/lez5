/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez00oggetti;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author tss
 */
public class MainStart {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
       
        alunno a1;
        a1 = new alunno("rossi","mario",100) ;
    
        //a1.datanascita= new Date();
   
        long milsec = 4000 ;
        Thread.sleep(milsec) ;
        
        alunno a2;
        a2=new alunno("guerrini","luca",50) ;
   
        
       
       
        //a2.datanascita = new Date();
        LocalDateTime ddd;
        ddd = a2.getDatanascita();
        
        System.out.println(a1.getPresentazione());
        System.out.println(a2.getPresentazione());
        
        if(a1.voto>a2.voto){
            System.out.println("bravo "+a1.Cognome+ " "+a1.Nome+" "+ "hai preso:" + a1.voto);
        }
        else {
            System.out.println("bravo"+a2.Cognome+ " "+a2.Nome+" "+"hai preso:"+a2.voto);
        }
                  
        
    }
    
}
