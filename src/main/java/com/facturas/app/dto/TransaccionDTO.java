package com.facturas.app.dto;


import lombok.Data;

@Data
public class TransaccionDTO {
    private Long id;
    private String numDocumentoObligado;
    private String numFactura;
    private String tipoNota;
    private int numNota;
}
