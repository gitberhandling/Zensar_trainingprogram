package shopping;

class Order {
    private Product product;  
    private Customer customer;  
    protected String orderStatus;  
    String orderDate;  
    public Order(Product product, Customer customer, String orderStatus, String orderDate) {
        this.product = product;
        this.customer = customer;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
    }

    public void updateOrderStatus(String status) {
        this.orderStatus = status;
    }
    public void displayOrderDetails() {
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Product: " + product.getProductName());
        System.out.println("Customer: " + customer.getCustomerName());
    }
}