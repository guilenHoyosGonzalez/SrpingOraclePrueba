package com.example.SrpingOraclePrueba.controlador;

import com.example.SrpingOraclePrueba.exception.Exeception;
import com.example.SrpingOraclePrueba.modelo.Departamento;
import com.example.SrpingOraclePrueba.servicio.ServicioDepartamento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:3000")
public class DepartamentoController {
   private static final Logger logger
           =   LoggerFactory.getLogger(DepartamentoController.class);

    @Autowired
    private ServicioDepartamento servicioDepartamento;


    @GetMapping("/departamentos")
    public List<Departamento> cargarDepartamento(){
        return servicioDepartamento.listarDepartamento();
    }

    @PostMapping("/departamento/agregarDepartamento")
    public Departamento registrarDepartamento(@RequestBody Departamento departamentoData){
       logger.info("Registro a crear: "+ departamentoData);
        return this.servicioDepartamento.registraDepartamento(departamentoData);
    }

    @GetMapping("/departamento/{id}")
    public ResponseEntity<Departamento> consultarDepartamentoPorId(
            @PathVariable Integer id){
        Departamento departamento = this.servicioDepartamento.buscarDepartamentoPorId(id);
        if(departamento == null)
            throw  new Exeception("Departamento no encontrado: "+ id);
        return ResponseEntity.ok(departamento);
    }

    @DeleteMapping("/departamento/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarDepartamento(
               @PathVariable int id
    ){
        Departamento departamento = this.servicioDepartamento.buscarDepartamentoPorId(id);
        this.servicioDepartamento.eliminarDepartamento(departamento);
        Map<String, Boolean> respuesta =  new HashMap<>();
        respuesta.put("Registro Eliminado",true);
        return ResponseEntity.ok(respuesta);
    }

}
