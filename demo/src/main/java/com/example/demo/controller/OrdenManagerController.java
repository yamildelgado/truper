package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Ordenes;
import com.example.demo.domain.Producto;
import com.example.demo.domain.Sucursales;
import com.example.demo.service.OrdenService;


@RestController
public class OrdenManagerController  {
	
	@Autowired
	private OrdenService ordenService;

	@PostMapping("/createProduct/{ordenId}")
	public void createProduct(@PathVariable (name = "ordenId") Long ordenId,@RequestBody Producto p) {
	
		Ordenes o=new Ordenes();
		o.setOrdenId(ordenId);
		List<Ordenes> ordenes=new ArrayList<Ordenes>();
		ordenes.add(o);
		p.setOrdenId(ordenes); 
		ordenService.createProduct(p);

	}
	
	@PutMapping("/updateProduct")
	public void updateeProduct(@RequestBody Producto p) {
		  ordenService.createProduct(p);

	}


	@PostMapping("/createSucursal")
	public void createSucursal(@RequestBody Sucursales s) {
		
		  ordenService.createSucursal(s);

	}
	
	

	@PostMapping("/createOrden/{sucursalId}")
	public void createOrden(@PathVariable (name = "sucursalId") Long sucursalId,@RequestBody Ordenes o) {
		Sucursales su=new Sucursales();
		su.setSucursaleId(sucursalId);
		o.setSucursal(su);
		ordenService.createOrden(o);

	}
	@GetMapping("/getOrdenList")
	public List<Ordenes> getOrden() {
		return ordenService.getOrdenes();
	}

}
