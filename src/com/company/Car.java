package com.company;

public class Car {
    private String id;
    private int autoNum;

    public Car() {
    }

    public Car(String id, int autoNum) {
        this.id = id;
        this.autoNum = autoNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(int autoNum) {
        this.autoNum = autoNum;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id: " + id +
                ", autoNum: " + autoNum ;
    }
}
