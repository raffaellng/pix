package com.pix.chavepix.service;

import com.pix.chavepix.domain.ChavePix;
import com.pix.chavepix.repository.ChavePixRepository;
import com.pix.chavepix.service.Interface.ChavePixInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@RequiredArgsConstructor
public class ChavePixService implements ChavePixInterface {

    @Autowired
    ChavePixRepository chavePixRepository;

    public ChavePix findByPix(int id) {
        return chavePixRepository.findById(id)
                .orElseThrow(() -> new ExpressionException("Cliente não encontrado"));
    }

//    @Override
//    public ChavePix savePix(ChavePix chavePix) {
//        return chavePixRepository.save(chavePix);
//    }
//
//    @Override
//    public ResponseEntity<Object> updatePix(ChavePix chavePix, int id) {
//        return chavePixRepository.findById(id).
//                map(pix -> {
//                    chavePix.setId(pix.getId());
//                    chavePixRepository.save(chavePix);
//                    return ResponseEntity.noContent().build();
//                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pix não encontrado"));
//    }
//
//    @Override
//    public ResponseEntity<Object> deletePix(int id) {
//        return chavePixRepository.findById(id).
//                map(pix -> {
//                    pix.setStatusChave(false);
//                    pix.setMotivoAlteracao("Chave Desativada");
//                    chavePixRepository.save(pix);
//                    return ResponseEntity.noContent().build();
//                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pix não encontrado"));
//    }
}
