package bank;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private static long id = 0L;
    private static ReentrantLock lock = new ReentrantLock();
    public static long getNewID(){
        long result;
        lock.lock();
        try {
            result=++id;
        }finally {
            lock.unlock();
        }
        return result;
    }
    private IdGenerate(){}
}
