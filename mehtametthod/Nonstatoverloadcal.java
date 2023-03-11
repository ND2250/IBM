package mehtametthod;

public class Nonstatoverloadcal {
    void method4(int R, int H){
        System.out.println(R+H);

    }

    void method4(double u, double a){
        System.out.println(u+a);

    }
    void method5(char bookmark){
        System.out.println("Name of char:"+ bookmark);
    }
    void method6 (String name){
        System.out.println("Name of employer:"+name);

    }

    public static void main(String [] args){
        Nonstatoverloadcal verification = new Nonstatoverloadcal();
        verification.method4(67,89);
        verification.method4(8.67,90.4);
        verification.method5('H');
        verification.method6("BITA GROUP");


    }

}



