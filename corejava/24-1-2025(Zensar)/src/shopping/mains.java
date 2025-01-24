package shopping;
public class mains {
    public static void main(String[] args) {
 Product product = new Product("P001", "Laptop", 1500.00, 50);
 Customer customer = new Customer("C001", "John Doe", "john.doe@example.com", "123 Elm Street");
 Order order = new Order(product, customer, "Placed", "2025-01-24");
 Payment payment = new Payment("PAY001", 1500.00, "Pending");
 System.out.println("Customer Email: " + customer.email);
  System.out.println("Product Price: " + product.price);
 order.updateOrderStatus("Shipped");
System.out.println("Order Status: " + order.orderStatus);

System.out.println("Product ID: " + product.getProductId());
 System.out.println("Customer Name: " + customer.getCustomerName());
 product.updateStockQuantity(45);
 
 
 System.out.println("Updated Stock Quantity: " + product.getStockQuantity());
 System.out.println("Order Date: " + order.orderDate);
        
 payment.processPayment();

   System.out.println("Payment Status: " + payment.getPaymentStatus());
        order.displayOrderDetails();
    }
}