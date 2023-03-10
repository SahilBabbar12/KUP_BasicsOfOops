package com.knoldus.Program3;

class Degree
{
    public void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("I am an undergraduate");
    }
}
class Postgraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("I am an postgraduate");
    }
}

public class ShowDegree
{
    public static void main(String args[])
    {
        Degree degree = new Degree();
        Undergraduate undergraduateStudent = new Undergraduate();
        Postgraduate postgraduateStudent = new Postgraduate();
        degree.getDegree();
        undergraduateStudent.getDegree();
        postgraduateStudent.getDegree();
    }
}
