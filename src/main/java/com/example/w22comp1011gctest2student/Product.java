/*
*Student Name-Ashu Sheoran
* Student id -200485170
 */

package com.example.w22comp1011gctest2student;

import javafx.scene.input.ScrollEvent;

public class Product {
  private String sku;
  private String name;
  private double salePrice;
  private double regularPrice;
  private String image;

  public double totalPurchases(){
    return salePrice+=salePrice;
  }
  public double totalSaving(){
    var totalSave=regularPrice-salePrice;
    overallSave(totalSave);
    return totalSave+=totalSave;
  }

  public boolean overallSave(double totalSaving){
    if(totalsave>=5.0)
      return true;
    else
      return false;
  }
  public String getSku() {
    return this.sku;
  }

  public String getName() {
    return this.name;
  }

  public double getSalePrice() {
    return this.salePrice;
  }

  public double getRegularPrice() {
    return this.regularPrice;
  }

  public String getImage() {
    return this.image;
  }

  @Override
  public String toString() {
    return getName() + "-$" + getSalePrice();
  }

}

