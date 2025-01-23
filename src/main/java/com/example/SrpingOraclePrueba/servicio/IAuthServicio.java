package com.example.SrpingOraclePrueba.servicio;

import com.example.SrpingOraclePrueba.modelo.AuthRequest;

import java.util.List;

public interface IAuthServicio {

    public List<AuthRequest> listarUsuarios();

    public AuthRequest buscarAuthPorId(Integer id);

    public AuthRequest registraAuth(AuthRequest auth);

    public void eliminarAuth(AuthRequest auth);
}
