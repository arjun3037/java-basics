package generics;

import java.util.Optional;

// We can't compare the generic type directly because generic cann't be compared.
public class GenericTypeComparison {

    // in this method we can not compare two generics type. so for that we need to add bounded generic
    // T need to implements Comparable interface.
    public static <T extends Number & Comparable<T>> Optional<T> getGreaterThenGivenNo(T[] array , T t){
        for(T t1 : array){
            if(t1.compareTo(t) > 0){
                return Optional.ofNullable(t1);
            }
        }
        return Optional.ofNullable(null);
    }


}
