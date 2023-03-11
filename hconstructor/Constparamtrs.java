package hconstructor;

import java.time.Year;

public class Constparamtrs {

    int passingyear;
    String Carmodelname;

    Constparamtrs(int year,String Carname){
        passingyear = year;
        Carmodelname = Carname;





    }

    public static void main(String[] args){
        Constparamtrs Cardet = new Constparamtrs(2023,"BMW");
        System.out.println(Cardet.passingyear+" "+Cardet.Carmodelname);

    }







}
