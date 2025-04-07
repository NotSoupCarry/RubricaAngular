package com.example.backendrubrica.controllers;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.backendrubrica.models.Contact;
import com.example.backendrubrica.services.ContactService;

@RestController
@RequestMapping("/api/contatti")
@CrossOrigin("http://localhost:3000")
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping
    public void addContact(Contact contact) {
        contactService.addContact(contact);
    }

    @DeleteMapping("{id}")
    public void deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
    }

}
