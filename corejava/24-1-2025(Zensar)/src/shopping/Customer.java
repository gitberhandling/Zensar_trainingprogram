package shopping;
class Customer {
    private String customerId;
    private String customerName;
    public String email;  
    String address;  

  
    public Customer(String customerId, String customerName, String email, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
