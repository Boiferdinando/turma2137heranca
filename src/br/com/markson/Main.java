/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.markson;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author markson.marcolino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        ArrayList<String> nomes = new ArrayList<>();
       String n1,n2,n3,n4,n5;
       n1 = "Markson";
       n2 = "Marcolino";
       n3 = "Rebelo";
       n4 = "Teste";
       n5 = "Teste2";
       
       nomes.add(n1);
       nomes.add(n2);
       nomes.add(n3);
       nomes.add(n4);
       nomes.add(n5);
        int i=0;
        for (String nome : nomes) {
            i++;
            System.out.println(i+ " " + nome);
        }
            
        
    }
    
}
