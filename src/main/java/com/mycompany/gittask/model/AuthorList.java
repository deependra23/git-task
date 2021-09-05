package com.mycompany.gittask.model;

import java.util.Locale;

public class AuthorList {

    private int id;
    private String name;
    private String address;

    public AuthorList(){

    }

    public AuthorList(int id, String name, String address){
        this.id = id;
        this.name=name;
        this.address = address;
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
        address = address;
    }
}
