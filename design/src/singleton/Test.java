package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws Exception {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton11);

        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();
        System.out.println(singleton2 == singleton21);

        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3 singleton31 = Singleton3.getInstance();
        System.out.println(singleton3 == singleton31);

        Singleton4 singleton4 = Singleton4.getInstance();
        Singleton4 singleton41 = Singleton4.getInstance();
        System.out.println(singleton4 == singleton41);

        //反射破坏单例
        Constructor<Singleton4> declaredConstructor = Singleton4.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton4 singleton42 = declaredConstructor.newInstance();
        System.out.println(singleton4 == singleton42);

        Singleton5 singleton5 = Singleton5.INSTANCE;
        Singleton5 singleton51 = Singleton5.INSTANCE;
        System.out.println(singleton5 == singleton51);
    }
}
