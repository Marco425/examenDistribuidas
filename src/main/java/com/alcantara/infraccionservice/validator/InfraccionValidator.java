package com.alcantara.infraccionservice.validator;

import com.alcantara.infraccionservice.entity.Infraccion;
import com.alcantara.infraccionservice.exceptions.ValidateServiceException;

public class InfraccionValidator {
	public static void save(Infraccion infraccion) {
		
		if(infraccion.getDni()==null || infraccion.getDni().isEmpty()) {
			throw new ValidateServiceException("El Dni es requerido");
		}
		if(infraccion.getDni().length()>8) {
			throw new ValidateServiceException("El Dni no puede superar los 8 caracteres");
		}
		if(infraccion.getFalta()==null) {
			throw new ValidateServiceException("La falta es requerida");
		}
		if(infraccion.getFecha()==null) {
			throw new ValidateServiceException("La fecha es requerida");
		}
		if(infraccion.getInfraccion()==null) {
			throw new ValidateServiceException("La Infraccion es requerida");
		}
	}
}
