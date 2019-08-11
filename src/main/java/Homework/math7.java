package Homework;

public class math7 {
    public void cal7(){
        double x=6;
        double p= Math.pow(x,3)+ Math.log10(Math.pow(x,4)+2)/Math.log10(2) - Math.cbrt(x-4);
        System.out.println("Question 7= "+ (double)Math.round(p*1000)/1000);
    }
}
