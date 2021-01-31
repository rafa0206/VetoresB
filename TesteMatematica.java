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
public class TesteMatematica {
    
    public static void main(String[] args) {
        
        double [] turma1 = {5,5,5};
        
        double [] turma2 = {9,5,1};
        
        double media1, media2, variancia1, variancia2, desvio1, desvio2;
        
        media1 = Matematica.media(turma1);
        
        variancia1 = Matematica.desvioPadrao(turma1);
        
        desvio1 = Matematica.desvioPadrao(turma1);
        
        media2 = Matematica.media(turma2);
        
        variancia2 = Matematica.variancia(turma2);
        
        desvio2 = Matematica.desvioPadrao(turma2);
        
        
        System.out.printf("Turma 1: (Média: %.2f, Variância: %.2f, Desvio Padrão: %.2f)\n", media1, variancia1, desvio1);
        
        System.out.printf("Turma 2: (Média: %.2f, Variância: %.2f, Desvio Padrão: %.2f)\n", media2, variancia2, desvio2);
        
    }
    
}
