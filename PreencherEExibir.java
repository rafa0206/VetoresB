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
public class PreencherEExibir {
    
    public static void main(String[] args) {
        
        int [] v = new int [10];
        
        /*
        v[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        v[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        v[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        ...
        */
        
        //ao ivés de: "for(int i = 0;i < 10; i++)" usar  "for(int i = 0;i < v.length; i++)" como no codigo abaixo
        for(int i = 0;i < v.length; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        }
        
        /*mesa coisa usando while
        int i = 0;
        while(i < v.length){
            JOptionPane.showMessageDialog(null, v[i]);
            i++;
        }
        */
        
        //o i já foi declarado fora do while,  então não precisaria dentro do for() colocar "int i = 0";, "apenas i = 0";
        
        String s = "";
        for(int i = 0;i < v.length;i++){
            s = s + v[i] + " ";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
    
}
