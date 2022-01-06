package com.pix.chavepix.controller;

import com.pix.chavepix.domain.ChavePix;
import com.pix.chavepix.service.Interface.ChavePixInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pix")
public class ChavePixController {

    private final ChavePixInterface chavePixInterface;

    @GetMapping
    @RequestMapping(value = "/{id}")
    public ChavePix getPixById(@PathVariable int id) {
        return chavePixInterface.findByPix(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ChavePix savePix(@RequestBody ChavePix chavePix) {
        return chavePixInterface.savePix(chavePix);
    }

    @PutMapping("/{id}")
    public void updatePix(@RequestBody ChavePix chavePix, @PathVariable int id) {
        chavePixInterface.updatePix(chavePix, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePix(@PathVariable int id){
        chavePixInterface.deletePix(id);
    }
}
