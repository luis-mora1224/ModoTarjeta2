package com.example.tarjeta.services;

import java.util.List;

import com.example.tarjeta.models.Cliente;
import com.example.tarjeta.models.Tarjeta;

public interface ITarjetaConsumes {
	
	public List<Tarjeta> getTarjetas();
	public List<Tarjeta> getFiltro(Cliente cliente);
	
}
