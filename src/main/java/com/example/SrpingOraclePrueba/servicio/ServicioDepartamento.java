package com.example.SrpingOraclePrueba.servicio;

import com.example.SrpingOraclePrueba.modelo.Departamento;
import com.example.SrpingOraclePrueba.repositorio.DepartamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDepartamento implements IServicioDepartamento {

    @Autowired
    private DepartamentoRepositorio departamentoRepositorio;

    @Override
    public List<Departamento> listarDepartamento() {
        return this.departamentoRepositorio.findAll();
    }

    @Override
    public Departamento buscarDepartamentoPorId(Integer idDepartamento) {
        return this.departamentoRepositorio.findById(idDepartamento).orElse(null);
    }

    @Override
    public Departamento registraDepartamento(Departamento departamento) {
        return this.departamentoRepositorio.save(departamento);
    }

    @Override
    public void eliminarDepartamento(Departamento departamento) {
        this.departamentoRepositorio.delete(departamento);
    }
}