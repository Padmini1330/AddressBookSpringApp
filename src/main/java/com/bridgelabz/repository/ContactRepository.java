package com.bridgelabz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.ContactData;

@Repository
public interface ContactRepository extends JpaRepository<ContactData, Integer>
{
	@Query(value = "select * from contact where city=:city", nativeQuery = true)
	List<ContactData> findContactByCity(String city);
	
	@Query(value = "select * from contact where state=:state", nativeQuery = true)
	List<ContactData> findContactByState(String state);
	
	@Query(value = "select * from contact where zip_code=:zipCode", nativeQuery = true)
	List<ContactData> findContactByZipCode(String zipCode);
}