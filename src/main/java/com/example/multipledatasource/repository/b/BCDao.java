package com.example.multipledatasource.repository.b;

import com.example.multipledatasource.entity.b.BC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BCDao extends JpaRepository<BC,Integer> {

}
