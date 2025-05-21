package Singleton;

public class Client {
    public static void main(String[] args) {
        DBConnection dbc1 =DBConnection.getInstance();
        DBConnection dbc2 =DBConnection.getInstance();
        DBConnection dbc3 =DBConnection.getInstance();
        System.out.println(dbc1);
        System.out.println(dbc2);
        System.out.println(dbc3);

    }
}
