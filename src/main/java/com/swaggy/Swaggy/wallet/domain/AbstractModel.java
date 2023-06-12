package com.swaggy.Swaggy.wallet.domain;

import java.io.Serializable;

import org.springframework.data.domain.Persistable;

public abstract class AbstractModel implements Serializable, Persistable<Long> {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return getId() == null;
	}
}
