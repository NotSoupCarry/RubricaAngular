package com.example.backendrubrica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendrubrica.models.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long>  {
    
}
