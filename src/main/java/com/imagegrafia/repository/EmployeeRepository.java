package com.imagegrafia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.imagegrafia.entity.Employee;

@Repository
public interface EmployeeRepository extends org.springframework.data.repository.Repository<Employee, Integer> {
	
	/**
	 * by default nativeQuery=false
	 * so select * gives exception
	 * @param id
	 * @return
	 */
	@Query(value="SELECT * FROM Employee t where t.id = :id",nativeQuery = true) 
    Optional<Employee> findAllById(@Param("id") Integer id);
	
	@Query("SELECT t.id FROM Employee t where t.name = :name") 
    Optional<Employee> findIdByName(@Param("name") String name);
}
