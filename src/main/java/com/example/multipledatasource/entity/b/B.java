package com.example.multipledatasource.entity.b;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="same",schema = "BDB")
@Data
public class B {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public B(String name) {
        this.name = name;
    }
}
