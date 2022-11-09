package _16lab.OrdersManager;

import _16lab.Order.Order;
import _16lab.MenuItem.*;

public interface OrdersManager {
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders();
    public int ordersCostSummary();
    public int ordersQuantity();
}
