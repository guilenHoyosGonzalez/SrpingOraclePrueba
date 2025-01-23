package com.example.SrpingOraclePrueba.controlador;

import com.example.SrpingOraclePrueba.exception.Exeception;
import com.example.SrpingOraclePrueba.modelo.Municipio;
import com.example.SrpingOraclePrueba.servicio.ServicioMunicipio;
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
public class MunicipioController {
    private static final Logger logger
            =   LoggerFactory.getLogger(MunicipioController.class);

    @Autowired
    private ServicioMunicipio servicioMunicipio;

    @GetMapping("/municipio")
    public List<Municipio> cargarMunicipio(){
        return servicioMunicipio.listarMunicipio();
    }

    @PostMapping("/municipio/agregarMunicipio")
    public Municipio registrarMunicipio(@RequestBody Municipio municipioData){
        logger.info("Registro a crear: "+ municipioData);
        return this.servicioMunicipio.registraMunicipio(municipioData);
    }

    @GetMapping("/municipio/{id}")
    public ResponseEntity<Municipio> consultarMunicipioPorId(
            @PathVariable Integer id){
        Municipio municipio = this.servicioMunicipio.buscarMunicipioPorId(id);
        if(municipio == null)
            throw  new Exeception("Municipio no encontrado: "+ id);
        return ResponseEntity.ok(municipio);
    }

    @DeleteMapping("/municipio/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarDepartamento(
            @PathVariable int id
    ){
        Municipio municipio = this.servicioMunicipio.buscarMunicipioPorId(id);
        this.servicioMunicipio.eliminarMunicipio(municipio);
        Map<String, Boolean> respuesta =  new HashMap<>();
        respuesta.put("Registro Eliminado",true);
        return ResponseEntity.ok(respuesta);
    }

}
