package com.facturas.app.mapper;

import com.facturas.app.dto.MedicamentoDTO;
import com.facturas.app.entity.Medicamento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicamentoMapper extends GenericMapper<Medicamento, MedicamentoDTO> {
}
