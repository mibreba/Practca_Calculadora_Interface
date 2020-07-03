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
public class Add implements InterfaceOperation 
{
       
    public int excute(int x, int y) {
        
        int result= x+y;
        return result;
    }

    @Override
    public int add3(int x, int y, int t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
