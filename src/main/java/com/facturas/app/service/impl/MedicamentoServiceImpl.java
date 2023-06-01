package com.facturas.app.service.impl;

import com.facturas.app.dto.MedicamentoDTO;
import com.facturas.app.entity.Medicamento;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.repository.MedicamentoRepository;
import com.facturas.app.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoServiceImpl extends CRUDimpl<Medicamento, MedicamentoDTO, Long> implements CRUD<MedicamentoDTO, Long> {

    @Autowired
    private MedicamentoRepository repository;

    @Override
    protected GenericRepository<Medicamento, Long> getRepository() {
        return repository;
    }

}
