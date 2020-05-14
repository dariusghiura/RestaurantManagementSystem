package PresentationLayer.Chef;

import BusinessLayer.MenuItem;
import BusinessLayer.Order;

import java.util.ArrayList;
import java.util.HashMap;

public interface Observer {
    public void update(HashMap<Order, ArrayList<MenuItem>> orders);
}
