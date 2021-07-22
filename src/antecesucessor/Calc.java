/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antecesucessor;

/**
 *
 * @author Gabriel Lopes
 */
public class Calc {

    int num;

    public int retornarAntecessor() {
        return this.num - 1;
    }

    public int retornarSucessor() {
        return this.num + 1;

    }
}
