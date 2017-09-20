package com.company;

public class Student {
    String firstName;
    String LastName;
    int id;
    int grade;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Student stu = (Student)obj;
        if(stu.id == id){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}
