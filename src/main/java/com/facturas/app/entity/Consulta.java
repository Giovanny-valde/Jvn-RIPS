package com.facturas.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cod_prestador")
    private String codPrestador;

    @Column(name = "fecha_inicio_atencion")
    private LocalDateTime fechaInicioAtencion;

    @Column(name = "num_autorizacion")
    private String numAutorizacion;

    @Column(name = "cod_consulta")
    private String codConsulta;

    @Column(name = "modalidad_grupo_servicio_tec_sal")
    private String modalidadGrupoServicioTecSal;

    @Column(name = "grupo_servicios")
    private String grupoServicios;

    @Column(name = "cod_servicio")
    private int codServicio;

    @Column(name = "finalidad_tecnologia_salud")
    private String finalidadTecnologiaSalud;

    @Column(name = "causa_motivo_atencion")
    private String causaMotivoAtencion;

    @Column(name = "cod_diagnostico_principal")
    private String codDiagnosticoPrincipal;

    @Column(name = "cod_diagnostico_relacionado1")
    private String codDiagnosticoRelacionado1;

    @Column(name = "cod_diagnostico_relacionado2")
    private String codDiagnosticoRelacionado2;

    @Column(name = "cod_diagnostico_relacionado3")
    private String codDiagnosticoRelacionado3;

    @Column(name = "tipo_diagnostico_principal")
    private String tipoDiagnosticoPrincipal;

    @Column(name = "tipo_documento_identificacion")
    private String tipoDocumentoIdentificacion;

    @Column(name = "num_documento_identificacion")
    private String numDocumentoIdentificacion;

    @Column(name = "vr_servicio")
    private int vrServicio;

    @Column(name = "tipo_pago_moderador")
    private String tipoPagoModerador;

    @Column(name = "valor_pago_moderador")
    private int valorPagoModerador;

    @Column(name = "num_fev_pago_moderador")
    private String numFEVPagoModerador;

    @Column(name = "consecutivo")
    private int consecutivo;

}
