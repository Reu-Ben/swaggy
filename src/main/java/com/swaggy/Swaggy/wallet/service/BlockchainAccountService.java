package com.swaggy.Swaggy.wallet.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swaggy.Swaggy.wallet.domain.service.GenericService;
import com.swaggy.Swaggy.wallet.dto.BlockchainAccountDTO;
import com.swaggy.Swaggy.wallet.model.BlockchainAccount;
import com.swaggy.Swaggy.wallet.repository.BlockchainAccountRepository;
import com.swaggy.Swaggy.wallet.utils.BitcoinAdressGenerator;

@Service
public class BlockchainAccountService extends GenericService<BlockchainAccount, BlockchainAccountDTO> {

	@Autowired
	private BitcoinAdressGenerator addressGenerator;

	public BlockchainAccountDTO createAccount(String walletType) {
		BlockchainAccountDTO dto = new BlockchainAccountDTO();
		String details[] = addressGenerator.createNewAddress();
		while (_isAddressPresent(details[2])) {
			details = addressGenerator.createNewAddress();
		}
		dto.setPublicKey(details[0]);
		dto.setPrivateKey(details[1]);
		dto.setWalletAddress(details[2]);
		dto.setWalletType(walletType);
		return super.create(dto);
	}

	private Boolean _isAddressPresent(String address) {
		Optional<BlockchainAccount> resource = ((BlockchainAccountRepository) repository).findByWalletAddress(address);
		return resource.isPresent();
	}

}
