package com.mycompany.mywebapp.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer> {

}
