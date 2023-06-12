package com.swaggy.Swaggy.wallet.repository;

import org.springframework.stereotype.Repository;

import com.swaggy.Swaggy.wallet.domain.repository.GenericRepository;
import com.swaggy.Swaggy.wallet.model.BlockchainAccount;

@Repository
public interface BlockchainAccountRepository extends GenericRepository<BlockchainAccount> {

}
