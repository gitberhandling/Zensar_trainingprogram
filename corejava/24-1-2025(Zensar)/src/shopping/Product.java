package shopping;
class Product {
    private String productId;
    private String productName;
    protected double price;
    int stockQuantity;
    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected int getStockQuantity() {
        return stockQuantity;
    }
    void updateStockQuantity(int newQuantity) {
        this.stockQuantity = newQuantity;
    }
}
