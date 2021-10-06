package com.example.multipledatasource.entity.b;


import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="sameD",schema = "ADB")
public class BD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int b_id;

    public BD(String name,int b_id) {
        this.name = name;
        this.b_id=b_id;
    }


}