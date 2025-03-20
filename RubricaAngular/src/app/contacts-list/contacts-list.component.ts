import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Contact } from '../models/Contact';

@Component({
  selector: 'app-contacts-list',
  standalone: true,  
  imports: [CommonModule, FormsModule],  
  templateUrl: './contacts-list.component.html',
  styleUrls: ['./contacts-list.component.css']
})


export class ContactsListComponent {
  contacts: Contact[] = [];
  errorMessage: string = "";

  newContact: Contact = { name: '', phone: '', extra: '' };

  addContact() {
    if (this.newContact.name && this.newContact.phone) {
      this.errorMessage = "";
      this.contacts.push({ ...this.newContact });
      this.newContact = { name: '', phone: '', extra: '' }; // Reset form
    }
    else{
      this.errorMessage = "inserisci numero e telefono";
    }
  }

  removeContact(index: number) {
    this.contacts.splice(index, 1);
  }
}
