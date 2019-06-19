package com.magesh;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ContactDAO extends CrudRepository<Contact,Integer> {
    List<Contact> findAll();                           // fetch all Contacts
}