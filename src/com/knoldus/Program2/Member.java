package com.knoldus.Program2;

//address datatype
class Address{
    String city;
    String house_no;

    public Address(String city, String house_no) {
        this.city = city;
        this.house_no = house_no;
    }
}
public class Member {
    String name;
    int age;
    String phonenumber;
    Address address;
    double salary;

    public Member(String name, int age, String phonenumber, Address address, double salary) {
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary(){
        System.out.println(salary);
    }
}
class Employee extends Member{
    String specialization;
    Employee(String name, int age, String phonenumber, Address address, double salary,String specialization){
        super(name,age,phonenumber,address,salary);
        this.specialization=specialization;

    }
}
class Manager extends  Member{
    String department;
    Manager(String name, int age, String phonenumber, Address address, double salary,String department){
        super(name,age,phonenumber,address,salary);
        this.department=department;
    }

}
class PrintingSalary{
    public static void main(String[] args) {

        Address employee_address=new Address("Delhi","G-165/S-2");
        Address manager_address=new Address("Delhi","B-67");
        Employee employee =new Employee("Sahil",22,"9888672420",employee_address,10000,"Software Developer");
        Manager manager=new Manager("Sushant",40,"9807576437",manager_address,20000,"JAVA");

        //printing employee salary
        System.out.println("Salary of the employee: ");
        employee.printSalary();

        System.out.println("Salary of the manager: ");
        //printing manager salary
        manager.printSalary();
    }
}
