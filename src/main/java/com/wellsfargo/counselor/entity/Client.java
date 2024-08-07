package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client extends Advisor{
    @Id
    @GeneratedValue()
    private long clientId;



    @Column(nullable = false)
    private String fName;

    @Column(nullable = false)
    private String lName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    protected Client(){

    }

    public Client(String fName, String lName, String address, String phoneNumber, String email){
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public long getClientId(){
        return clientId;
    }

    @Override
    public Long getAdvisorId() {
        return super.getAdvisorId();
    }

    public String getFirstName(){
        return fName;
    }
    public void setFirstName(String fName){
        this.fName = fName;
    }

    public String getLastName(){
        return lName;
    }
    public void setLastName(String lName){
        this.lName = lName;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
