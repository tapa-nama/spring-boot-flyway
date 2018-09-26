package com.thoughtworks.grad.springdemo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "t_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private double height;

//    @Column(name = "clazz_id")
//    private int clazzId;

    @ManyToOne
    private Clazz clazz;

    public Student() {
    }

    public Student(String name, int age, double height, Clazz clazz) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.clazz = clazz;
    }
}
