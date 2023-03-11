package Methodsparameter;

public class Finalresult {

    static int exam1(int x, int y ){
        return x+y;
    }

    static float exam2(float v, float z){
        return v+z;

    }
    static double fnexam(double a,double b){
        return a+b;

    }
    static String Name(String N, String B){
        return "Nishant Dhanani";

    }

    public static void main(String [] args){
      System.out.println(exam1(45,65));
      System.out.println(exam2(67,78));
      System.out.println(fnexam(78,98));
      System.out.println(Name("Name","Lastname"));


    }

}
