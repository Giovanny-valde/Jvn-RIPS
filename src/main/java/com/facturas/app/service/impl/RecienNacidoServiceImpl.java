package com.facturas.app.service.impl;

import com.facturas.app.dto.ProcedimientoDTO;
import com.facturas.app.dto.RecienNacidoDTO;
import com.facturas.app.entity.Procedimiento;
import com.facturas.app.entity.RecienNacido;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.repository.ProcedimientoRepository;
import com.facturas.app.repository.RecienNacidoRepository;
import com.facturas.app.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecienNacidoServiceImpl extends CRUDimpl<RecienNacido, RecienNacidoDTO, Long> implements CRUD<RecienNacidoDTO, Long> {
    @Autowired
    private RecienNacidoRepository repository;

    @Override
    protected GenericRepository<RecienNacido, Long> getRepository() {
        return repository;
    }
}
