package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.ContactData;

@Repository
public interface ContactRepository extends JpaRepository<ContactData, Integer>
{

}