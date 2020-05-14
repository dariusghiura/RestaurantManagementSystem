package BusinessLayer;

import DataLayer.BillGenerator;
import PresentationLayer.Chef.Observer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @invariant wellFormed() == true
 */

public class Restaurant implements IRestaurantProcessing, Subject, Serializable {

    private HashMap<Order, ArrayList<MenuItem>> orders;
    private ArrayList<MenuItem> menu;
    private transient ArrayList<Observer> observerList;
    private int orderId = 0;
    private static final long serialVersionUID = 1L;

    public Restaurant(){
        orders = new HashMap<Order, ArrayList<MenuItem>>();
        menu = new ArrayList<MenuItem>();
        observerList = new ArrayList<>();
    }

    @Override
    public void createMenuItem(MenuItem item) {
        assert(item != null);
        menu.add(item);
        assert (getMenu().contains(item) == true);
    }

    @Override
    public void deleteMenuItem(MenuItem item) {
        assert(item != null);
        ArrayList<MenuItem> toDelete = new ArrayList<>();
        menu.remove(menu.indexOf(item));
        for (MenuItem m : menu) {
            if (m instanceof CompositeProduct){
                CompositeProduct c = (CompositeProduct) m;
                if (c.getProducts().contains(item))
                    toDelete.add(m);
            }
        }
        for (MenuItem m : toDelete) {
            deleteMenuItem(m);
        }
        assert(!getMenu().contains(item));
    }

    @Override
    public void editMenuItem(MenuItem item, String name, float price, ArrayList<MenuItem> compozitie) {
        assert(item != null && price > 0);
        if (compozitie == null){
            if (!name.equals(""))
                item.name = name;
            if (price != -1)
                item.price = price;
        }
        else {
            if (!name.equals(""))
                item.name = name;
            CompositeProduct c = (CompositeProduct) item;
            c.setProducts(compozitie);
        }

        for (MenuItem m : menu) {
            if (m instanceof CompositeProduct){
                m.price = 0;
                m.computePrice();
            }
        }
        assert(getMenu().contains(item) == true);
    }

    @Override
    public void createOrder(Order o, ArrayList<MenuItem> preparate) {
        assert(o != null && preparate != null);
        o.setOrderID(orderId++);
        orders.put(o, preparate);
        for (MenuItem m : preparate) {
            o.setTotal(o.getTotal() + m.getPrice());
        }

        notifyObservers();
        assert(getOrders().containsKey(o) == true && getOrders().containsValue(preparate) == true);
    }


    @Override
    public void generateBill(Order order) {
        assert (order != null);
        BillGenerator.generateBill(order, orders.get(order));
        assert (wellFormed()==true);
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public HashMap<Order, ArrayList<MenuItem>> getOrders() {
        return orders;
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(orders);
        }
    }

    public void setObserverList(ArrayList<Observer> observerList) {
        this.observerList = observerList;
    }

    public boolean wellFormed(){
        for (Map.Entry<Order, ArrayList<MenuItem>> entry : orders.entrySet()){
            ArrayList<MenuItem> m = entry.getValue();
            if (m == null)
                return false;
        }
        return true;
    }
}
