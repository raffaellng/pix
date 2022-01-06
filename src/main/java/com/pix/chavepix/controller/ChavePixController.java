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

    @RequestMapping(value = "/{id}", method= RequestMethod.GET)
    public ChavePix getPixById(@PathVariable int id) {
        return chavePixInterface.findByPix(id);
    }

    @RequestMapping(method= RequestMethod.POST)
    public ChavePix savePix(@RequestBody ChavePix chavePix) {
        return chavePixInterface.savePix(chavePix);
    }

    @RequestMapping(value = "/{id}", method= RequestMethod.PUT)
    public void updatePix(@RequestBody ChavePix chavePix, @PathVariable int id) {
        chavePixInterface.updatePix(chavePix, id);
    }

    @RequestMapping(value = "/{id}", method= RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePix(@PathVariable int id){
        chavePixInterface.deletePix(id);
    }
}
