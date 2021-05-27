package com.company;

public class Klient {
    private String surname;
    private String name;
    private String lastname;
    private String address;
    private String phone;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Klient(){
        this.surname=surname;
        this.name=name;
        this.lastname=lastname;
        this.address=address;
        this.phone=phone;

    }

}
