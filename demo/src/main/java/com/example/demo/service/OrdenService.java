package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Ordenes;
import com.example.demo.domain.Producto;
import com.example.demo.domain.Sucursales;

public interface OrdenService {

	
	public void createProduct(Producto p);
	public void createSucursal(Sucursales s);
	public void createOrden(Ordenes  o);
	
	public List<Ordenes> getOrdenes();
}
