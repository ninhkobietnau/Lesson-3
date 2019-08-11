package Homework;

public class triangle {
    public void stri(){
        double a=5, b=6, c=7;
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("dien tich tam giac= "+ (double)Math.round(s*100)/100);
    }
}
