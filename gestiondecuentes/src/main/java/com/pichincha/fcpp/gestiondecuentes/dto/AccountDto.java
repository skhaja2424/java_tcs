package com.pichincha.fcpp.gestiondecuentes.dto;



import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pichincha.fcpp.gestiondecuentes.entity.AccountEntity;
import com.pichincha.fcpp.gestiondecuentes.entity.MovementsEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class AccountDto {
	
	private Integer _accountId;

	private String _accountNumber;

	private String _accountType;

	private String _accountBank;
	
	private List<MovementsEntity> _allMovementsWhereSource;

	public Integer get_accountId() {
		return _accountId;
	}

	public void set_accountId(Integer _accountId) {
		this._accountId = _accountId;
	}

	public String get_accountNumber() {
		return _accountNumber;
	}

	public void set_accountNumber(String _accountNumber) {
		this._accountNumber = _accountNumber;
	}

	public String get_accountType() {
		return _accountType;
	}

	public void set_accountType(String _accountType) {
		this._accountType = _accountType;
	}

	public String get_accountBank() {
		return _accountBank;
	}

	public void set_accountBank(String _accountBank) {
		this._accountBank = _accountBank;
	}

	public List<MovementsEntity> get_allMovementsWhereSource() {
		return _allMovementsWhereSource;
	}

	public void set_allMovementsWhereSource(List<MovementsEntity> _allMovementsWhereSource) {
		this._allMovementsWhereSource = _allMovementsWhereSource;
	}

	public List<MovementsEntity> get_allMovementsWhereDestination() {
		return _allMovementsWhereDestination;
	}

	public void set_allMovementsWhereDestination(List<MovementsEntity> _allMovementsWhereDestination) {
		this._allMovementsWhereDestination = _allMovementsWhereDestination;
	}

	private List<MovementsEntity> _allMovementsWhereDestination;
	
	

}
