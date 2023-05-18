
package numericalanalysisproject;

import java.util.Scanner;

public class NumericalAnalysisProject {

    public static void main(String[] args) {
         final double tolerance=Math.pow(10, -3);
        Scanner input = new Scanner(System.in);
        double a,b,result;
        System.out.println("Enter First limit of the interval : ");
        a=input.nextDouble();
        System.out.println("Enter Second limit of the interval : ");
        b=input.nextDouble();
        result=bisection(a, b, tolerance);
        if(result==0)
             System.out.println("can not apply bisection method to find a solution on this interval");
        else
        System.out.println("The root of the equation is :"+result);
    }
    public static double bisection(double a, double b,double tolerance ){
        double p=0.0;
        if((functionValue(a)*functionValue(b)>=0)||(a<0||b<0)) {
            return 0;
                    }
        else{
            p=(a+b)/2;
            while(Math.abs(functionValue(p))>tolerance){
                if(functionValue(p)==0)
                    break;
                else if(functionValue(p)*functionValue(a)<0)
                    b=p;
                else
                    a=p;
                p=(a+b)/2;
            }
        }
        return p;
    }
    public static double functionValue(double x){
        if(x!=-1)
          return (Math.pow(x, 2)+Math.sqrt(x)-1)/(x+1);
        return 0;
    
    }
    
}
