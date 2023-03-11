public class House {

    int Rooms;
    Float sofaset;
    String Nameplate;
    int No;
    char utensilname;

    public static void main(String [] args){
        House obj14 = new House();
        obj14.Rooms =  4;
        obj14.sofaset = 3.5f;
        obj14.Nameplate = "Dinesh m patel"+" "+"Rasila Dinesh patel";
        obj14.No = 234;
        obj14.utensilname = 'N';

        System.out.println("Numbers of rooms:"+obj14.Rooms);
        System.out.println("Number of sofaset:"+ obj14.sofaset);
        System.out.println("Name plate:"+obj14.Nameplate);
        System.out.println("House no:"+obj14.No);
        System.out.println("Utensilname:"+obj14.utensilname);



    }

}
