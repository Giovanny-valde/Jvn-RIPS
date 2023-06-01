package com.facturas.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "otrosServicios")
public class OtrosServicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cod_prestador")
    private String codPrestador;

    @Column(name = "num_autorizacion")
    private String numAutorizacion;

    @Column(name = "id_mipres")
    private String idMIPRES;

    @Column(name = "fecha_suministro_tecnologia")
    private LocalDateTime fechaSuministroTecnologia;

    @Column(name = "tipo_os")
    private String tipoOS;

    @Column(name = "cod_tecnologia_salud")
    private String codTecnologiaSalud;

    @Column(name = "nom_tecnologia_salud")
    private String nomTecnologiaSalud;

    @Column(name = "cantidad_os")
    private int cantidadOS;

    @Column(name = "tipo_documento_identificacion")
    private String tipoDocumentoIdentificacion;

    @Column(name = "num_documento_identificacion")
    private String numDocumentoIdentificacion;

    @Column(name = "vr_unit_os")
    private BigDecimal vrUnitOS;

    @Column(name = "vr_servicio")
    private BigDecimal vrServicio;

    @Column(name = "tipo_pago_moderador")
    private String tipoPagoModerador;

    @Column(name = "valor_pago_moderador")
    private int valorPagoModerador;

    @Column(name = "num_fev_pago_moderador")
    private String numFEVPagoModerador;

    @Column(name = "consecutivo")
    private int consecutivo;
}
