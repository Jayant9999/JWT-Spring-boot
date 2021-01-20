package com.project.userQuery.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QueryDto {



  @Id
  @GeneratedValue
  int id;
  String  name;
  String contactPersonEmail;
  String subject;
  String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPersonEmail() {
        return contactPersonEmail;
    }

    public void setContactPersonEmail(String contactPersonEmail) {
        this.contactPersonEmail = contactPersonEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "QueryDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactPersonEmail='" + contactPersonEmail + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
