package com.pix.chavepix.service.Interface;

import com.pix.chavepix.domain.ChavePix;
import org.springframework.http.ResponseEntity;

public interface ChavePixInterface {

    ChavePix findByPix(int id);

    ChavePix savePix(ChavePix chavePix);

    ResponseEntity<Object> updatePix(ChavePix chavePix, int id);

    ResponseEntity<Object> deletePix(int id);
}
