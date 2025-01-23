package com.example.SrpingOraclePrueba.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Municipio {
    @Id
    Integer idMunicipio;
    String  municipio;
}
