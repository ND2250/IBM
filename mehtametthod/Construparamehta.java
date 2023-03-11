package mehtametthod;

public class Construparamehta {

    static int Noofstudents ;
    static String Nameofstudents;
    static char Letter;
    private static int Marks;
    double grademarks;

    Construparamehta(int students, String Name, char Alpha, double Marks){
        Noofstudents = students;
        Nameofstudents = Name;
        Letter = Alpha;
        grademarks = Marks;
    }
    public static void main(String [] args){
        Construparamehta studentdetails = new Construparamehta(89898,"Nishant",'N',88.56);
        System.out.println(Construparamehta.Noofstudents+" "+Construparamehta.Nameofstudents+" "+Construparamehta.Letter+" "+Construparamehta.Marks);

    }
}
