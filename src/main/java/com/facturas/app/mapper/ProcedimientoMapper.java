package com.facturas.app.mapper;

import com.facturas.app.dto.ProcedimientoDTO;
import com.facturas.app.entity.Procedimiento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProcedimientoMapper extends GenericMapper<Procedimiento, ProcedimientoDTO> {
}
