package com.example.SrpingOraclePrueba.servicio;

import com.example.SrpingOraclePrueba.modelo.AuthRequest;
import com.example.SrpingOraclePrueba.repositorio.AuthRequestRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServicio implements IAuthServicio{

    @Autowired
    private AuthRequestRepositorio authRequestRepositorio;

    @Override
    public List<AuthRequest> listarUsuarios() {
        return this.authRequestRepositorio.findAll();
    }

    @Override
    public AuthRequest buscarAuthPorId(Integer id) {
        return this.authRequestRepositorio.findById(id).orElse(null);
    }

    @Override
    public AuthRequest registraAuth(AuthRequest auth) {
        return this.authRequestRepositorio.save(auth);
    }

    @Override
    public void eliminarAuth(AuthRequest auth) {
        this.authRequestRepositorio.delete(auth);
    }

}
