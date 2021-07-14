package com.example.multipledatasource.repository.a;

import com.example.multipledatasource.dto.DemoDto;
import com.example.multipledatasource.entity.a.A;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface ADao extends JpaRepository<A,Integer> {
    @Query(value = "select a.id as id ,a.name as name from ADB.same a where a.name=:name UNION ALL select b.id as id ,b.name as name from BDB.same b where b.name=:name",nativeQuery = true)
    public List<DemoDto> getAllByName(String name);

}
