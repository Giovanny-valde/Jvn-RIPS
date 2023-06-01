package com.facturas.app.dto;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class UsuarioDTO {
    private Long id;
    private String tipoDocumentoIdentificacion;
    private String numDocumentoIdentificacion;
    private String tipoUsuario;
    private LocalDateTime fechaNacimiento;
    private String codSexo;
    private String codPaisResidencia;
    private String codMunicipioResidencia;
    private String codZonaTerritorialResidencia;
    private String incapacidad;
    private int consecutivo;
}
