package opr;

public class Logicool {
    public static void main(String [] args){
        int A = 78;
        System.out.println(A<67 && A>75); // False
        System.out.println(A<67 || A>98); // false
        System.out.println(!(A<68 && A<98));// True

    }
}
