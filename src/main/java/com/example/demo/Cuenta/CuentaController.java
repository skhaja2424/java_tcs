package com.example.demo.Cuentas;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * http://localhost/cuenta
 * 
 */

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    @Autowired
    CuentaService cuentaService;

    // GET
    @GetMapping()
    public ArrayList<CuentaModel> getCuentas() {
        return cuentaService.getCuentas();
    }

    // POST
    @PostMapping()
    public CuentaModel postCuenta(@RequestBody CuentaModel cuenta) {
        return cuentaService.postCuenta(cuenta);
    }

    // GET - By Id
    @GetMapping(path = "/{id}")
    public Optional<CuentaModel> getCuentaById(@PathVariable("id") Long id) {
        return cuentaService.getCuentaById(id);
    }

    // DELETE - By Id
    @DeleteMapping(path = "/{id}")
    public String deleteCuentaById(@PathVariable("id") Long id) {
        boolean cuentaDeleted = this.cuentaService.deleteCuentaById(id);
        if (cuentaDeleted) {
            return "Successful! Data deleted: " + id;
        } else {
            return "ERROR: User does not exist or an error occurred, please try again: " + id;
        }
    }

}
