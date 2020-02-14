package singleton;

//线程安全懒汉式
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}
    public synchronized static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
