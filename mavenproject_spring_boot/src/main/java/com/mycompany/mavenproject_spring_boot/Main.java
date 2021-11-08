/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject_spring_boot;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Parrot");
        System.out.println("Now I stay in develop branch.");
        
        System.out.println("cal_plus : "+ cal_plus(46, 48));
        System.out.println("cal_minus : "+ cal_minus(46, 48));
        System.out.println("cal_multiple : "+ cal_multiple(46, 48));
        System.out.println("cal_divide : "+ cal_divide(46, 48));
        System.out.println("cal_divide (case b = 0) : "+ cal_divide(0, 0));
        System.out.println("cal_modulo : "+ cal_modulo(46, 48));
        
    }
    
    
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
