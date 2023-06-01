package com.facturas.app.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OtrosServiciosDTO {
    private Long id;
    private String codPrestador;
    private String numAutorizacion;
    private String idMIPRES;
    private LocalDateTime fechaSuministroTecnologia;
    private String tipoOS;
    private String codTecnologiaSalud;
    private String nomTecnologiaSalud;
    private int cantidadOS;
    private String tipoDocumentoIdentificacion;
    private String numDocumentoIdentificacion;
    private BigDecimal vrUnitOS;
    private BigDecimal vrServicio;
    private String tipoPagoModerador;
    private int valorPagoModerador;
    private String numFEVPagoModerador;
    private int consecutivo;
}
