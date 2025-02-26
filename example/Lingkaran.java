package com.example;

public class Lingkaran extends bagun_datar{
    int r;
   
    public Lingkaran(int r) {
        this.r = r;
    }
    
    
    public float luas(){
        return (float) (Math.PI * r * r);
    }
    
    
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
}
