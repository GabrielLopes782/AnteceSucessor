/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antecesucessor;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Lopes
 */
public class AnteceSucessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calc numero = new Calc();
        numero.num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        JOptionPane.showMessageDialog(null, "Seu Antecessor é: " + numero.retornarAntecessor());
        JOptionPane.showMessageDialog(null, "Seu Sucessor é: " + numero.retornarSucessor());
        ;
    }

}
