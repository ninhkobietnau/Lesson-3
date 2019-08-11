package Homework;

public class math6 {
    public void cal6(){
        double x=3;
        double p= Math.sqrt( x + Math.sqrt( x + Math.sqrt( x )));
        System.out.println("sqrt(x+sqrt(x+sqrt(x))) = " +(double)Math.round(p*1000)/1000);

    }
}
