package com.example.tarjeta.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Cliente {
	
	
	@NotNull(message="La Preferencia es requerida")
	@Size(min=2, max=15, message="La preferencia de tener entre {min} y {max} caracteres")
	private String preferencias;
	@NotNull(message="El salario debe ser incluido")
	private double salario;
	@NotNull(message="La edad es requerida")
	private int edad;
}
