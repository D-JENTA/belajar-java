package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class latihanQueue {
    String str;
    int num;
    public static void main(String[] args) {
        latihanQueue q = new latihanQueue();
        
    }
    public latihanQueue (){
        try{
            LinkedList <Integer> list = new LinkedList<Integer>();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("jumlah data : ");
            str = bf.readLine();
            if ((num = Integer.parseInt(str)) == 1 ) {
                System.out.println("anda menekan angka satu ");
                System.exit(0);
            }
            else {
                for (int i = 1; i <= num; i++){
                    System.out.print("masukan elemen " + i + " : "); 
                    str = bf.readLine();
                    int n = Integer.parseInt(str);
                    list.add(n);
               }
            }
            System.out.println("isi queue : " + list);
            System.out.println("Elemen Pertama: " + list.removeFirst());
            System.out.println("ElemenPertama : " + list.removeLast());
            System.out.print("Elemen Tengah : ");
            while (!list.isEmpty()) {
                System.out.print(list.remove() + " ");
            }
            System.out.println(" ");
        } catch (Exception e) {
            System.out.println(e.getMessage()+ "adalah String");
            System.exit(num);
        }
    }
}