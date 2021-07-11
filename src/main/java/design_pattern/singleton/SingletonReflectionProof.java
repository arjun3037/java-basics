package design_pattern.singleton;

public class SingletonReflectionProof {

    private  static volatile SingletonReflectionProof instance;

    private SingletonReflectionProof(){
        throw  new RuntimeException("Class cann't be initilized");
    }

    public static SingletonReflectionProof getInstance(){
        SingletonReflectionProof localInstance = instance;
        if (localInstance == null){
            synchronized (SingletonReflectionProof.class){
                if (localInstance == null){
                    localInstance = instance = new SingletonReflectionProof();
                }
            }
        }
        return localInstance;
    }
}
