package com.example.multipledatasource.repository.a;

import com.example.multipledatasource.entity.a.AC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ACDao extends JpaRepository<AC,Integer> {
    public List<AC> findByA_id(int a_id);
}
