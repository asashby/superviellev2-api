package com.supervielle.v2.supervielleapi.controller;

import java.util.List;
import java.util.UUID;

import com.supervielle.v2.supervielleapi.entity.Credentials;
import com.supervielle.v2.supervielleapi.services.CredentialsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credentials")
public class CredentialsController {

    @Autowired
    private CredentialsService _service;

    @GetMapping("")
    public List<Credentials> getAllCredentials(){

        return _service.getAll();
    }

    @PostMapping("")
    public Credentials createCredentials(@RequestBody Credentials credential){

        return _service.create(credential);
    }

    @DeleteMapping("{id}")
    public void deleteCredentials(@PathVariable("id") String id){

        _service.delete(UUID.fromString(id));
    }

    @DeleteMapping("")
    public void deleteAllCredentials(){

        _service.deleteAll();
    }
}
