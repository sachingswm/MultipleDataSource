package com.example.multipledatasource.entity.a;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="sameD",schema = "ADB")
public class AD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int a_id;

    public AD(String name,int a_id) {
        this.name = name;
        this.a_id=a_id;
    }
}
