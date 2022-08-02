package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Ordenes;
import com.example.demo.domain.Producto;
import com.example.demo.domain.Sucursales;
import com.example.demo.repository.OrdenRepository;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.SucursalRepository;

@Service
public class OrdenServiceImpl implements OrdenService {
     
	@Autowired
	private OrdenRepository ordenRepository;
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private SucursalRepository sucursalRepository;
	
	@Override
	public void createProduct(Producto p) {
		productoRepository.save(p);

	}

	@Override
	public void createSucursal(Sucursales s) {
		sucursalRepository.save(s);

	}

	@Override
	public void createOrden(Ordenes o) {
		ordenRepository.save(o);

	}

	@Override
	public List<Ordenes> getOrdenes() {
		// TODO Auto-generated method stub
		return ordenRepository.findAll();
	}

}
