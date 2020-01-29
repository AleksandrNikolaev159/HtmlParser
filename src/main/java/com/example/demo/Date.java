package com.example.demo;

public class Date {
    private int id;
    private String date;

    public Date(int id, String date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date{" +
                "id=" + id +
                ", date='" + date + '\'' +
                '}';
    }
}
