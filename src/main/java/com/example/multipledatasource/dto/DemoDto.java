package com.example.multipledatasource.dto;

import lombok.*;

public class DemoDto {
    private int id;
    private String name;

    public DemoDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DemoDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
