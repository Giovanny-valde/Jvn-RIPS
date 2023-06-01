package com.facturas.app.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RecienNacidoDTO {
    private Long id;
    private String codPrestador;
    private String tipoDocumentoIdentificacion;
    private String numDocumentoIdentificacion;
    private LocalDateTime fechaNacimiento;
    private int edadGestacional;
    private int numConsultasCPrenatal;
    private String codSexoBiologico;
    private int peso;
    private String codDiagnosticoPrincipaI;
    private String condicionDestino;
    private String codDiagnosticoCausaMuerte;
    private LocalDateTime fechaEgreso;
    private int consecutivo;
}
