package _16lab.Order;

import _16lab.Customer.Customer;
import _16lab.MenuItem.MenuItem;

public class TableOrder implements Order {
    private int size;
    private MenuItem items[];

    private Customer customer;

    TableOrder() {
        this.size = 0;
    }
    @Override
    public boolean add(MenuItem item) {
        items[size] = item;
        size++;
        return true;
    }
    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        for(int i = 0; i < items.length; i++) {
            names[i] = items[i].getName();
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
        for (MenuItem element : items) {
            if(element.getName().equals(itemName)) 
                count++;
        }
        return count;
    }
    @Override
    public int itemsQuantity(MenuItem itemName) {
        int count = 0;
        for(MenuItem element : items) {
            if (element.equals(itemName))
                count++;
        }
        return count;
    }
    @Override
    public MenuItem[] getItems() {
        MenuItem[] arr = new MenuItem[size];
        System.arraycopy(items, 0, arr, 0, size);
        return arr;
    }
    private void decrease(int index) {
        MenuItem[] tmp = new MenuItem[items.length-1];
        System.arraycopy(items, 0, tmp, 0, index);
        System.arraycopy(items, index+1, tmp, index, items.length-index-1);
        items = tmp;
        size--;
    }
    @Override
    public boolean remove(String itemName){
        for(int i = 0; i < size; i++) {
            if(items[i].getName().equals(itemName)) {
                decrease(i);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean remove(MenuItem item) {
        for(int i = 0; i < size; i++) {
            if(items[i].equals(item)) {
                decrease(i);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(items[i].getName().equals(itemName)) {
                decrease(i);
                count++;
            }
        }
        return count;
    }
    
    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(items[i].equals(item)) {
                decrease(i);
                count++;
            }
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
        for(MenuItem element : items) {
            cost = cost + element.getCost();
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
