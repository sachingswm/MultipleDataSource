package com.example.multipledatasource.repository.a;

import com.example.multipledatasource.entity.a.A;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ADao extends JpaRepository<A,Integer> {

    @Query(value = "select ADB.same.id,ADB.same.name,BDB.same.id,BDB.same.name from ADB.same,BDB.same where ABD.same.name=?",nativeQuery = true)
    public void getAllByName(String name);

}
