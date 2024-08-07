package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity

public class Portfolio extends Client{

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private Date date = new Date();

    protected Portfolio(){

    }

    public Portfolio(Date date){
        this.date = date;
    }

    public long getPortfolioId(){
        return portfolioId;
    }

    @Override
    public long getClientId() {
        return super.getClientId();
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }
}
