package com.hackumass.med.medapp;

public class Medication {

    private String brandName;
    private int dosage;

    public Medication(String name, int dose)
    {
        this.brandName=name;
        this.dosage=dose;
    }

    public int getDosage() {
        return dosage;
    }

    public String getBrandName() {
        return brandName;
    }
}
