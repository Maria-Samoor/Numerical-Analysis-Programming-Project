package newton;
import java.util.Scanner;

public class NewtonMethod {
    public static void main(String[] args) {
        final double tolerance=Math.pow(10, -3);
        Scanner input = new Scanner(System.in);
        double a,b,p0;
        System.out.println("Enter First limit of the interval : ");
        a=input.nextDouble();
        System.out.println("Enter Second limit of the interval : ");
        b=input.nextDouble();
       if(a<=-1||b<=-1)
            System.out.println("cannot solve for this interval");
       else{ 
           System.out.println("Enter your intial guess \"it should be included on the interval\" : ");
        p0=input.nextDouble();
        if(p0>=b|| p0<=a)
            System.out.println("cannot solve for this initial guess");
        else
            newton(p0, tolerance);
    }
    }  
    public static void newton(double p0,double tolerance){
        double pn=p0-(function(p0)/derivative(p0));
        int ctn=0;
        while(Math.abs(pn-p0)>tolerance){
              System.out.println(++ctn+"\t "+pn);
              p0=pn;
              pn=p0-(function(p0)/derivative(p0));
          }

    
  
    
    }
    public static double derivative(double p){
    return (Math.pow(p, 2)+2*p+((1-p)/(2*Math.sqrt(p)))+1)/Math.pow(p+1, 2);
    }
    public static double function(double p){
      return (Math.pow(p, 2)+Math.sqrt(p)-1)/(p+1);
    }
}
