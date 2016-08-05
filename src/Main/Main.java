/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Pessoa.Pessoa;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Pessoa p3 = new Pessoa("Adao");
        Pessoa p4 = new Pessoa("Eva");
        Pessoa p = new Pessoa("Diegão", p3 ,p4);
        Pessoa p2 = new Pessoa("Amanda", p3, p4);
        Pessoa p5 = new Pessoa("Raquel", p ,p2);
       
        
        
        
        if(p.EhIrmao(p2)){
            System.out.println("EH BROTHER");
        }else{
            System.out.println("NAO EH BROTHER");
        }
        
        if(p5.VerificaAntecessor(p3)){
            System.out.println("EH VO");
        }else{
            System.out.println("NAO EH VO");
        }
        
    }
    
}
