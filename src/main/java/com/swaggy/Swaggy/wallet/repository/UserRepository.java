package com.swaggy.Swaggy.wallet.repository;

import org.springframework.stereotype.Repository;

import com.swaggy.Swaggy.wallet.domain.repository.GenericRepository;
import com.swaggy.Swaggy.wallet.model.User;

@Repository
public interface UserRepository extends GenericRepository<User> {

}
