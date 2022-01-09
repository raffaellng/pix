package com.pix.chavepix.service;

import com.pix.chavepix.domain.ChavePix;
import com.pix.chavepix.dto.ChavePixDTO;
import com.pix.chavepix.repository.ChavePixRepository;
import com.pix.chavepix.service.Interface.ChavePixInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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

    @Override
    public ChavePix savePix(ChavePixDTO chavePixDTO) {
        return chavePixRepository.save(ChavePix.builder()
                .nomeCLiente(chavePixDTO.getNomeCLiente())
                .chavePixCliente(chavePixDTO.getChavePixCliente())
                .tipoChave(chavePixDTO.getTipoChave())
                .banco(chavePixDTO.getBanco())
                .agencia(chavePixDTO.getAgencia())
                .conta(chavePixDTO.getConta())
                .motivoAlteracao(chavePixDTO.getMotivoAlteracao())
                .statusChave(true)
                .build());
    }

    @Override
    public ResponseEntity<Object> updatePix(int id ,ChavePixDTO chavePixDTO) {
        return chavePixRepository.findById(id).
                map(pix -> {
                    pix.setId(id);
                    pix.setNomeCLiente(chavePixDTO.getNomeCLiente());
                    pix.setChavePixCliente(chavePixDTO.getChavePixCliente());
                    pix.setTipoChave(chavePixDTO.getTipoChave());
                    pix.setBanco(chavePixDTO.getBanco());
                    pix.setAgencia(chavePixDTO.getAgencia());
                    pix.setConta(chavePixDTO.getConta());
                    pix.setMotivoAlteracao(chavePixDTO.getMotivoAlteracao());
                    chavePixRepository.save(pix);
                    return ResponseEntity.noContent().build();
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pix não encontrado"));
    }

    @Override
    public ResponseEntity<Object> deletePix(int id) {
        return chavePixRepository.findById(id).
                map(pix -> {
                    pix.setStatusChave(false);
                    pix.setMotivoAlteracao("Chave Desativada");
                    chavePixRepository.save(pix);
                    return ResponseEntity.noContent().build();
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pix não encontrado"));
    }
}
