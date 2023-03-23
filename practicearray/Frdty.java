package practicearray;

public class Frdty {





    public static void main(String [] args){

        try{
        String Name;

        String name [] = new String [3];
        name[0] = "Nishant";
        name[1] = "Dhanani";
        name[2] = "Nishant";

        for (int i = 0;i<= name.length;i++){
            System.out.println("ED NAME:"+name[i]);
        }}catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array list is not enough number");
        }catch(Exception e){
            System.out.println("Array list shold be work");
        }finally {
            System.out.println("100% working");
        }


}



}


