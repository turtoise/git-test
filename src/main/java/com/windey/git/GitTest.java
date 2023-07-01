package com.windey.git;

import com.windey.pojo.Class;
import com.windey.pojo.Student;

public class GitTest {

    public static void main(String[] args) {

        System.out.println("hello git");
        System.out.println("hello git2");
        System.out.println("hello git3");
        System.out.println("hello git4");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        System.out.println("push test2");
        System.out.println("pull test");

        sayHello();

        Student student = new Student("dahai");
        System.out.println(student.toString());

        Class aClass = new Class(1,"important class","sixth");
        System.out.println(aClass.toString());

        Class c2 = new Class(2, "Bad class", "six");
        System.out.println(c2.toString());



    }

    public static void sayHello(){
        int a = 10;
        int b = 20;
        System.out.println((a+b));
    }
}
