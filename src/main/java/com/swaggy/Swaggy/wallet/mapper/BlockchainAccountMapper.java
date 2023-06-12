package com.swaggy.Swaggy.wallet.mapper;

import org.mapstruct.Mapper;

import com.swaggy.Swaggy.wallet.domain.mapper.IMapper;
import com.swaggy.Swaggy.wallet.dto.BlockchainAccountDTO;
import com.swaggy.Swaggy.wallet.model.BlockchainAccount;

@Mapper(componentModel = "spring")
public interface BlockchainAccountMapper extends IMapper<BlockchainAccount, BlockchainAccountDTO> {

}
