package com.shoaib;

public class Method {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

    class TestStudent2{
        public static void main(String[]args){
            Method s1=new Method();
            Method s2=new Method();
            s1.insertRecord(111,"Shoaib");
            s2.insertRecord(222,"Karma");

            s1.displayInformation();
            s2.displayInformation();
        }
    }

