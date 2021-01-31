/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ccp1an_pla_vetores;

/**
 *
 * @author JFernandes
 */
public class Matematica {
    
    public static double media(double [] valores) {
        
        double soma = 0;
        
        for(int i = 0;i < valores.length;i++){
            soma += valores[i];
        }
        
        return soma/valores.length;
    }
    
    public static double variancia(double [] valores) {
        
        double m = media(valores);
        
        double somaDiferencas = 0;
        
        for(int i = 0;i < valores.length;i++){
            somaDiferencas += Math.pow((valores[i] - m), 2);
        }
        
        return somaDiferencas/(valores.length);
    }
    
    public static double desvioPadrao(double [] valores) {
        
        return Math.sqrt(variancia(valores));        
    }
    
}
