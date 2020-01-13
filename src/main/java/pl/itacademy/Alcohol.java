package pl.itacademy;

public class Alcohol {
    private final String name;

    boolean isEmpty;

    public Alcohol(String name) {
        this.name = name;
        isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void feelUp() {
        isEmpty = false;
    }

    public void drink() throws EmptyAlcoholException {
        throw new EmptyAlcoholException("Alcohol " + name + " is empty");
    }
}
