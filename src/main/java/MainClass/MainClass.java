package MainClass;

import BusinessLayer.Restaurant;
import DataLayer.RestaurantSerializator;
import PresentationLayer.Admin.AdministratorController;
import PresentationLayer.Admin.AdministratorView;
import PresentationLayer.Chef.ChefGraphicalUserInterface;
import PresentationLayer.Chef.Observer;
import PresentationLayer.Waiter.WaiterController;
import PresentationLayer.Waiter.WaiterView;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        //Restaurant restaurant = new Restaurant();
        Restaurant restaurant = RestaurantSerializator.deserialize(args[0]);
        restaurant.setObserverList(new ArrayList<Observer>());

        WaiterView wv = new WaiterView(restaurant);
        AdministratorView view = new AdministratorView(restaurant);
        WaiterController waiter = new WaiterController(wv, restaurant);
        new AdministratorController(view ,restaurant, waiter);
        ChefGraphicalUserInterface o = new ChefGraphicalUserInterface();
        restaurant.registerObserver(o);

        while (view.isDisplayable() || o.isDisplayable() || wv.isDisplayable() );

        RestaurantSerializator.serialize(restaurant, args[0]);
    }
}
