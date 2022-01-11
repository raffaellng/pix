package com.pix.chavepix.service.Interface;

import com.pix.chavepix.domain.ChavePix;
import com.pix.chavepix.dto.ChavePixDTO;
import org.springframework.http.ResponseEntity;

public interface ChavePixInterface {

    ChavePix findByPix(int id);

    ChavePix savePix(ChavePixDTO chavePixDTO);

    ResponseEntity<Object> updatePix(int id, ChavePixDTO chavePixDTO);

    ResponseEntity<Object> deletePix(int id);
}
