package com.leezz.pojo;

/**
 * Created by 臧力 on 2017/5/29.
 */
public class User {
    private int id;
    private String name;
    private String address;
    private int phonenumber;

    public User() {
    }

    public User(int id, String name, String address, int phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
