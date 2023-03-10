package com.knoldus.Program1;

import java.util.Scanner;

class Student{
    String name;
    int rollno;
    public Student(String name, int rollno) {
        this.name   = name;
        this.rollno = rollno;
    }

    Student(Student student){
        this.name=student.name;
        this.rollno=student.rollno;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}
public class ObjectCloning {
    public static void main(String[] args) {
        System.out.println("Enter a name");

        Scanner input =new Scanner(System.in);
        String name = input.next();

        System.out.println("Enter the rollno");
        int rollno =input.nextInt();

        Student student1=new Student(name,rollno);

        //copying student1 values into student2
        Student student2= new Student(student1);

        System.out.println("Student 1 name:"+ student1.getName()+" , Student 1 marks:"+ student1.getRollno());
        System.out.println("Student 2 name:"+student2.getName()+" , Student 2 marks:"+student2.getRollno());

    }
}
