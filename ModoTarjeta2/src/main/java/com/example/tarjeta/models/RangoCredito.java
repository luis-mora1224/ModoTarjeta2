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
@Table(name="RANGOCREDITOS")
public class RangoCredito{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RANGO")
	private Long idRango;
	@Column(name="RANGO_MINIMO")
	private double rangoMinimo;
	@Column(name="RANGO_MAXIMO")
	private double rangoMaximo;
}
