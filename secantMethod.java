/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secantMethod;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class secantMethod {
    public static void main(String[] args) {
         final double tolerance=Math.pow(10, -3);
        Scanner input = new Scanner(System.in);
        double a,b,p0,p1;
        System.out.println("Enter First limit of the interval : ");
        a=input.nextDouble();
        System.out.println("Enter Second limit of the interval : ");
        b=input.nextDouble();
       if(a<=-1||b<=-1)
            System.out.println("cannot solve for this interval");
       else{ 
           p0=(a+b)/2;
           p1=(p0-Math.sqrt(p0)+1)/(p0+1);
           secant(p0, p1, tolerance);
           
    }
    
}
    public static double function(double p){
      return (Math.pow(p, 2)+Math.sqrt(p)-1)/(p+1);
    }
    public static void secant(double p0,double p1,double tolerance){
       double pn;
       int ctn=1;
       pn=(p0*function(p1)-p1*function(p0))/(function(p1)-function(p0));
       while (Math.abs(p1-p0)>tolerance){
           System.out.println("p"+(++ctn)+"\t "+pn);
           p0=p1;
           p1=pn;
           pn=(p0*function(p1)-p1*function(p0))/(function(p1)-function(p0));
       }
    
    }
            
}
