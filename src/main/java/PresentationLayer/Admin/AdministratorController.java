package PresentationLayer.Admin;

import BusinessLayer.*;
import PresentationLayer.Waiter.WaiterController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdministratorController {
    private AdministratorView view;
    private Restaurant model;
    private WaiterController waiterController;

    private ArrayList<MenuItem> newComposite;
    private String typeSelection;
    private ArrayList<MenuItem> editComposite;

    public AdministratorController(AdministratorView view , Restaurant model, WaiterController waiterController){
        this.model = model;
        this.view = view;
        this.waiterController = waiterController;

        newComposite = new ArrayList<>();
        editComposite = new ArrayList<>();

        view.addDeleteListener(new DeleteListener());
        view.addTypeComboListener(new TypeComboListener());
        view.addCompositionListener(new AddToCompositionListener());
        view.addItemListener(new AddItemListener());
        view.addEditItemListener(new EditItemListener());
    }

    class DeleteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MenuItem m = (MenuItem) view.getdeleteComboBox().getSelectedItem();
            model.deleteMenuItem(m);
            view.updateCombo();
            waiterController.updateProductsComboBox();
            view.tableSetter();
        }
    }

    class TypeComboListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           typeSelection = (String) view.getTypeComboBox().getSelectedItem();
           if (typeSelection.equals("BaseProduct")){
               view.getAddCompositionComboBox().setEnabled(false);
               view.getAddPriceTextField().setEnabled(true);
               view.getAddItemCompositionButton().setEnabled(false);
           }
           else if (typeSelection.equals("CompositeProduct")){
               view.getAddPriceTextField().setEnabled(false);
               view.getAddCompositionComboBox().setEnabled(true);
               view.getAddItemCompositionButton().setEnabled(true);
           }
           else{
               view.getAddPriceTextField().setEnabled(false);
               view.getAddCompositionComboBox().setEnabled(false);
               view.getAddItemCompositionButton().setEnabled(false);
           }
        }
    }

    class AddToCompositionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(view.getAddItemCompositionButton())){
                MenuItem m = (MenuItem) view.getAddCompositionComboBox().getSelectedItem();
                newComposite.add(m);
                view.getAddCompositionTextField().setText(newComposite.toString());
            }
            else {
                MenuItem m = (MenuItem) view.getEditCompositionComboBox().getSelectedItem();
                editComposite.add(m);
                view.getEditCompositionTextField().setText(editComposite.toString());
            }
        }
    }

    class AddItemListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String name = view.getAddNameTextField().getText();
            if (typeSelection.equals("BaseProduct")){
                float price = Float.parseFloat(view.getAddPriceTextField().getText());
                model.createMenuItem(new BaseProduct(name, price));
            }
            else if (typeSelection.equals("CompositeProduct")){
                model.createMenuItem(new CompositeProduct(name, newComposite));
            }

            view.updateCombo();
            waiterController.updateProductsComboBox();
            view.getAddCompositionTextField().setText("");
            newComposite = new ArrayList<>();
            view.tableSetter();
        }
    }

    class EditItemListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String name = view.getEditNameTextField().getText();
            MenuItem m = (MenuItem) view.getEditProductComboBox().getSelectedItem();
            if (m instanceof BaseProduct){
                float price;
                if (view.getEditPriceTextField().getText().equals(""))
                    price = -1;
                else
                    price = Float.parseFloat(view.getEditPriceTextField().getText());
                model.editMenuItem(m, name, price, null);
            }
            else{
                model.editMenuItem(m, name, 0, editComposite);
            }

            view.updateCombo();
            waiterController.updateProductsComboBox();
            view.getEditCompositionTextField().setText("");
            editComposite = new ArrayList<>();
            view.tableSetter();
        }
    }

}
