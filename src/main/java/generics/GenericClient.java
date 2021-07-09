package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericClient {

    public static void main(String[] args) {

        // init Box instance with String value.
        Box<String> boxStringType = new Box<>("My Box");
        print(boxStringType);

        // update the string value.
        boxStringType.setValue("Updated Box Value");
        print(boxStringType);
        printBox(boxStringType,"My Message");


        // Bounded generics Examples.
        BoundedGeneric<Integer> integerType = new BoundedGeneric<Integer>(10);
        System.out.println("Integer type value " + integerType.getValue());

        // double type
        BoundedGeneric<Double> doubleType = new BoundedGeneric<>(Double.valueOf(10.21325d));
        System.out.println("Double Type Value" + doubleType.getValue());

        // generic comparison example
        runGenericComparisionExample();

        // generic upperBoundExmaple
        runGenericUpperBoundExample();


    }

    private static void runGenericUpperBoundExample() {
        System.out.println("Method runGenericUpperBoundExample starts");
        List<Box<String>> boxes = new ArrayList<>();
        Box<String> objectSmallBox = new SmallBox<>("Small Box");
        Box<String> box = new Box<>("Box");
        boxes.add(objectSmallBox);
        boxes.add(box);
        UpperBoundExample.process(boxes);

    }


    private static void runGenericComparisionExample(){
        System.out.println("runGenericComparisionExample method is running");
        Integer[] intArr = new Integer[]{1,3,6,8,2,32,10};
        Optional<Integer> greaterThenGivenNo = GenericTypeComparison.getGreaterThenGivenNo(intArr, 30);
        if (greaterThenGivenNo.isPresent()){
            System.out.println(greaterThenGivenNo.get());
        }

        Optional<Integer> greaterThenGivenNo1 = GenericTypeComparison.getGreaterThenGivenNo(intArr, 100);
        if (!greaterThenGivenNo1.isPresent()){
            System.out.println("Given value not found");
        }
    }

    private static <U ,T extends  String> void  printBox(Box<U> t , T t1){
        System.out.println(t.getValue());
    }

    private static void print(Box<String> boxStringType) {
        System.out.println(boxStringType.getValue());
    }
}
