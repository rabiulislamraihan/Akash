
package customerpkg;

import java.time.LocalDate;


public class Subscriptions {
    private int CustomerID;
    private String PackageID;
    private int PackageDuration;
    private LocalDate Purchasedate;
    private int price;
    private String Bill;
    
    public Subscriptions(int CustomerID, String PackageID, int PackageDuration, LocalDate Purchasedate, int price, String Bill) {
        this.CustomerID = CustomerID;
        this.PackageID = PackageID;
        this.PackageDuration = PackageDuration;
        this.Purchasedate = Purchasedate;
        this.price = price;
        this.Bill = Bill;
    }

    public String getBill() {
        return Bill;
    }

    public void setBill(String Bill) {
        this.Bill = Bill;
    }
    
    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getPackageID() {
        return PackageID;
    }

    public void setPackageID(String PackageID) {
        this.PackageID = PackageID;
    }

    public int getPackageDuration() {
        return PackageDuration;
    }

    public void setPackageDuration(int PackageDuration) {
        this.PackageDuration = PackageDuration;
    }

    public LocalDate getPurchasedate() {
        return Purchasedate;
    }

    public void setPurchasedate(LocalDate Purchasedate) {
        this.Purchasedate = Purchasedate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
