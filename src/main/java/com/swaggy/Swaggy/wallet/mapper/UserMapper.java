package com.swaggy.Swaggy.wallet.mapper;

import org.mapstruct.Mapper;

import com.swaggy.Swaggy.wallet.domain.mapper.IMapper;
import com.swaggy.Swaggy.wallet.dto.UserDTO;
import com.swaggy.Swaggy.wallet.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper extends IMapper<User, UserDTO> {

}
