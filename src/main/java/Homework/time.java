package Homework;

public class time {
    public void done(){
        int x=543200;
        int h=x/3600;
        x%=3600;
        int m=x/60;
        int s=x%60;
        System.out.println(h+ " gio "+ m + " phut "+ s + " giay.");
    }
}
