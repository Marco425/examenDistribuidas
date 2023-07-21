package com.alcantara.infraccionservice.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.alcantara.infraccionservice.entity.Infraccion;


public interface InfraccionService {
	public List<Infraccion> findAll(Pageable page);
	public List<Infraccion> findByDni(String dni, Pageable page);
	public Infraccion findByDni(String dni);
	public Infraccion findById(int id);
	public Infraccion save(Infraccion infraccion);
	public Infraccion update (Infraccion infraccion);
	public void delete(int id);
	public Infraccion anulate (int id);
}
