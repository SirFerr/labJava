package _16lab.OrdersManager;

import _16lab.Order.Order;
import _16lab.MenuItem.MenuItem;

public class TableOrdersManager implements OrdersManager {
    private Order[] orders;

    public void add(Order order, int tableNumber) {
        orders[tableNumber] = order;
    }
    public void addItem(MenuItem item, int tableNumber) {
        orders[tableNumber].add(item);
    }
    public int freeTableNumber() throws Exception {
        for(int i = 0; i < orders.length; i++){
            if(orders[i] == null) 
                return i;
        }
        throw new Exception("Все столики заняты" + orders.length);
    }
    public int[] freeTableNumbers() throws Exception {
        int[] nums = new int[0];
        for(int i = 0; i < orders.length; i++){
            if(orders[i] == null){
                int[]tmp=new int[nums.length+1];
                System.arraycopy(nums, 0, tmp, 0, nums.length);
                tmp[tmp.length-1] = i;
                nums = tmp;
            }
        }
        if(nums.length > 0) 
            return nums;
        throw new Exception("Все столики заняты" + orders.length);
    }
    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }
    public void remove(int tableNumber) {
        orders[tableNumber] = null;
    }
    public boolean remove(Order order) {
        for(int i = 0; i < orders.length; i++){
            if(orders[i].equals(order)){
                orders[i] = null;
                return true;
            }
        }
        return false;
    }
    public int removeAll(Order order) {
        int count = 0;
        while(remove(order)) 
            count++;
        return count;
    }


    // Method interface OrdersManager
    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (Order o : orders) {
            if (o != null) 
                count += o.itemsQuantity(itemName);
        }
        return count;
    }
    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for (Order o : orders) {
            if (o != null) 
                count += o.itemsQuantity(item);
        }
        return count;
    }
    @Override
    public Order[] getOrders() {
        Order[] tmp = new Order[orders.length];
        int j = 0;
        for (Order order : orders) {
            if (order != null) 
                tmp[j++] = order;
        }
        Order[]res = new Order[j];
        System.arraycopy(tmp, 0, res, 0, j);

        return res;
    }
    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for(int i = 0; i < orders.length; i++){
            if(orders[i] != null) 
                cost += orders[i].costTotal();
        }
        return cost;
    }
    @Override
    public int ordersQuantity() {
        return getOrders().length;
    }
}
