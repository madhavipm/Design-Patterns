package Singleton;

import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private static DBConnection instance = null;
    private static final Object lock = new Object();
    private static final ReentrantLock reentrantLock = new ReentrantLock();

    String url;
    String username;
    String password;

    private DBConnection() {

    }
    //1 way using object and sync block
   /* public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }*/
    //2nd way using Reentrant lock
    public static DBConnection getInstance() {
        if (instance == null) {
            reentrantLock.lock();
            if (instance == null) {
                instance = new DBConnection();
            }
            reentrantLock.unlock();
        }
        return instance;
    }

}
