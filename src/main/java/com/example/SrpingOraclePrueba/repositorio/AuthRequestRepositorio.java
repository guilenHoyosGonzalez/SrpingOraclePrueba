package com.example.SrpingOraclePrueba.repositorio;

import com.example.SrpingOraclePrueba.modelo.AuthRequest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRequestRepositorio extends
        JpaRepository<AuthRequest, Integer> {
}
