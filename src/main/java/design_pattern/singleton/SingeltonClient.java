package design_pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingeltonClient {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        // it will print true because both object are same.
        System.out.println(instance == instance1);

        breakSingeltonwithReflection();
        singletonReflectionProof();


    }

    private static void singletonReflectionProof() {
        SingletonReflectionProof instance = SingletonReflectionProof.getInstance();
        try {
            Constructor<SingletonReflectionProof> declaredConstructor = SingletonReflectionProof.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            SingletonReflectionProof threadSafeSingleton = declaredConstructor.newInstance();
            System.out.println(instance.hashCode());
            System.out.println(threadSafeSingleton.hashCode());
            System.out.println("Both Hashcode are different that means two instance created of this class");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e);
        }


    }

    private static void breakSingeltonwithReflection() {
        ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
         try {
            Constructor<ThreadSafeSingleton> declaredConstructor = ThreadSafeSingleton.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            ThreadSafeSingleton threadSafeSingleton = declaredConstructor.newInstance();
             System.out.println(instance.hashCode());
             System.out.println(threadSafeSingleton.hashCode());
             System.out.println("Both Hashcode are different that means two instance created of this class");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e);
        }


    }
}
