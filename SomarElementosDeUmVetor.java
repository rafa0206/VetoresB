/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ccp1an_pla_vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author JFernandes
 */
public class SomarElementosDeUmVetor {
    
    public static void main(String[] args) {
        
        double [] v = {2.5, 6.4, 7.5, 1, 1, 2, 7, 5};
        
        double soma = 0;
        
        /*
        soma = soma + v[0];
        
        soma = soma + v[1];
        
        soma = soma + v[2];
        ...
        
        soma = 0;
        */
        
        for(int i = 0; i < v.length; ++i){
            soma = soma + v[i];
        }
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }    
}
