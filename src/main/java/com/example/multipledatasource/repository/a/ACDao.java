package com.example.multipledatasource.repository.a;

import com.example.multipledatasource.entity.a.AC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ACDao extends JpaRepository<AC,Integer> {
    @Query(value = "select * from ADB.sameC where ADB.sameC.a_id=?1",nativeQuery = true)
    public List<AC> getAllByA_id(int a_id);
}
