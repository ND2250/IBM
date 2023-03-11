package Methodsparameter;

public class Addressdetails {

    static void Address(String Cityname,String Area,int postcode){
        System.out.println("City name:"+ Cityname);
        System.out.println("Area:"+ Area);
        System.out.println("Postcode:"+postcode);

    }


    public static void main(String [] args){
        Address("London","Greenwich",23879797);



    }

}
