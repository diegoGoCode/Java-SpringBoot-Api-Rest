package com.diegogocode.springboot.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegogocode.springboot.backend.apirest.entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

	
}
