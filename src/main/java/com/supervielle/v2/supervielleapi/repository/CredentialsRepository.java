package com.supervielle.v2.supervielleapi.repository;

import java.util.UUID;

import com.supervielle.v2.supervielleapi.entity.Credentials;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository extends JpaRepository<Credentials, UUID> {
    
}