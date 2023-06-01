package com.facturas.app.mapper;

import com.facturas.app.dto.ConsultaDTO;
import com.facturas.app.entity.Consulta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConsultaMapper extends GenericMapper<Consulta, ConsultaDTO> {
}
