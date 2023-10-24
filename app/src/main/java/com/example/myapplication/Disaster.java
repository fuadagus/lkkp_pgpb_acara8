package com.example.myapplication;

import java.security.PublicKey;

public class Disaster {
    private String disasterName;

    public String getDisasterName() {
        return disasterName;
    }

    public void setDisasterName(String disasterName) {
        this.disasterName = disasterName;
    }

    public String getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    private String disasterType;

    public Disaster(String name, String type){
        this.disasterName = name;
        this.disasterType = type;
    }
}
