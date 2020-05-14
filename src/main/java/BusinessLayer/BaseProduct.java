package BusinessLayer;

public class BaseProduct extends MenuItem {
    private static final long serialVersionUID = 4L;

    public BaseProduct(String name, float price) {
        super(name, price);
    }

    @java.lang.Override
    public float computePrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
