package com.facturas.app.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "transaccion")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "num_documento_obligado")
    private String numDocumentoObligado;

    @Column(name = "num_factura")
    private String numFactura;

    @Column(name = "tipo_nota")
    private String tipoNota;

    @Column(name = "num_nota")
    private int numNota;
}
