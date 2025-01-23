package com.example.SrpingOraclePrueba.servicio;

import com.example.SrpingOraclePrueba.modelo.Departamento;

import java.util.List;

public interface IServicioDepartamento {
    public List<Departamento> listarDepartamento();

    public Departamento buscarDepartamentoPorId(Integer idDepartamento);

    public Departamento registraDepartamento(Departamento empleado);

    public void eliminarDepartamento(Departamento departamento);

}
