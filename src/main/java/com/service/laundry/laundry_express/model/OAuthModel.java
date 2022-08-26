package com.service.laundry.laundry_express.model;


public class OAuthModel {
    private String phoneNumber;
    private String password;
    private boolean isUser;

    public OAuthModel() {}

    public OAuthModel(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public OAuthModel(String phoneNumber, String password, boolean isUser) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.isUser = isUser;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isUser() {
        return isUser;
    }

    public void setUser(boolean user) {
        isUser = user;
    }
}
