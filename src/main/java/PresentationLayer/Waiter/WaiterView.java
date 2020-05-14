package PresentationLayer.Waiter;

import BusinessLayer.MenuItem;
import BusinessLayer.Order;
import BusinessLayer.Restaurant;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Map;

public class WaiterView extends JFrame {
    private JButton addButton;
    private JButton createOrderButton;
    private JButton generateBillButton;
    private JComboBox<MenuItem> productsComboBox;
    private JComboBox<Order> orderComboBox;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPane1;
    private JTable jTable;
    private JTextField quantityTextField;
    private JTextField tableTextField;

    private Restaurant model;

    public WaiterView(Restaurant model) {
        this.model = model;
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jTabbedPane1 = new JTabbedPane();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        quantityTextField = new JTextField("1");
        productsComboBox = new JComboBox<MenuItem>();
        orderComboBox = new JComboBox<Order>();
        addButton = new JButton();
        createOrderButton = new JButton();
        tableTextField = new JTextField();
        jPanel3 = new JPanel();
        jLabel3 = new JLabel();
        generateBillButton = new JButton();
        jPanel4 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable = new JTable();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WAITER");

        productsComboBoxSetter();
        orderComboBoxSetter();

        jLabel1.setText("Table Nr : ");
        jLabel2.setText("Select Product and Quantity :");
        addButton.setText("Add");
        createOrderButton.setText("Create Order");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(addButton)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(productsComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(quantityTextField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(createOrderButton)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tableTextField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(tableTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(quantityTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productsComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addButton)
                                .addGap(18, 18, 18)
                                .addComponent(createOrderButton)
                                .addContainerGap(318, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add new Order", jPanel2);
        jLabel3.setText("Order : ");
        generateBillButton.setText("Generate Bill");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(orderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(generateBillButton))
                                .addContainerGap(464, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(orderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(generateBillButton)
                                .addContainerGap(378, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Generate Bill", jPanel3);

        tableSetter();
        jScrollPane1.setViewportView(jTable);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View Orders", jPanel4);

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
                        .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public void productsComboBoxSetter(){
        productsComboBox.removeAllItems();

        for (MenuItem m : model.getMenu())
            productsComboBox.addItem(m);
    }

    public void orderComboBoxSetter(){
        orderComboBox.removeAllItems();
        Order o;
        for (Map.Entry<Order, ArrayList<MenuItem> > entry : model.getOrders().entrySet())
            orderComboBox.addItem(entry.getKey());
    }

    public void tableSetter(){
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("ID");
        tableModel.addColumn("Table");
        tableModel.addColumn("Date");
        tableModel.addColumn("Products");
        tableModel.addColumn("Total");

        for (Map.Entry<Order, ArrayList<MenuItem>> entry : model.getOrders().entrySet()){
            Order o = entry.getKey();
            ArrayList<MenuItem> m = entry.getValue();
            String[] data = {String.valueOf(o.getOrderID()), String.valueOf(o.getTable()), o.getDate().toString(), m.toString(), String.valueOf(o.getTotal())};
            tableModel.addRow(data);
        }
        jTable.setModel(tableModel);
    }

    public void addAddListener(WaiterController.AddListener addListener) {
        addButton.addActionListener(addListener);
    }

    public void addCreateOrderListener(WaiterController.CreateOrderListener createOrderListener) {
        createOrderButton.addActionListener(createOrderListener);
    }

    public void addGenerateListener(WaiterController.GenerateListener generateListener) {
        generateBillButton.addActionListener(generateListener);
    }

    public JComboBox<MenuItem> getProductsComboBox() {
        return productsComboBox;
    }
    public JComboBox<Order> getOrderComboBox() {
        return orderComboBox;
    }
    public JTextField getQuantityTextField() {
        return quantityTextField;
    }
    public JTextField getTableTextField() {
        return tableTextField;
    }

}
