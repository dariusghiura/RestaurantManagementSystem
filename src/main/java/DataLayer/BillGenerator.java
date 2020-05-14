package DataLayer;

import BusinessLayer.MenuItem;
import BusinessLayer.Order;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BillGenerator {

    public static void generateBill(Order o, ArrayList<MenuItem> products){
        FileWriter writer = null;
        try {
            writer = new FileWriter(new File("Bills/bill_" + o.getOrderID()+ ".txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (writer != null)
            try {
                writer.append("Bill for Order : ").append(String.valueOf(o.getOrderID())).append("\n");
                writer.append("Table number : ").append(String.valueOf(o.getTable())).append("\n");
                writer.append("Date : ").append(String.valueOf(o.getDate())).append("\n");
                writer.append("Products : ").append(String.valueOf(products)).append("\n");
                writer.append("Total : ").append(String.valueOf(o.getTotal()));
                writer.close();
            } catch (IOException  e) {
                e.printStackTrace();
            }

    }

}
