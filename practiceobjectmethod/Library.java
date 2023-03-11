package practiceobjectmethod;

public class Library {

    int Table;
    double electricitybill;
    float usage;
    char Books;
    String Studentname;

    public static void main(String args[]){
        Library nishant = new Library();
        nishant.Table = 2;
        nishant.electricitybill = 6745.87;
        nishant.usage = 787.8888888f;
        nishant.Books = 'N';
        nishant.Studentname = "Dhanani";

        System.out.println( nishant.Table);
        System.out.println( nishant.electricitybill);
        System.out.println( nishant.usage);
        System.out.println( nishant.Books);
        System.out.println(nishant.Studentname);





    }
}
