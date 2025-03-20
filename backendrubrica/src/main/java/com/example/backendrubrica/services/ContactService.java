package com.example.backendrubrica.services;

import org.springframework.stereotype.Service;

import com.example.backendrubrica.models.Contact;
import com.example.backendrubrica.repositories.ContactRepository;

import java.util.List;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository contactRepository;

    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    @Transactional
    public void addContact(Contact contact){
        contactRepository.save(contact);
    }

    @Transactional
    public void deleteContact(Long id){
        contactRepository.deleteById(id);
    }
}
