package design_pattern.singleton;

/**
 * This is easy and threadsafe implementation of Singleton design pattern.
 */
public class SingletonInnerStaticClass {

    // this will initialized lazily bu JVM
    private static class Holder{
        public  static final SingletonInnerStaticClass instance = new SingletonInnerStaticClass();
    }

    public SingletonInnerStaticClass getInsance(){
        return Holder.instance;
    }

    private SingletonInnerStaticClass(){
        // do nothing;
    }

}
