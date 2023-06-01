package com.facturas.app.dto;

import com.facturas.app.dto.audit.AuditVariablesDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConsultaDTO extends AuditVariablesDTO {
    private Long id;
    private String codPrestador;
    private LocalDateTime fechaInicioAtencion;
    private String numAutoriacion;
    private String codConsulta;
    private String modalidadGrupoServicioTecSal;
    private String grupoServicios;
    private int codServicio;
    private String finalidadTecnologiaSalud;
    private String causaMotivoAtencion;
    private String codDiagnosticoPrincipal;
    private String codDiagnosticoRelacionado1;
    private String codDiagnosticoRelacionado2;
    private String codDiagnosticoRelacionado3;
    private String tipoDiagnosticoPrincipar;
    private String tipoDocumentoIdentificacion;
    private String numDocumentoIdentificacion;
    private int vrServicio;
    private String tipoPagoModerador;
    private int valorPagoModerador;
    private String numFEVPagoModerador;
    private int consecutivo;
}
