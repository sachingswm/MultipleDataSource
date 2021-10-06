package com.example.multipledatasource.repository.b;

import com.example.multipledatasource.entity.b.BC;
import com.example.multipledatasource.entity.b.BD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BDDao extends JpaRepository<BD,Integer> {

}