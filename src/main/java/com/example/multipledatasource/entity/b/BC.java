package com.example.multipledatasource.entity.b;


import com.example.multipledatasource.entity.a.AC;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="sameC",schema = "ADB")
public class BC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int b_id;

    public BC(String name,int b_id) {
        this.name = name;
        this.b_id=b_id;
    }

    public BC(AC ac)
    {
        this(ac.getName(), ac.getA_id());
    }
}
