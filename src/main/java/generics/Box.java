package generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    T value;

    List<Box<T>> boxes;

    public Box(T t){
        this.value = t;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Box<T>> addBox(Box<T> t){
        if(boxes == null){
            boxes = new ArrayList<>();
        }
        boxes.add(t);
        return boxes;
    }

    @Override
    public String toString() {
        return "This is Box Class";
    }
}
