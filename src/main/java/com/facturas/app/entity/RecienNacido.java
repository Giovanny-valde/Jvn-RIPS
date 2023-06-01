package com.facturas.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "recienNacido")
public class RecienNacido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cod_prestador")
    private String codPrestador;

    @Column(name = "tipo_documento_identificacion")
    private String tipoDocumentoIdentificacion;

    @Column(name = "num_documento_identificacion")
    private String numDocumentoIdentificacion;

    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "edad_gestacional")
    private int edadGestacional;

    @Column(name = "num_consultas_prenatal")
    private int numConsultasCPrenatal;

    @Column(name = "cod_sexo_biologico")
    private String codSexoBiologico;

    @Column(name = "peso")
    private int peso;

    @Column(name = "cod_diagnostico_principal")
    private String codDiagnosticoPrincipaI;

    @Column(name = "condicion_destino")
    private String condicionDestino;

    @Column(name = "cod_diagnostico_causa_muerte")
    private String codDiagnosticoCausaMuerte;

    @Column(name = "fecha_egreso")
    private LocalDateTime fechaEgreso;

    @Column(name = "consecutivo")
    private int consecutivo;
}
