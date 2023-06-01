package com.facturas.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_documento_identificacion")
    private String tipoDocumentoIdentificacion;

    @Column(name = "num_documento_identificacion")
    private String numDocumentoIdentificacion;

    @Column(name = "tipo_usuario")
    private String tipoUsuario;

    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "cod_sexo")
    private String codSexo;

    @Column(name = "cod_pais_residencia")
    private String codPaisResidencia;

    @Column(name = "cod_municipio_residencia")
    private String codMunicipioResidencia;

    @Column(name = "cod_zona_territorial_residencia")
    private String codZonaTerritorialResidencia;

    @Column(name = "incapacidad")
    private String incapacidad;

    @Column(name = "consecutivo")
    private int consecutivo;

}
