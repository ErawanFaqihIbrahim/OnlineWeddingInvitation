package com.example.testadit;

public class AddGroup {

    public String getName(){
        return name;
    }

    public void setName(String name) {this.name = name;}

    private String name, phone;
    private int quantity;
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone) {this.phone = phone;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

}
