package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Sucursales;

public interface SucursalRepository extends JpaRepository<Sucursales, Long> {

}
