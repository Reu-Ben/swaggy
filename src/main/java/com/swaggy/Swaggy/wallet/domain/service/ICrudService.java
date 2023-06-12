package com.swaggy.Swaggy.wallet.domain.service;

import java.util.List;

import com.swaggy.Swaggy.wallet.domain.dto.AbstractDTO;
import com.swaggy.Swaggy.wallet.domain.exceptions.ResourceNotFoundException;

public interface ICrudService<DTO extends AbstractDTO> {

	public DTO create(DTO dto);

	public DTO read(Long id) throws ResourceNotFoundException;

	public DTO update(DTO dto);

	public void delete(DTO dto);

	public List<DTO> findAll();
}
