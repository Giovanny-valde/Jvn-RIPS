package com.facturas.app.mapper;

import com.facturas.app.dto.RecienNacidoDTO;
import com.facturas.app.entity.RecienNacido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecienNacidoMapper extends GenericMapper<RecienNacido, RecienNacidoDTO>{
}
