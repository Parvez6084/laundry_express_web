package com.service.laundry.laundry_express.model;

public class ProfileModel {

    private int id;
    private String fullName;
    private String phoneNumber;
    private String address;
    private String imagePath;

    public ProfileModel() {}

    public ProfileModel(int id, String fullName, String phoneNumber, String address, String imagePath) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
