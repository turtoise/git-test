package com.windey.pojo;

public class Class {
    private int id;
    private String className;
    private String school;

    public Class(int id, String className, String school) {
        this.id = id;
        this.className = className;
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
