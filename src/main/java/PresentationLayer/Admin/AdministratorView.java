package PresentationLayer.Admin;

import BusinessLayer.CompositeProduct;
import BusinessLayer.MenuItem;
import BusinessLayer.Restaurant;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdministratorView extends JFrame {
    private JButton addItemButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton addItemCompositionButton;
    private JButton editItemCompositionButton;
    private JComboBox<String> typeComboBox;
    private JComboBox<MenuItem> editProductComboBox;
    private JComboBox<MenuItem> deleteComboBox;
    private JComboBox<MenuItem> addCompositionComboBox;
    private JComboBox<MenuItem> editCompositionComboBox;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPane1;
    private JTable jTable;
    private JTextField addNameTextField;
    private JTextField addPriceTextField;
    private JTextField editNameTextField;
    private JTextField editPriceTextField;
    private JTextField addCompositionTextField;
    private JTextField editCompositionTextField;

    private Restaurant model;


    public AdministratorView(Restaurant model) {
        this.model = model;
        initComponents();
        setVisible(true);
    }

    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMINISTRATOR");
        setLocation(600,300);


        jPanel1 = new JPanel();
        jTabbedPane1 = new JTabbedPane();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        typeComboBox = new JComboBox<>();
        addNameTextField = new JTextField();
        addPriceTextField = new JTextField();
        jLabel4 = new JLabel();
        addItemButton = new JButton();
        addCompositionComboBox = new JComboBox<MenuItem>();
        jLabel10 = new JLabel();
        addCompositionTextField = new JTextField();
        addItemCompositionButton = new JButton();
        jPanel4 = new JPanel();
        jLabel5 = new JLabel();
        editProductComboBox = new JComboBox<MenuItem>();
        jLabel6 = new JLabel();
        editNameTextField = new JTextField();
        jLabel7 = new JLabel();
        editPriceTextField = new JTextField();
        jLabel8 = new JLabel();
        editButton = new JButton();
        editCompositionComboBox = new JComboBox<MenuItem>();
        editItemCompositionButton = new JButton();
        jLabel11 = new JLabel();
        editCompositionTextField = new JTextField();
        jPanel5 = new JPanel();
        jLabel9 = new JLabel();
        deleteComboBox = new JComboBox<MenuItem>();
        deleteButton = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable = new JTable();


        comboBoxInitializer();
        tableSetter();

        jLabel2.setText("New product's name : ");
        jLabel1.setText("Price (For BaseProduct) : ");
        jLabel3.setText("Type of product : ");
        jLabel4.setText("Select products (For CompositeProduct) : ");

        addItemButton.setText("Add Item");
        addItemButton.setHorizontalTextPosition(SwingConstants.CENTER);


        jLabel10.setText("Composition : ");

        addCompositionTextField.setEditable(false);

        addItemCompositionButton.setText("Add to Composition");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(addPriceTextField))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(addNameTextField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(typeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addCompositionComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addItemCompositionButton))
                                        .addComponent(addItemButton)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addCompositionTextField)))
                                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(typeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addPriceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addCompositionComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addItemCompositionButton))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(addCompositionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(addItemButton)
                                .addContainerGap(167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add new Menu Item", jPanel3);

        jLabel5.setText("Select product : ");


        jLabel6.setText("New name : ");


        jLabel7.setText("New price : (BaseProduct) :");

        jLabel8.setText("Select composition : ");

        editButton.setText("Edit");


        editItemCompositionButton.setText("Add to composition");

        jLabel11.setText("Composition : ");

        editCompositionTextField.setEditable(false);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(editPriceTextField, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                                .addComponent(editButton)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(editNameTextField))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(editProductComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(editCompositionComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(editItemCompositionButton))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(editCompositionTextField)))
                                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editProductComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editPriceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editCompositionComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editItemCompositionButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(editCompositionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(editButton)
                                .addContainerGap(174, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit Menu Item", jPanel4);

        jLabel9.setText("Select product : ");

        deleteButton.setText("Delete");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deleteComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(deleteButton))
                                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton)
                                .addContainerGap(358, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Menu Item", jPanel5);
        
        jScrollPane1.setViewportView(jTable);

        jTabbedPane1.addTab("View Menu", jScrollPane1);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }


    private void comboBoxInitializer(){
        typeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "<default>", "BaseProduct", "CompositeProduct" }));
        for (MenuItem i : model.getMenu()) {
            editProductComboBox.addItem(i);
            deleteComboBox.addItem(i);
            addCompositionComboBox.addItem(i);
            editCompositionComboBox.addItem(i);
        }
    }

    public void updateCombo(){
        editProductComboBox.removeAllItems();
        deleteComboBox.removeAllItems();
        addCompositionComboBox.removeAllItems();
        editCompositionComboBox.removeAllItems();

        comboBoxInitializer();
    }

    public void tableSetter(){
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("Name");
        tableModel.addColumn("Type");
        tableModel.addColumn("Price");
        tableModel.addColumn("Composition");

        for (MenuItem m : model.getMenu()){
            String[] data = {m.getName(), m.getClass().getSimpleName(), String.valueOf(m.getPrice()), ""};
            if (m instanceof CompositeProduct){
                CompositeProduct c = (CompositeProduct)m;
                data[3] = c.getProducts().toString();
            }
            tableModel.addRow(data);
        }
        jTable.setModel(tableModel);
    }

    public void addDeleteListener(AdministratorController.DeleteListener delAl){
        deleteButton.addActionListener(delAl);
    }

    public void addTypeComboListener(AdministratorController.TypeComboListener tcAl){
        typeComboBox.addActionListener(tcAl);
    }

    public void addCompositionListener(AdministratorController.AddToCompositionListener bcAl){
        addItemCompositionButton.addActionListener(bcAl);
        editItemCompositionButton.addActionListener(bcAl);
    }

    public void addItemListener(AdministratorController.AddItemListener itAl){
        addItemButton.addActionListener(itAl);
    }

    public void addEditItemListener(AdministratorController.EditItemListener eiAl){
        editButton.addActionListener(eiAl);
    }

    public JComboBox<MenuItem> getdeleteComboBox() {
        return deleteComboBox;
    }
    public JButton getAddItemCompositionButton() {
        return addItemCompositionButton;
    }
    public JComboBox<String> getTypeComboBox() {
        return typeComboBox;
    }
    public JComboBox<MenuItem> getEditProductComboBox() {
        return editProductComboBox;
    }
    public JComboBox<MenuItem> getAddCompositionComboBox() {
        return addCompositionComboBox;
    }
    public JComboBox<MenuItem> getEditCompositionComboBox() {
        return editCompositionComboBox;
    }
    public JTextField getAddNameTextField() {
        return addNameTextField;
    }
    public JTextField getAddPriceTextField() {
        return addPriceTextField;
    }
    public JTextField getEditNameTextField() {
        return editNameTextField;
    }
    public JTextField getEditPriceTextField() {
        return editPriceTextField;
    }
    public JTextField getAddCompositionTextField() {
        return addCompositionTextField;
    }
    public JTextField getEditCompositionTextField() {
        return editCompositionTextField;
    }

}
