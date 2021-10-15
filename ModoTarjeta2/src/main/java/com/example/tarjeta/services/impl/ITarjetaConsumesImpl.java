package com.example.tarjeta.services.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tarjeta.models.Cliente;
import com.example.tarjeta.models.Tarjeta;
import com.example.tarjeta.services.ITarjetaConsumes;
import com.example.tarjeta.services.ITarjetaRepository;

@Service
public class ITarjetaConsumesImpl implements ITarjetaConsumes{
    
	@Autowired
	private ITarjetaRepository tarjetaRepository;
	
	@PersistenceContext
	private EntityManager em;

	@Override	
	public List<Tarjeta> getTarjetas() {
		return (List<Tarjeta>) tarjetaRepository.findAll();
	}


	@Override
	public List<Tarjeta> getFiltro(Cliente cliente) {
		 /*jpaStreamer.stream(of(Tarjeta.class)
                .joining(Tarjeta$.Edad)
                .joining(Tarjeta$.Pasion)
                .joining(Tarjeta$.RangoCredito))
                .filter(tarjeta -> Tarjeta.getId().equals(id))
                .findFirst()
                .orElseThrow();*/
		Query con = em.createNativeQuery("SELECT T.Nombre AS \"TARJETA SUJERIDA\",  \n"
				+ "FROM TARJETAS T, EDADES E, RANGOCREDITOS R,\n"
				+ "         PASIONES P\n"
				+ "WHERE E.ID_EDAD= T.ID_EDAD\n"
				+ "AND   R.ID_RANGO=T.ID_RANGO\n"
				+ "AND   P.ID_PASION=T.ID_PASION\n"
				+ "AND   P.NOMBRE= '"+cliente.getPreferencias()+"'\n"
				+ "AND   "+cliente.getSalario()+" BETWEEN R.RANGO_MINIMO AND R.RANGO_MAXIMO\n"
				+ "AND   "+cliente.getEdad()+" BETWEEN E.EDAD_MINIMA AND E.EDAD_MAXIMA");
		
		List<Tarjeta> list = con.getResultList();
 
		return list;
	}

}
