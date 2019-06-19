package com.magesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magesh.common.aspect.MonitorTime;

@RestController
public class ContactController {
    @Autowired
    private ContactDAO contactDAO;
    @RequestMapping(value = "contactList")
    @MonitorTime
    public java.util.List<Contact> contactList() {
        return contactDAO.findAll();
    }
}
