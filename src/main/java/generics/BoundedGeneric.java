package generics;

// This class can accept Number type and its subtype classes type
// for example it can accept Integer,Double,Float.
public class BoundedGeneric<T extends Number> {

    private T value;

    public BoundedGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
