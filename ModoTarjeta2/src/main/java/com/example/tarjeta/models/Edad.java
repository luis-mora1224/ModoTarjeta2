package com.example.tarjeta.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EDADES")
public class Edad{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_EDAD")
	private Long idEdad;
	@Column(name="EDAD_MINIMA")
	private int edadMinima;
	@Column(name="EDAD_MAXIMA")
	private int edadMaxima;
}
