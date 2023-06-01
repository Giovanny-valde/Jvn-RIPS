package com.facturas.app.service.impl;


import com.facturas.app.dto.OtrosServiciosDTO;
import com.facturas.app.entity.OtrosServicios;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.repository.OtrosServiciosRepository;
import com.facturas.app.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtrosServiciosServiceImpl extends CRUDimpl<OtrosServicios, OtrosServiciosDTO, Long> implements CRUD<OtrosServiciosDTO, Long> {
    @Autowired
    private OtrosServiciosRepository repository;

    @Override
    protected GenericRepository<OtrosServicios, Long> getRepository() {
        return repository;
    }
}
