package _16lab.Customer;

public final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;

    private Customer MATURE_UNKNOWN_CUSTOMER = new Customer("", "", age, Address.EMPTY_ADDRESS);
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("", "", age-1, Address.EMPTY_ADDRESS);

    public Customer(int age) {
        this("", "", age, Address.EMPTY_ADDRESS);
    }

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
}
