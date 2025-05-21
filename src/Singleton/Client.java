package Singleton;

public class Client {
    public static void main(String[] args) {
        /*for 1st basic singleton ex these are to debug
        DBConnection dbc1 =DBConnection.getInstance();
        DBConnection dbc2 =DBConnection.getInstance();
        DBConnection dbc3 =DBConnection.getInstance();
        Thread[] threads = new Thread[10];
        System.out.println(dbc1);
        System.out.println(dbc2);
        System.out.println(dbc3);

         */
        Runnable task = () -> {
            DBConnection dbc = DBConnection.getInstance();
            System.out.println(Thread.currentThread().getName() + " got instance " + dbc.hashCode());
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task , "Thread " + i);
            threads[i].start();
        }
        // Wait for all threads to complete before exiting main
        for(int i = 0; i < threads.length; i++) {
            try{
                threads[i].join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
