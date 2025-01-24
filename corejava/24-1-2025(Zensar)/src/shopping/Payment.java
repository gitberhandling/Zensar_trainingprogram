package shopping;

class Payment {
    private String paymentId;
    protected double paymentAmount;  // protected access
    String paymentStatus;  // default access

    // Constructor to initialize Payment attributes
    public Payment(String paymentId, double paymentAmount, String paymentStatus) {
        this.paymentId = paymentId;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = paymentStatus;
    }

    // Public method to process payment
    public void processPayment() {
        System.out.println("Payment of " + paymentAmount + " has been processed.");
        this.paymentStatus = "Processed";
    }

    // Public method to get payment status
    public String getPaymentStatus() {
        return paymentStatus;
    }
}