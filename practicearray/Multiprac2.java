package practicearray;

public class Multiprac2 {

    public static void main(String [] args){

        int a [][] = new int[4][4];

        a[0][0] = 25;
        a[0][1] = 30;
        a[0][2] = 35;
        a[0][3] = 40;

        a[1][0] = 45;
        a[1][1] = 50;
        a[1][2] = 55;
        a[1][3] = 60;

        a[2][0] = 65;
        a[2][1] = 70;
        a[2][2] = 75;
        a[2][3] = 80;

        a[3][0] = 85;
        a[3][1] = 90;
        a[3][2] = 95;
        a[3][3] = 100;

        for (int r=0; r<a.length; r++){
            for(int c=0; c<a.length;c++){
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }





    }
}
