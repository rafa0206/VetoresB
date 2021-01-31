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
public class BuscaValorEmUmVetor {
    
    public static void main(String[] args) {
        
        int [] v = {1, 2, 5, 4, 3};
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja buscar"));
        
        int i;
        
        for(i = 0;i < v.length;i ++){
            if(v[i] == valor)
                break;
        }
        
        JOptionPane.showMessageDialog(null, i<v.length ? "Achou na posição " + i: "Não achou");
    }          
}
