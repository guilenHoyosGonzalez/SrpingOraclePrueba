package com.example.SrpingOraclePrueba.servicio;


import com.example.SrpingOraclePrueba.modelo.Municipio;

import java.util.List;

public interface IServicioMunicipio {
    public List<Municipio> listarMunicipio();

    public Municipio buscarMunicipioPorId(Integer idMunicipio);

    public Municipio registraMunicipio(Municipio municipio);

    public void eliminarMunicipio(Municipio municipio);
}
