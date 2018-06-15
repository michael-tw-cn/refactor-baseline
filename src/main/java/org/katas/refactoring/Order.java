package org.katas.refactoring;

import java.util.List;

public class Order {
    private Customer customer;
    List<LineItem> lineItems;

    public Order(String customerName, String customerAddr, List<LineItem> lineItems) {
        this.customer  = new Customer(customerName,customerAddr);
        this.lineItems = lineItems;
    }

    public String getCustomerAddress() {
        return customer.getAddress();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public Customer getCustomer() {
        return customer;
    }
}
