package com.pichincha.fcpp.gestiondecuentes.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pichincha.fcpp.gestiondecuentes.dto.MovementsDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TBL_MOVIMIENTOS")

public class MovementsEntity {

	public Integer getMovementId() {
		return movementId;
	}

	public void setMovementId(Integer movementId) {
		this.movementId = movementId;
	}

	public AccountEntity getSourceAccountDetalles() {
		return sourceAccountDetalles;
	}

	public void setSourceAccountDetalles(AccountEntity sourceAccountDetalles) {
		this.sourceAccountDetalles = sourceAccountDetalles;
	}

	public AccountEntity getDestinationAccountDetalles() {
		return destinationAccountDetalles;
	}

	public void setDestinationAccountDetalles(AccountEntity destinationAccountDetalles) {
		this.destinationAccountDetalles = destinationAccountDetalles;
	}

	public String getMovementDescription() {
		return movementDescription;
	}

	public void setMovementDescription(String movementDescription) {
		this.movementDescription = movementDescription;
	}

	public Double getMovementAmount() {
		return movementAmount;
	}

	public void setMovementAmount(Double movementAmount) {
		this.movementAmount = movementAmount;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MOVEMENT_ID")
	private Integer movementId;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "SOURCE_ACCOUNT", nullable = false)
	private AccountEntity sourceAccountDetalles;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "DESTINATION_ACCOUNT", nullable = false)
	private AccountEntity destinationAccountDetalles;
	
	@Column(name = "MOVEMENT_DESCRIPTION")
	private String movementDescription;

	@Column(name = "MOVEMENT_AMOUNT")
	private Double movementAmount;
	
	


}
