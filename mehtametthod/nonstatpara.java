package mehtametthod;

public class nonstatpara {

    void Billing(int Noofbills, String Nameofparty) {
        System.out.println("No of bills:" + Noofbills);
        System.out.println("Name of party:" + Nameofparty);

    }

    void selling(float Amount, char entry) {
        System.out.println("Total amount:" + Amount);
        System.out.println("Starting entry:" + entry);

    }

    public static void main(String[] args) {
        nonstatpara on13 = new nonstatpara();

        on13.Billing(14, "Suhani trades");
        on13.selling(78787.89898f, 'K');
    }


}