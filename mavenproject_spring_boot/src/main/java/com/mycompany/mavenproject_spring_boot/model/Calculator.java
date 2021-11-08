/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_spring_boot.model;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class Calculator {
        public static double cal_plus(double a , double b){

        double ans  = a+b;
        
        return ans;

    }
    
    public static double cal_multiple(double a , double b){

        double ans  = a*b;
        
        return ans;

    }
    
    public static double cal_minus(double a , double b){
        double ans  = a-b;
        
        return ans;
    }
    
    
    public static String cal_divide(double a , double b){
        String ans  = "Error! b cannot 0";
        if(b != 0){
            ans  = a/b + "";
        }
        return ans;

    }
    
    public static double cal_modulo(double a , double b){
        double ans  = a%b;
        
        return ans;

    }
}
