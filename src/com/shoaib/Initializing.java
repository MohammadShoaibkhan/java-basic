package com.shoaib;

public class Initializing {
    int id;
    String name;

}
  class TestInitializing1{
    public static void main(String[]args) {

        Initializing s1 = new Initializing();
        s1.id = 101;
        s1.name = "Shoaib";
        System.out.println(s1.id+" "+s1.name);

    }
}