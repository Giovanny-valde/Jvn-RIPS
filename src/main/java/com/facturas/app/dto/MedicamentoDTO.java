package com.facturas.app.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class MedicamentoDTO {
    private Long id;
    private String codPrestador;
    private String numAutorizacion;
    private String idMIPRES;
    private LocalDateTime fechaDispensAdmon;
    private String codDiagnosticoPrincipal;
    private String codDiagnosticoRelacionado;
    private String tipoMedicamento;
    private String codTecnologiaSalud;
    private String nomTecnologiaSalud;
    private BigDecimal concentracionMedicamento;
    private BigDecimal unidadMedida;
    private String formaFarmaceutica;
    private int unidadMinDispensa;
    private int cantidadMedicamento;
    private int diasTratamiento;
    private String tipoDocumentoIdentificacion;
    private String numDocumentoIdentificacion;
    private BigDecimal vrUnitMedicamento;
    private BigDecimal vrServicio;
    private String tipoPagoModerador;
    private int valorPagoModerador;
    private String numFEVPagoModerador;
    private int consecutivo;
}
