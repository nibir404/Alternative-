package Management;

import java.util.Scanner;

public class Patient {
    private String gender,blood_group,name;
    private int id,age;

    Scanner scan = new Scanner(System.in);


    public Patient(String g, String bg , String n, int i, int a ){
        gender = g;
        blood_group = bg;
        name = n;
        id = i;
        age = a;

    }

    public void display() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
        System.out.println("Blood Group : "+blood_group);
        System.out.println("ID : "+id);
    }

}
