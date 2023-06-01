package com.facturas.app.service.impl;

import com.facturas.app.dto.UsuarioDTO;
import com.facturas.app.entity.Usuario;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.repository.UsuarioRepository;
import com.facturas.app.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends CRUDimpl<Usuario, UsuarioDTO, Long> implements CRUD<UsuarioDTO, Long> {
    @Autowired
    private UsuarioRepository repository;

    @Override
    protected GenericRepository<Usuario, Long> getRepository() {

        return repository;

    }
}
