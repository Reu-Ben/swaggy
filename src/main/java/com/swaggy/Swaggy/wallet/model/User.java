package com.swaggy.Swaggy.wallet.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.swaggy.Swaggy.wallet.domain.AbstractModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class User extends AbstractModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nickname;

	private String email;

	private String password;

	private String address;

	private String name;

	private String surname;

	private String dob;

	@OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private BlockchainAccount account;
}
