package com.facturas.app.service.impl;

import com.facturas.app.dto.OtrosServiciosDTO;
import com.facturas.app.dto.ProcedimientoDTO;
import com.facturas.app.entity.OtrosServicios;
import com.facturas.app.entity.Procedimiento;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.repository.OtrosServiciosRepository;
import com.facturas.app.repository.ProcedimientoRepository;
import com.facturas.app.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcedimientoServiceImpl extends CRUDimpl<Procedimiento, ProcedimientoDTO, Long> implements CRUD<ProcedimientoDTO, Long> {

    @Autowired
    private ProcedimientoRepository repository;

    @Override
    protected GenericRepository<Procedimiento, Long> getRepository() {
        return repository;
    }


}
