package com.example;
import java.util.Scanner;
public class Persegi extends bagun_datar {
    int sisi;
    public Persegi(int sisi) {
        this.sisi = sisi;

    }

    public float luas() {
        return this.sisi * this.sisi;
    }

    public float keliling() {
        return this.sisi * 4;
    }
    
}
