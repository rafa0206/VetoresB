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
public class TestesElementaresComVetores {
    
     public static void main(String[] args) {
        
        int [] v1;
    
        int v2 [];
        
        int [] v3 = new int[4];
        
        v3 [0] = 2;
        
        System.out.println(v3[2]);
        
        v3[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        
        JOptionPane.showMessageDialog(null, v3[1]);
        
        System.out.println(v3.length);
        
        v3[0] = 2;
        
        v3[1] = 3;
        
        int r = v3[0] + v3[1];
        
        System.out.println(v3[3 - 2]);
        
        System.out.println(v3[3 - v3.length + 2]);
                                             
    }
    
}
