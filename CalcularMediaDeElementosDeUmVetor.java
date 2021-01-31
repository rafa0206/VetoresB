/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ccp1an_pla_vetores;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author JFernandes
 */
public class CalcularMediaDeElementosDeUmVetor {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();
        
        double [] v = new double [100];
        
        for(int i = 0;i < v.length; i++){
            v[i] = gerador.nextDouble() * 5 + 3;
        }
        
        double soma = 0;
        for(int i = 0;i < v.length; i++){
            soma += v[i];
        }
        
        double media = soma/v.length;
        
        JOptionPane.showMessageDialog(null, "Media: " + media);
                               
    }
    
}
