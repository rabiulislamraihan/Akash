
package customerpkg;

import java.io.Serializable;


class Subscription implements Serializable {
    private String PackageTitle;
    private int PackageDuration;
    private int PackagePrice;

    public Subscription(String PackageTitle, int PackageDuration, int PackagePrice) {
        this.PackageTitle = PackageTitle;
        this.PackageDuration = PackageDuration;
        this.PackagePrice = PackagePrice;
    }
    
    

    public String getPackageTitle() {
        return PackageTitle;
    }

    public void setPackageTitle(String PackageTitle) {
        this.PackageTitle = PackageTitle;
    }

    public int getPackageDuration() {
        return PackageDuration;
    }

    public void setPackageDuration(int PackageDuration) {
        this.PackageDuration = PackageDuration;
    }

    public int getPackagePrice() {
        return PackagePrice;
    }

    public void setPackagePrice(int PackagePrice) {
        this.PackagePrice = PackagePrice;
    }
    
}
