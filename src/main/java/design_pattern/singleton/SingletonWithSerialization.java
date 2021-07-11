package design_pattern.singleton;


import java.io.Serializable;

public class SingletonWithSerialization implements Serializable , Cloneable {

    private static SingletonWithSerialization instance;

    private SingletonWithSerialization(){
        // restricted the  class initialization from outside
    }

    public static SingletonWithSerialization getInstance(){
        if(instance == null){
            instance = new SingletonWithSerialization();
        }
        return instance;
    }



    public void print(){
        System.out.println("This is the simple singelton implementation");
    }

    // to prevent creation of new instance at the time of deserialization
    protected Object readResolve(){
        return this;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw  new CloneNotSupportedException();
    }
}
