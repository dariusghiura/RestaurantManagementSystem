package BusinessLayer;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Order implements Serializable {
    private int orderID;
    private int table;
    private Date date;
    private float total;
    private static final long serialVersionUID = 2L;

    public Order(int orderID, int table, Date date) {
        this.orderID = orderID;
        this.table = table;
        this.date = date;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getTable() {
        return table;
    }

    public Date getDate() {
        return date;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID &&
                table == order.table &&
                date.equals(order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, date, table);
    }

    @Override
    public String toString() {
        return  "orderID=" + orderID +
                ", table=" + table +
                ", date=" + date +
                ", total=" + total;
    }
}

