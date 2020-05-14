package BusinessLayer;

import java.util.ArrayList;

public interface IRestaurantProcessing {

    /**
     * @precondition item != null
     * @postcondition getMenu().contains(item) == true
     */
    void createMenuItem(MenuItem item);

    /**
     * @precondition item != null
     * @postcondition getMenu().contains(item) == false
     */
    void deleteMenuItem(MenuItem item);

    /**
     * @precondition item != null and price > 0
     * @postcondition getMenu().contains(item) == true
     */
    void editMenuItem(MenuItem item, String name, float price, ArrayList<MenuItem> compozitie);

    /**
     * @precondition o != null and preparate != null
     * @postcondition getOrders().containsKey(o) == true and getOrders().containsValue(preparate) == true
     */
    void createOrder(Order o, ArrayList<MenuItem> preparate);

    /**
     * @precondition order != null
     */
    void generateBill(Order order);
}
