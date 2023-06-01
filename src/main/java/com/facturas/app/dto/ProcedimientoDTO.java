package com.facturas.app.dto;


import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ProcedimientoDTO {
    private Long id;
    private String codPrestador;
    private LocalDateTime fechaInicioAtencion;
    private String idMIPRES;
    private String numAutoriacion;
    private String codProcedimiento;
    private String viaIngresoServicioSalud;
    private String modalidadGrupoServicioTecSal;
    private String grupoServicios;
    private int codServicio;
    private String finalidadTecnologiaSalud;
    private String tipoDocumentoIdentificacion;
    private String numDocumentoIdentificacion;
    private String codDiagnosticoPrincipal;
    private String codDiagnosticoRelacionado;
    private String codComplicacion;
    private int vrServicio;
    private String tipoPagoModerador;
    private int valorPagoModerador;
    private String numFEVPagoModerador;
    private int consecutivo;
}
