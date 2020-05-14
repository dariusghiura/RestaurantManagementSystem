package BusinessLayer;

import java.io.Serializable;

public abstract class MenuItem implements Serializable {
    protected String name;
    protected float price;
    private static final long serialVersionUID = 3L;

    public MenuItem(String name, float price){
        this.name = name;
        this.price = price;
    }

    public abstract float computePrice();

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
