package _16lab.OrdersManager;

import _16lab.Order.Order;
import _16lab.MenuItem.MenuItem;

public class InternetOrdersManager implements OrdersManager{
    class QueueNode {
        QueueNode prev, next;
        Order value;
    }

    private QueueNode head, tail;
    private int size;

    InternetOrdersManager(int size) {
        head = tail = null;
        size = 0;
    }

    public boolean add(Order order) {
        QueueNode node = head;
        while (node!= null && node.value != null){
            node = node.next;
        }

        size++;
        if(head == null){
            tail = head = new QueueNode();
        }
        if(head.value == null) {
            head.value = order;
            return true;
        }
        QueueNode nNode = new QueueNode();
        tail.next = nNode;
        nNode.prev = tail;
        nNode.value = order;
        return true;
    }
    public Order remove() {
        if(head == null || head.value == null) {

        }
        Order v = head.value;
        head = head.next;
        size--;
        return v;
    }
    public Order order() {
        return head.value;
    }

    // Method Interface
    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode node = head;
        while (node!=null && node.value != null){
            count+=node.value.itemsQuantity(itemName);
            node = node.next;
        }
        return count;
    }
    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QueueNode node = head;
        while (node!=null && node.value != null){
            count+=node.value.itemsQuantity(item);
            node = node.next;
        }
        return count;
    }
    @Override
    public Order[] getOrders() {
        Order[] ords = new Order[size];
        QueueNode node = head;
        int i = 0;
        while (node!=null && node.value != null){
            ords[i++] = node.value;
            node = node.next;
        }
        return ords;
    }
    @Override
    public int ordersCostSummary() {
        int cost = 0;
        QueueNode node = head;
        while (node!=null && node.value != null){
            cost+=node.value.costTotal();
            node = node.next;
        }
        return cost;
    }
    @Override
    public int ordersQuantity() {
        return size;
    }
}
