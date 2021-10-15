package com.example.tarjeta.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tarjeta.models.Tarjeta;

public interface ITarjetaRepository extends JpaRepository<Tarjeta,Long>{

}
