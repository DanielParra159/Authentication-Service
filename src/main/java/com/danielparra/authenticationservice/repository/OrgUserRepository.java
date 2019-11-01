package com.danielparra.authenticationservice.repository;

import com.danielparra.authenticationservice.model.UserOrganization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgUserRepository extends CrudRepository<UserOrganization,String>  {
    UserOrganization findByUserName(String userName);
}