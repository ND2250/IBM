package mehtametthod;

public class Overloadmehtastat {

    // Calculations of Net bills for Anjani traders

    static int calculation (int  b,int  c){
        return b * c;

    }
    static float calculation(float D, float F){
        return D + F;

    }
    static double calculation(double WithoutGST, double WithGST){
        return WithoutGST + WithGST;
    }
    static char Journal (char C1){
        return C1 ;
    }
    static String Name (String partyname){
        return partyname;
    }

    public static void main(String [] args){
        int total = calculation(67,8989);
        System.out.println("Total amount from party:"+total);
        float Grosstotal = calculation(78.45f,8999.34f);
        System.out.println("Total in my account:"+ Grosstotal);
        double Netotal = calculation(78.665,67.99);
        System.out.println("total net payable:"+Netotal);
        char startentry = Journal('H');
        System.out.println("Journal start char :"+ startentry);
        String partyname = Name("Pashwanath builder");
        System.out.println("Name of debtores:" + partyname);





    }
}
