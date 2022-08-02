package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
