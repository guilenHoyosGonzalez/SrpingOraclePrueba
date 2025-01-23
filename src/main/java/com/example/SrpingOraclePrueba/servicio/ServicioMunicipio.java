package com.example.SrpingOraclePrueba.servicio;

import com.example.SrpingOraclePrueba.modelo.Municipio;
import com.example.SrpingOraclePrueba.repositorio.MunicipioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMunicipio implements IServicioMunicipio{

    @Autowired
    private MunicipioRepositorio municipioRepositorio;

    @Override
    public List<Municipio> listarMunicipio() {
        return this.municipioRepositorio.findAll();
    }

    @Override
    public Municipio buscarMunicipioPorId(Integer idMunicipio) {
        return this.municipioRepositorio.findById(idMunicipio).orElse(null);
    }

    @Override
    public Municipio registraMunicipio(Municipio municipio) {
        return this.municipioRepositorio.save(municipio);
    }

    @Override
    public void eliminarMunicipio(Municipio municipio) {
        this.municipioRepositorio.delete(municipio);
    }
}
