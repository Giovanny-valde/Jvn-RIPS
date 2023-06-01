package com.facturas.app.service.impl;

import com.facturas.app.dto.ConsultaDTO;
import com.facturas.app.repository.ConsultaRepository;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.entity.Consulta;
import com.facturas.app.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServiceImpl extends CRUDimpl<Consulta, ConsultaDTO, Long> implements CRUD<ConsultaDTO, Long> {

    @Autowired
    private ConsultaRepository repository;

    @Override
    protected GenericRepository<Consulta, Long> getRepository() {
        return repository;
    }
}
