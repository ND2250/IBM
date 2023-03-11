package practiceobjectmethod;

public class nonstatparamtrs {
    void method11(String Name){
        System.out.println(Name);
    }



    public static void main(String []args){
        nonstatparamtrs obj13 = new nonstatparamtrs();
        obj13.method11("Nishant");
        obj13.method11("Divyesh");
        obj13.method11("Harsh");

    }
}
