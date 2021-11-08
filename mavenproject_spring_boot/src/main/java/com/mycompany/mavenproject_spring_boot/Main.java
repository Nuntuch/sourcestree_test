/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_spring_boot;

import com.mycompany.mavenproject_spring_boot.model.Calculator;
/**
 *
 * @author Nuntuch Thongyoo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Parrot");
        System.out.println("Now I stay in develop branch.");
        
        Calculator calculator = new Calculator(); 
        
        System.out.println("cal_plus : "+ calculator.cal_plus(46, 48));
        System.out.println("cal_minus : "+ calculator.cal_minus(46, 48));
        System.out.println("cal_multiple : "+ calculator.cal_multiple(46, 48));
        System.out.println("cal_divide : "+ calculator.cal_divide(46, 48));
        System.out.println("cal_divide (case b = 0) : "+ calculator.cal_divide(0, 0));
        System.out.println("cal_modulo : "+ calculator.cal_modulo(46, 48));
        
    }
    
   
}
