package com.example.Student_201904385.dto;

public class HelloRequest {
    private String name;
    private int level;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "HelloRequest{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", address='" + address + '\'' +
                '}';
    }
}
