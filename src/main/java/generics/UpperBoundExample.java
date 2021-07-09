package generics;

// We can use upper Bound wild card to relax the restriction on variables

import java.util.List;

/**
 * To declare an upper bound wildcard use (?) .
 * ex - List<? extends Number> we can assign List<Number>,List<Integer>,List<Double> etc to it. any subclass on Number can
 * be assigned to it
 */
public class UpperBoundExample {


    public static <T> void process(List<? extends  Box<T>> list){
        for(Box<T> box : list){
            System.out.println(box);
        }
    }
}
