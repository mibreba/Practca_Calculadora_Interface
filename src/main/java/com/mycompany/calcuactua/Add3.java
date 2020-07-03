/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcuactua;

/**
 *
 * @author Famila Brenes Castro
 */
public class Add3 implements InterfaceOperation 
{

    @Override
    public int excute(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int add3(int x, int y, int t) {
        int result;
        result= x+y+t;
        return result;
    }
    
}
