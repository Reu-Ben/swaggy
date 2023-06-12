package com.swaggy.Swaggy.wallet.service;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;

import com.swaggy.Swaggy.wallet.domain.service.GenericService;
import com.swaggy.Swaggy.wallet.dto.BlockchainAccountDTO;
import com.swaggy.Swaggy.wallet.model.BlockchainAccount;

@Service
public class BlockchainAccountService extends GenericService<BlockchainAccount, BlockchainAccountDTO> {

	public String generateUid() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		return "";
	}

	public BlockchainAccountDTO createAccount(String walletType) {
		BlockchainAccountDTO account = new BlockchainAccountDTO();
		account.setUId("93450ti43'jff9349");
		account.setWalletType(walletType);
		return super.create(account);
	}

}
