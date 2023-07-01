package com.windey.pojo;

public class Student {
    private String name;
    private int age;
    private int score;
    private int weight;
    private int height;
    private String city;
    private String address;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, int score, int weight, int height) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
