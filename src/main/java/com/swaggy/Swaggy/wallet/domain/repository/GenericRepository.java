package com.swaggy.Swaggy.wallet.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import com.swaggy.Swaggy.wallet.domain.AbstractModel;

@NoRepositoryBean
@Transactional
public interface GenericRepository<Entity extends AbstractModel> extends JpaRepository<Entity, Long> {

}
