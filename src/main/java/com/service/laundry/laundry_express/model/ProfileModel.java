package com.service.laundry.laundry_express.model;



import javax.persistence.*;

@Entity
@Table(name = "profile")
public class ProfileModel {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fullName;
    private String phoneNumber;
    private String address;
    private String imagePath;

    private String userType;

    public ProfileModel() {}

    public ProfileModel(int id, String fullName, String phoneNumber, String address, String imagePath, String userType) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.imagePath = imagePath;
        this.userType = userType;
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

    public ProfileModel(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "ProfileModel{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

}
