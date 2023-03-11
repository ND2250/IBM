package Methodsparameter;

public class Studentsdetatails {

    // non static method parameters
    // Declared a method
    //initialization
    // declare object
    // Display to the main method
    void studentsrecord(String Stuname,int Rollno,int Grade,int Passingmarks){

        System.out.println(Stuname + " " + Rollno + " "+ Grade +" " + Passingmarks);

    }

    public static void main(String [] args){

        Studentsdetatails records = new Studentsdetatails();
        records.studentsrecord("Nishant",78,4,28);






    }

}
