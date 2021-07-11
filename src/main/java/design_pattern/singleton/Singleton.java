package design_pattern.singleton;

/**
 * Singleton design pattern is a creation design pattern.
 * Singleton design pattern ensure that only single instance of class can be created.
 * This implementation is not thread safe .Singleton property can be break in multithreaded environment.
 * This is lazy initialization , first we check the instance null check then only we creating object.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){
      // restricted the  class initialization from outside
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void print(){
        System.out.println("This is the simple singelton implementation");
    }





}
