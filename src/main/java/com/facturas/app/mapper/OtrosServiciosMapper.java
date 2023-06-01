package com.facturas.app.mapper;

import com.facturas.app.dto.OtrosServiciosDTO;
import com.facturas.app.entity.OtrosServicios;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OtrosServiciosMapper extends GenericMapper<OtrosServicios, OtrosServiciosDTO> {
}
