package PresentationLayer.Waiter;

import BusinessLayer.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class WaiterController {
    private WaiterView view;
    private Restaurant model;

    private ArrayList<MenuItem> order;

    public WaiterController(WaiterView view , Restaurant model){
        this.model = model;
        this.view = view;

        order = new ArrayList<>();

        view.addAddListener(new AddListener());
        view.addCreateOrderListener(new CreateOrderListener());
        view.addGenerateListener(new GenerateListener());
    }

    public void updateProductsComboBox(){
        view.productsComboBoxSetter();
    }

    class GenerateListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            Order o = (Order)view.getOrderComboBox().getSelectedItem();
            model.generateBill(o);
        }
    }

    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            MenuItem m = (MenuItem) view.getProductsComboBox().getSelectedItem();
            int quantity = Integer.parseInt(view.getQuantityTextField().getText());
            if (quantity > 0)
                for (int i = 0; i < quantity; i++)
                    order.add(m);
        }
    }

    class CreateOrderListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            int table = Integer.parseInt(view.getTableTextField().getText());
            model.createOrder(new Order(0, table, new Date()), order);

            view.orderComboBoxSetter();
            view.tableSetter();
            order = new ArrayList<>();
        }
    }
}
