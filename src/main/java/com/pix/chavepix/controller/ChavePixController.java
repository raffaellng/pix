package com.pix.chavepix.controller;

import com.pix.chavepix.domain.ChavePix;
import com.pix.chavepix.dto.ChavePixDTO;
import com.pix.chavepix.service.Interface.ChavePixInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pix")
public class ChavePixController {

    private final ChavePixInterface chavePixInterface;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ChavePix getPixById(@PathVariable int id) {
        return chavePixInterface.findByPix(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ChavePix savePix(@RequestBody @Valid ChavePixDTO chavePixDTO) {
        return chavePixInterface.savePix(chavePixDTO);
    }

    @PutMapping(value = "/{id}")
    public void updatePix(@RequestBody @Valid ChavePixDTO chavePixDTO, @PathVariable int id) {
        chavePixInterface.updatePix(id, chavePixDTO);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePix(@PathVariable int id) {
        chavePixInterface.deletePix(id);
    }
}
