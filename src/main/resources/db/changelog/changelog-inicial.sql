-- liquibase formatted sql

-- changeset script:1
-- comment: Creation table transacción

CREATE TABLE transaccion (
    numDocumentoldObligado VARCHAR(20),
    numFactura VARCHAR(20),
    TipoNota VARCHAR(20),
    numNota INT
);


-- changeset script:2
-- comment: Creation table usuarios

CREATE TABLE usuario (
    tipoDocumentoldentificacion VARCHAR(2),
    numDocumentoldentificacion VARCHAR(20),
    tipoUsuario VARCHAR(2),
    fechaNacimiento DATETIME,
    codSexo CHAR(1),
    codPaisResidencia VARCHAR(3),
    codMunicipioResidencia VARCHAR(5),
    codZonaTerritorialResidencia VARCHAR(2),
    incapacidad VARCHAR(2),
    consecutivo INT
);


-- changeset script:3
-- comment: Creation table consultas

CREATE TABLE consulta (
    codPrestador VARCHAR(12),
    fechalnicioAtencion DATETIME,
    numAutoriacion VARCHAR(12),
    codConsulta VARCHAR(10),
    modalidadGrupoServicioTecSal VARCHAR(2),
    grupoServicios VARCHAR(2),
    codServicio INT,
    finalidadTecnologiaSalud VARCHAR(2),
    causaMotivoAtencion VARCHAR(2),
    codDiagnosticoPrincipar VARCHAR(4),
    codDiagnosticoRelacionado1 VARCHAR(5),
    codDiagnosticoRelacionado2 VARCHAR(5),
    codDiagnosticoRelacionado3 VARCHAR(5),
    tipoDiagnosticoPrincipar VARCHAR(2),
    tipoDocumentoldentificacion VARCHAR(2),
    numDocumentoldentificacion VARCHAR(20),
    vrServicio INT,
    tipoPagoModerador VARCHAR(2),
    valorPagoModerador INT,
    numFEVPagoModerador VARCHAR(20),
    consecutivo INT
);


-- changeset script:4
-- comment: Creation table procedimientos

CREATE TABLE procedimiento (
    codPrestador VARCHAR(12),
    fechaInicioAtencion DATETIME,
    idMIPRES VARCHAR(12),
    numAutoriacion VARCHAR(12),
    codProcedimiento VARCHAR(10),
    viaIngresoServicioSalud VARCHAR(2),
    modalidadGrupoServicioTecSal VARCHAR(2),
    grupoServicios VARCHAR(2),
    codServicio INT,
    finalidadTecnologiaSalud VARCHAR(2),
    tipoDocumentoldentificacion VARCHAR(2),
    numDocumentoldentificacion VARCHAR(20),
    codDiagnosticoPrincipal VARCHAR(4),
    codDiagnosticoRelacionado VARCHAR(4),
    codComplicacion VARCHAR(4),
    vrServicio INT,
    tipoPagoModerador VARCHAR(2),
    valorPagoModerador INT,
    numFEVPagoModerador VARCHAR(20),
    consecutivo INT
);


-- changeset script:5
-- comment: Creation table medicamentos
CREATE TABLE medicamento (
    codPrestador VARCHAR(12),
    numAutorizacion VARCHAR(12),
    idMIPRES VARCHAR(10),
    fechaDispensAdmon DATETIME,
    codDiagnosticoPrincipal VARCHAR(4),
    codDiagnosticoRelacionado VARCHAR(4),
    tipoMedicamento VARCHAR(2),
    codTecnologiaSalud VARCHAR(16),
    nomTecnologiaSalud VARCHAR(255),
    concentracionMedicamento DECIMAL(10,2),
    unidadMedida DECIMAL(10,2),
    formaFarmaceutica VARCHAR(6),
    unidadMinDispensa INT,
    cantidadMedicamento INT,
    diasTratamiento INT,
    tipoDocumentoldentificacion VARCHAR(2),
    numDocumentoldentificacion VARCHAR(20),
    vrUnitMedicamento DECIMAL(10,2),
    vrServicio DECIMAL(10,2),
    tipoPagoModerador VARCHAR(2),
    valorPagoModerador INT,
    numFEVPagoModerador VARCHAR(20),
    consecutivo INT
);


-- changeset script:6
-- comment: Creation table recienNacidos
CREATE TABLE recienNacido (
    codPrestador VARCHAR(12),
    tipoDocumentoldentificacion VARCHAR(2),
    numDocumentoldentificacion VARCHAR(20),
    fechaNacimiento DATETIME,
    edadGestacional INT,
    numConsultasCPrenatal INT,
    codSexoBiologico VARCHAR(2),
    peso INT,
    codDiagnosticoPrincipaI VARCHAR(4),
    condicionDestino VARCHAR(2),
    codDiagnosticoCausaMuerte VARCHAR(4),
    fechaEgreso DATETIME,
    consecutivo INT
);

