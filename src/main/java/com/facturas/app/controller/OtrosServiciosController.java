package com.facturas.app.controller;

import com.facturas.app.dto.OtrosServiciosDTO;
import com.facturas.app.dto.OtrosServiciosDTO;
import com.facturas.app.dto.ResponseDTO;
import com.facturas.app.service.MedicamentoService;
import com.facturas.app.service.OtrosServiciosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/otrosServicios")
public class OtrosServiciosController {
    private static final Logger log = LoggerFactory.getLogger(OtrosServiciosController.class);

    @Autowired
    private OtrosServiciosService service;

    @GetMapping()
    public ResponseEntity<ResponseDTO<List<OtrosServiciosDTO>>> getAll() {
        log.info("REST - To get all");
        return ResponseEntity.ok(new ResponseDTO<>(0, service.getAll(), "All Elements", "OK"));
    }

    @PostMapping()
    public ResponseEntity<ResponseDTO<OtrosServiciosDTO>> register(@RequestBody OtrosServiciosDTO dto) {
        log.info("REST - Request to register : {}", dto);
        return ResponseEntity.ok(new ResponseDTO<>(0, service.register(dto), "Created Element", "OK"));
    }

    @PutMapping()
    public ResponseEntity<ResponseDTO<OtrosServiciosDTO>> update(@RequestBody OtrosServiciosDTO dto) {
        log.info("REST - Request to update : {}", dto);
        return new ResponseEntity<>(new ResponseDTO<>(0, service.update(dto), "Update Element", "OK"), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO<OtrosServiciosDTO>> getById(@PathVariable("id") Integer id) {
        log.info("REST - Get with Id : {}", id);
        return ResponseEntity.ok(new ResponseDTO<>(0, service.getById(id), "Found Element", "OK"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> delete(@PathVariable("id") Integer id) {
        log.info("REST - Delete with id: {}", id);
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}