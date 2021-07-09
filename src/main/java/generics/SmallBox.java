package generics;

public class SmallBox<T> extends  Box<T> {

    public SmallBox(T t) {
        super(t);
    }

    @Override
    public String toString() {
        return "This is Small box " + this.getValue();
    }
}
