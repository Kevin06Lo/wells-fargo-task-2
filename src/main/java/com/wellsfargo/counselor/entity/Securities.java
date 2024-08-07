package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Securities extends Portfolio{

    @Id
    @GeneratedValue
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Securities(){

    }
    public Securities(String name, String category, int purchasePrice, String purchaseDate, int quantity){
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId(){
        return securityId;
    }

    @Override
    public long getPortfolioId() {
        return super.getPortfolioId();
    }

    @Override
    public Date getDate() {
        return super.getDate();
    }
    @Override
    public void setDate(Date date) {
        super.setDate(date);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public int getPurchasePrice(){
        return purchasePrice;
    }
    public void setPurchasePrice(int purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate(){
        return purchaseDate;
    }
    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
