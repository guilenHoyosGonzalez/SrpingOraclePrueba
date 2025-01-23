package com.example.SrpingOraclePrueba.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Departamento {
    @Id
    Integer idDepartamento;
    String departamento;
}
