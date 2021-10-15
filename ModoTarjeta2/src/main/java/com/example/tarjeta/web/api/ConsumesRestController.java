package com.example.tarjeta.web.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tarjeta.mapping.Mapping;
import com.example.tarjeta.models.Cliente;
import com.example.tarjeta.models.Tarjeta;
import com.example.tarjeta.services.impl.ITarjetaConsumesImpl;


@RestController
@RequestMapping(Mapping.ACADEMIA)
public class ConsumesRestController {
	
	@Autowired
	private ITarjetaConsumesImpl tarjetaConsumes;
	
	/*@GetMapping
	public List<Tarjeta> getTarjetas(){
		return tarjetaConsumes.getTarjetas();
	}*/
	
	@GetMapping
	public List<Tarjeta> getFiltro(@Valid @RequestBody Cliente cliente){
		return tarjetaConsumes.getFiltro(cliente);
	}
}
