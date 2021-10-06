package com.example.multipledatasource.entity.a;


import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="sameC",schema = "ADB")
public class AC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int a_id;

    public AC(String name,int a_id) {
        this.name = name;
        this.a_id=a_id;
    }
}

