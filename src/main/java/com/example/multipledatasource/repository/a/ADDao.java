package com.example.multipledatasource.repository.a;

import com.example.multipledatasource.entity.a.AC;
import com.example.multipledatasource.entity.a.AD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ADDao extends JpaRepository<AD,Integer> {
    @Query(value = "select * from ADB.sameD where ADB.sameD.a_id=?1",nativeQuery = true)
    public List<AD> getAllByA_id(int a_id);
}