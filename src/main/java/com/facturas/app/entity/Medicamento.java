package com.facturas.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cod_prestador")
    private String codPrestador;

    @Column(name = "num_autorizacion")
    private String numAutorizacion;

    @Column(name = "id_mipres")
    private String idMIPRES;

    @Column(name = "fecha_dispens_admon")
    private LocalDateTime fechaDispensAdmon;

    @Column(name = "cod_diagnostico_principal")
    private String codDiagnosticoPrincipal;

    @Column(name = "cod_diagnostico_relacionado")
    private String codDiagnosticoRelacionado;

    @Column(name = "tipo_medicamento")
    private String tipoMedicamento;

    @Column(name = "cod_tecnologia_salud")
    private String codTecnologiaSalud;

    @Column(name = "nom_tecnologia_salud")
    private String nomTecnologiaSalud;

    @Column(name = "concentracion_medicamento")
    private BigDecimal concentracionMedicamento;

    @Column(name = "unidad_medida")
    private BigDecimal unidadMedida;

    @Column(name = "forma_farmaceutica")
    private String formaFarmaceutica;

    @Column(name = "unidad_min_dispensa")
    private int unidadMinDispensa;

    @Column(name = "cantidad_medicamento")
    private int cantidadMedicamento;

    @Column(name = "dias_tratamiento")
    private int diasTratamiento;

    @Column(name = "tipo_documento_identificacion")
    private String tipoDocumentoIdentificacion;

    @Column(name = "num_documento_identificacion")
    private String numDocumentoIdentificacion;

    @Column(name = "vr_unit_medicamento")
    private BigDecimal vrUnitMedicamento;

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
