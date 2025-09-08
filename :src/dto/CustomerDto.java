package Dto;

import java.util.Date;

public class CustomerDto extends UserDto {
   private String customerID;
   private String firstName;
   private String lastName;
   private String email;
   private String address;
   private float purchaseAmount;
   private Date joinDate;
   private Date lastPurchase;
   private int contactNumber;
   private BillDto[] bills;

   public String getCustomerID() {
      return this.customerID;
   }

   public void setCustomerID(String customerID) {
      this.customerID = customerID;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getAddress() {
      return this.address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public float getPurchaseAmount() {
      return this.purchaseAmount;
   }

   public void setPurchaseAmount(float purchaseAmount) {
      this.purchaseAmount = purchaseAmount;
   }

   public Date getJoinDate() {
      return this.joinDate;
   }

   public void setJoinDate(Date joinDate) {
      this.joinDate = joinDate;
   }

   public Date getLastPurchase() {
      return this.lastPurchase;
   }

   public void setLastPurchase(Date lastPurchase) {
      this.lastPurchase = lastPurchase;
   }

   public int getContactNumber() {
      return this.contactNumber;
   }

   public void setContactNumber(int contactNumber) {
      this.contactNumber = contactNumber;
   }

   public BillDto[] getBills() {
      return this.bills;
   }

   public void setBills(BillDto[] bills) {
      this.bills = bills;
   }

   public CustomerDto(String firstName, String lastName, String streetAddress, int contactNum, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = this.address;
      this.contactNumber = this.contactNumber;
      this.email = email;
   }
}
