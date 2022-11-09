package _16lab.Order;

import _16lab.Customer.Customer;
import _16lab.MenuItem.*;

public interface Order {
    public boolean add(MenuItem item);
    public String[] itemsNames();
    public int itemsQuantity();
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem itemName);
    public MenuItem[] getItems();
    public boolean remove(String itemName);
    public boolean remove(MenuItem item);
    public int removeAll(String itemName);
    public int removeAll(MenuItem item);
    public MenuItem[] sortedItemsByCostDesc();
    public int costTotal();
    public Customer getCustomer();
    public void setCustomer(Customer customer);
}
