package day3;

public class Customer {
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(String name, int id, String city) {
        this.customerName = name;
        this.customerId = id;
        this.customerCity = city;
    }

    // Setters
    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setCustomerId(int id) {
        this.customerId = id;
    }

    public void setCustomerCity(String city) {
        this.customerCity = city;
    }

    // Override toString() to display customer details
    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\n"
             + "Customer Name: " + customerName + "\n"
             + "Customer City: " + customerCity + "\n";
    }
}
