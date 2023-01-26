package com.buildingempire.StudentMangementApplication;

public class Student {
    private String name;
    private String state;
    private int admno;
    private int age;

    public Student(String name, String state, int admno, int age) {
        this.name = name;
        this.state = state;
        this.admno = admno;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAdmno() {
        return admno;
    }

    public void setAdmno(int admno) {
        this.admno = admno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
