package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * This is called unknown type and it represents by ?.
 * es - List<?> - This can be used when class don't depends on type parameter for example list.size() , list.clear mehod
 * for these method we don't need to have type parameter.
 */
public class UnBoundedWildCardExample {

    public static void main(String[] args) {

        SmallBox<String> box1= new SmallBox<>("SmallBox");
        SmallBox<Integer> box2= new SmallBox<>(1);
        List<Box<?>> lists = new ArrayList<>();
        lists.add(box1);
        lists.add(box2);
        printList(lists);
    }


    public static void printList(List<?> list){
        for (Object obj: list) {
            System.out.println(obj);

        }
    }



}
