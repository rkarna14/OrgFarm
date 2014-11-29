package com.example.dark_devil.orgfarm.apiClasses;

/**
 * Created by dark-devil on 11/25/14.
 */
public class SellersAdvertisement {
    public String farmerName;
    public int farmerId;
    public int productID;
    public String productName;
    public float minQtyForSale;
    public float maxQtyForSale;
    public String dateOfAd;
    public String dateOfClose;
    public float base_price;
    public SellersAdvertisement(String farmerName, int farmerId, int productId, String productName, float minQtyForSale, float maxQtyForSale, String dateOfClose, String dateOfAd, float base_price){
        this.farmerName = farmerName;
        this.farmerId = farmerId;
        this.productID = productId;
        this.productName = productName;
        this.minQtyForSale = minQtyForSale;
        this.maxQtyForSale = maxQtyForSale;
        this.dateOfAd = dateOfAd;
        this.dateOfClose = dateOfClose;
        this.base_price = base_price;
    }
}
