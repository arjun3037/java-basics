package generics;

// lower bounded wildcard restricts the unknown type to be specific or a super type of that type

import java.util.List;

/**
 * List<? super Integer> - it includes List<Integer>,List<Number>,List<Object>
 */
public class LowerBoundExample {


    public static void addNumber(List<? super Integer> lists){
        for(int i = 0 ; i < 10 ; i++){
            lists.add(i);
        }

    }


}
