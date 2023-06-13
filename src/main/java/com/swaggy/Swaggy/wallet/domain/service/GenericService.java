package com.swaggy.Swaggy.wallet.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.swaggy.Swaggy.wallet.domain.AbstractModel;
import com.swaggy.Swaggy.wallet.domain.dto.AbstractDTO;
import com.swaggy.Swaggy.wallet.domain.exceptions.GenericValidationException;
import com.swaggy.Swaggy.wallet.domain.exceptions.ResourceNotFoundException;
import com.swaggy.Swaggy.wallet.domain.mapper.IMapper;
import com.swaggy.Swaggy.wallet.domain.repository.GenericRepository;

public class GenericService<Entity extends AbstractModel, DTO extends AbstractDTO> implements ICrudService<DTO> {

	@Autowired
	protected GenericRepository<Entity> repository;

	@Autowired
	protected IMapper<Entity, DTO> mapper;

	@Override
	public DTO create(DTO dto) {
		return mapper.toDTO(repository.save(mapper.toEntity(dto)));
	}

	@Override
	public DTO read(Long id) throws ResourceNotFoundException {
		if (id == null) {
			throw new GenericValidationException("Id should not be null");
		}
		Optional<Entity> resource = repository.findById(id);
		if (resource.isPresent()) {
			return mapper.toDTO(resource.get());
		}

		throw new ResourceNotFoundException("The specified Id is not present ");
	}

	@Override
	public DTO update(DTO dto) {
		if (dto == null) {
			throw new GenericValidationException("DTO must not be null!");
		}
		return mapper.toDTO(repository.save(mapper.toEntity(dto)));
	}

	@Override
	public void delete(DTO dto) {
		repository.delete(mapper.toEntity(dto));
	}

	@Override
	public List<DTO> findAll() {
		// TODO Auto-generated method stub
		return mapper.toDTO(repository.findAll());
	}

}
