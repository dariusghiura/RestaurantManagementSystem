package BusinessLayer;

import java.util.ArrayList;

public class CompositeProduct extends MenuItem {
    private ArrayList<MenuItem> products;
    private static final long serialVersionUID = 5L;

    public CompositeProduct(String name, ArrayList<MenuItem> products) {
        super(name, 0);
        this.products = products;
        computePrice();
    }

    @Override
    public float computePrice() {
        for (MenuItem m : products) {
                price += m.price;
        }
        return price;
    }

    public ArrayList<MenuItem> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<MenuItem> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return  name + " ( " + products + " ) ";
    }
}
