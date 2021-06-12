package com.supervielle.v2.supervielleapi.services;

import java.util.List;
import java.util.UUID;

import com.supervielle.v2.supervielleapi.entity.Credentials;

public interface ICredentialsService {
    
    Credentials create(Credentials credential);

    Credentials update(Credentials credential);

    List<Credentials> getAll();

    void delete(UUID id);

    void deleteAll();
}
