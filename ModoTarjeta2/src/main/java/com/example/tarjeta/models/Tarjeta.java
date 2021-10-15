package com.example.tarjeta.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TARJETAS")
public class Tarjeta{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TARJETA")
	private Long id_tarjeta;
	@Column(name="NOMBRE")
	private String nombre;
	/*@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IdEdad")
	private Edad edadObj;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="IdRango")
	private RangoCredito creditoObj;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="IdPasion")
	private Pasion pasionObj;*/
	@Column(name="ID_EDAD")
	private Long id_edad;
	@Column(name="ID_RANGO")
	private Long id_rango;
	@Column(name="ID_PASION")
	private Long id_pasion;
	
	
}
