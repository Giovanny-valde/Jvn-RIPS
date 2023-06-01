package com.facturas.app.mapper;

import com.facturas.app.dto.TransaccionDTO;
import com.facturas.app.entity.Transaccion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransaccionMapper extends GenericMapper<Transaccion, TransaccionDTO>{
}
