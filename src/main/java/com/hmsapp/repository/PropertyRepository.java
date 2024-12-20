package com.hmsapp.repository;

import com.hmsapp.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {

    //JPQL to search property based on city and country
    @Query("SELECT p FROM Property p join p.city c where c.name=:city")
    List<Property> searchProperty(
            @Param("city") String city
    );
}