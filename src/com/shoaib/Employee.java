package com.shoaib;

public class Employee {
    int id;
    String name;
    float salary;

    void insert(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee s1 = new Employee();
        Employee s2 = new Employee();
        Employee s3 = new Employee();

        s1.insert(111, "Shoaib", 2000);
        s2.insert(222, "karma", 3000);
        s3.insert(333, "basti", 4000);
        s1.display();
        s2.display();
        s3.display();
    }
}


