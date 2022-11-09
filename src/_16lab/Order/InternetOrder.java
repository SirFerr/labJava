package _16lab.Order;

import _16lab.Customer.Customer;
import _16lab.MenuItem.*;

public class InternetOrder implements Order {
    private class ListNode {
        private ListNode next;
        protected MenuItem data;
    
        ListNode(MenuItem data) {
            this.data = data;
        }
        ListNode() {
            this(null);
        }
    }

    int size;
    ListNode head;
    ListNode tail;

    Customer customer;

    InternetOrder() {
        head = tail = new ListNode();
        size = 0;
    }
    // ???
    @Override
    public boolean add(MenuItem item) {
        if(head.data == null){
            head.data = item;
            return true;
        }
        tail.next = new ListNode(item);
        tail = tail.next;
        size++;
        return true;
    }
    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        int i = 0;
        ListNode node = head;
        while(node != null) {
            names[i] = head.data.getName();
            i++;
        }
        return names;
    }
    @Override
    public int itemsQuantity() {
        return size;
    }
    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        ListNode node = head;
        while(node != null){
            if(node.data.getName().equals(itemName)) count++;
            node = node.next;
        }
        return count;
    }
    @Override
    public int itemsQuantity(MenuItem itemName) {
        int count = 0;
        ListNode node = head;
        while(node != null){
            if(node.data.equals(itemName)) 
                count++;
            node = node.next;
        }
        return count;
    }
    // TODO
    @Override
    public MenuItem[] getItems() {
        MenuItem[] arr = new MenuItem[size];
        int count = 0;
        ListNode node = head;
        while(node != null){
            arr[count] = node.data;
            node = node.next;
            count++;
        }
        return arr;
    }
    @Override
    public boolean remove(String itemName){
        ListNode node = head, prevNode = null;

        while(node != null){
            if(node.data.getName().equals(itemName)){
                if(prevNode != null) 
                    prevNode.next = node.next;
                if (node == tail) 
                    tail = prevNode;
                if(node == head) 
                    head = head.next;
                size--;
                return true;
            }
            prevNode = node;
            node = node.next;
        }
        return false;
    }
    @Override
    public boolean remove(MenuItem item) {
        ListNode node = head, prevNode = null;
        while(node != null){
            if(node.data.equals(item)){
                if(prevNode != null) 
                    prevNode.next = node.next;
                if (node == tail) 
                    tail = prevNode;
                if(node == head) 
                    head = head.next;
                size--;
                return true;
            }
            prevNode = node;
            node = node.next;
        }
        return false;
    }
    // TODO
    @Override
    public int removeAll(String itemName) {
        ListNode node = head, prevNode = null;
        int count = 0;

        while(node != null){
            if(node.data.getName().equals(itemName)){
                if(prevNode != null) 
                    prevNode.next = node.next;
                if (node == tail) 
                    tail = prevNode;
                if(node == head) 
                    head = head.next;
                size--;
                count++;
                return count;
            }
            prevNode = node;
            node = node.next;
        }
        return count;
    }
    
    @Override
    public int removeAll(MenuItem item) {
        ListNode node = head, prevNode = null;
        int count = 0;

        while(node != null){
            if(node.data.equals(item)){
                if(prevNode != null) 
                    prevNode.next = node.next;
                if (node == tail) 
                    tail = prevNode;
                if(node == head) 
                    head = head.next;
                size--;
                count++;
                return count;
            }
            prevNode = node;
            node = node.next;
        }
        return count;
    }
    
    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        mergeSort(items);
        return items;
    }
    
    @Override
    public int costTotal() {
        int cost = 0;
        ListNode node = head;
        while (node != null){
            cost += node.data.getCost();
            node = node.next;
        }
        return cost;
    }
    
    @Override
    public Customer getCustomer() {
        return customer;
    }
    @Override
    public void setCustomer(Customer customer) {
        this.customer = new Customer(
            customer.getFirstName(), 
            customer.getSecondName(), 
            customer.getAge(), 
            customer.getAddress()
        );
    }

    private void mergeSort(MenuItem[] arr){
        if(arr.length < 2) 
            return;
        int middle = arr.length/2;
        MenuItem[]l = new MenuItem[middle];
        MenuItem[]r = new MenuItem[arr.length-middle];
        System.arraycopy(arr, 0, l, 0, middle);
        System.arraycopy(arr, middle, r, 0, arr.length-middle);

        mergeSort(l);
        mergeSort(r);

        merge(arr, l, r);
    }
    private void merge(MenuItem[] arr, MenuItem[] left, MenuItem[] right){
        int iArr = 0, iLeft = 0, iRight = 0;
        while (iLeft < left.length && iRight < right.length){
            if(left[iLeft].getCost() <= right[iRight].getCost())
                arr[iArr++] = left[iLeft++];
            else arr[iArr++] = right[iRight++];
        }
        while(iLeft < left.length)
            arr[iArr++] = left[iLeft++];
        while (iRight < right.length)
            arr[iArr++] = right[iRight++];
    } 
}
