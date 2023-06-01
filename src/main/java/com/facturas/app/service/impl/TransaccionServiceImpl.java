package com.facturas.app.service.impl;

import com.facturas.app.dto.TransaccionDTO;
import com.facturas.app.entity.Transaccion;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.repository.TransaccionRepository;
import com.facturas.app.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaccionServiceImpl extends CRUDimpl<Transaccion, TransaccionDTO, Long> implements CRUD<TransaccionDTO, Long> {
    @Autowired
    private TransaccionRepository repository;

    @Override
    protected GenericRepository<Transaccion, Long> getRepository() {
        return repository;
    }
}
