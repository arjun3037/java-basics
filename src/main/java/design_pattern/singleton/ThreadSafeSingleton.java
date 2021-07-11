package design_pattern.singleton;

public class ThreadSafeSingleton {

    private static  ThreadSafeSingleton instance;

    // to ensure happens.
    private volatile  ThreadSafeSingleton doubleCheckInstance;

    // this is static type is instance . it will work fine in multithreading env because it will load at class loading time
    private static ThreadSafeSingleton staticInstance = new ThreadSafeSingleton();

    // restrict object creation from outside of the class.
    private ThreadSafeSingleton(){}

    // single check - it is still vulnerable because it is possible that another thread see instance variable in half state.
    // Way-1
    public static ThreadSafeSingleton getInstance(){
        if (instance != null){
            return instance;
        }
        synchronized(ThreadSafeSingleton.class) {
            instance = new ThreadSafeSingleton();
        }
        return  instance;
    }

    // way-2
    public ThreadSafeSingleton getInstanceDoubleCheck(){
        // we are assigning volatile to local variable for optimization
        // volatile variable reading is expensive as it comes from direct memory.
        ThreadSafeSingleton instance = doubleCheckInstance;
        if (instance == null){ // single check
            synchronized (this){
                if (instance == null){ // double check
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    // This is thread safe but there is one disadvantage initialization is not lazy.
    // Not lazy initialization
    public ThreadSafeSingleton getStaticInstance(){
        return staticInstance;
    }


}
