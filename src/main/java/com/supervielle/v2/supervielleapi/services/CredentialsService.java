package com.supervielle.v2.supervielleapi.services;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import com.supervielle.v2.supervielleapi.entity.Credentials;
import com.supervielle.v2.supervielleapi.repository.CredentialsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredentialsService implements ICredentialsService{

    @Autowired
    CredentialsRepository _repository;
    
    @Override
    @Transactional
    public Credentials create(Credentials credential){

        return _repository.save(credential);
    };

    @Override
    @Transactional
    public Credentials update(Credentials credential){

        return credential;
    };

    @Override
    @Transactional
    public List<Credentials> getAll(){

        return _repository.findAll();
    };

    @Override
    @Transactional
    public void delete(UUID id){

        _repository.deleteById(id);
    };

    @Override
    @Transactional
    public void deleteAll(){

        _repository.deleteAll();
    }
    
}
