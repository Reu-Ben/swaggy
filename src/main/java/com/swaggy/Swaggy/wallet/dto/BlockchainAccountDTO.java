package com.swaggy.Swaggy.wallet.dto;

import com.swaggy.Swaggy.wallet.domain.dto.AbstractDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BlockchainAccountDTO extends AbstractDTO {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String uId;

	private String walletType;

}
