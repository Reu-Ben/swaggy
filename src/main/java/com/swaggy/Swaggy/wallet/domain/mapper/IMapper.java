package com.swaggy.Swaggy.wallet.domain.mapper;

import java.util.List;

import com.swaggy.Swaggy.wallet.domain.AbstractModel;
import com.swaggy.Swaggy.wallet.domain.dto.AbstractDTO;

public interface IMapper<Entity extends AbstractModel, DTO extends AbstractDTO> {

	public DTO toDTO(Entity entity);

	public Entity toEntity(DTO dto);

	public List<Entity> toEntity(List<DTO> dto);

	public List<DTO> toDTO(List<Entity> entity);

}
