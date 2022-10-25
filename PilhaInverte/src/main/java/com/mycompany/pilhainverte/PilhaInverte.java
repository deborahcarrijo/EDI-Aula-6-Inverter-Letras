/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilhainverte;

import javax.swing.JOptionPane;

/**
 *
 * @author deborah
 */
public class PilhaInverte {

    public static void main(String[] args) {
        
        int topo = -1;
        String frase;
        String frase2 = "";
        char[] letra1 = new char[200];
        char letra2;

        frase = JOptionPane.showInputDialog("Entre com a frase: ");
        
        for(int i = 0; i < frase.length(); i++){
            letra1[i] = frase.charAt(i);
        }
        
        Pilha pilha1 = new Pilha();
        
        topo = pilha1.topopilha;
        
        for(int i=0; i < frase.length();i++){
            if(letra1[i] != ' '){
                topo = pilha1.push(topo, letra1[i]);
            }else{
                frase2 = frase2 + " ";
                while(pilha1.tamanho()!= 0){
                    letra2 = pilha1.pop(topo);
                    frase2 = frase2 + letra2;
                    topo--;
                }
            }
        }
        
        if(pilha1.tamanho()!=0){
            frase2 = frase2 + " ";
            
            while(pilha1.tamanho()!=0){
              letra2 = pilha1.pop(topo);
              frase2 = frase2 + letra2;
              topo--;
            }
        }
        System.out.println(frase2);
    }
}
