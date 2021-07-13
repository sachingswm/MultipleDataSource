package com.example.multipledatasource.repository.a;

import com.example.multipledatasource.dto.DemoDto;
import com.example.multipledatasource.entity.a.A;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ADao extends JpaRepository<A,Integer> {


    @Query(value = "select ADB.same.* from ADB.same  where ADB.same.name=:name UNION ALL select BDB.same.* from BDB.same  where BDB.same.name=:name",nativeQuery = true)
    public List<A> getAllByName(String name);
}
