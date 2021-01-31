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
public class MediaVarianciaDesvioPadrao {
    
    public static void main(String[] args) {
        
        double [] colecao = {5, 5, 5};
        
        double soma = 0;
        
        for(int i = 0;i < colecao.length; i++){
            soma += colecao[i];            
        }
        
        double media = soma/colecao.length;
        
        double somaDiferencas = 0;
        
        for (int i = 0;i < colecao.length; i++){
            
            somaDiferencas += Math.pow((colecao[i] - media), 2);            
        }
        
        double variancia = somaDiferencas/(colecao.length);
        
        double desvioPadrao = Math.sqrt(variancia);
        
        System.out.printf("Media:%.2f, Variancia:%.2f, Desvio Padrao:%.2f\n", media, variancia, desvioPadrao);        
    }    
}
