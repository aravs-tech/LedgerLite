package Dto;

public class ProductDto {
   private String description;
   private int stock;
   private float price;
   private String productId;
   private String type;

   public ProductDto(String description, int stock, float price, String productId, String type) {
      this.description = description;
      this.stock = stock;
      this.price = price;
      this.productId = productId;
      this.type = type;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getStock() {
      return this.stock;
   }

   public void setStock(int stock) {
      this.stock = stock;
   }

   public float getPrice() {
      return this.price;
   }

   public void setPrice(float price) {
      this.price = price;
   }

   public String getProductId() {
      return this.productId;
   }

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type;
   }
}
