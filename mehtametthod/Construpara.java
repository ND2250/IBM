package mehtametthod;

public class Construpara {

    int Numbers;
    float reports;
    String clientname;
    char alphabet;

    Construpara(int Totalclients, float structure, String name,char setinorder){

        Numbers = Totalclients;
        reports = structure;
        clientname = name;
        alphabet = setinorder;


    }

    public static void main(String [] args){
        Construpara counting = new Construpara(8989,88.65f,"Name of party:"+"Nishant",'k');
        System.out.println(counting.Numbers);
        System.out.println(counting.reports);
        System.out.println(counting.clientname);
        System.out.println(counting.alphabet);




    }
}
