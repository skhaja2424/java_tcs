package com.example.demo.Movimientos;

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
 * http://localhost/movimiento
 * 
 */

@RestController
@RequestMapping("/movimiento")
public class MovimientoController {

    @Autowired
    MovimientoService movimientoService;

    // GET
    @GetMapping()
    public ArrayList<MovimientoModel> getMovimientos() {
        return movimientoService.getMovimientos();
    }

    // POST
    @PostMapping()
    public MovimientoModel postMovimiento(@RequestBody MovimientoModel movimiento) {
        return movimientoService.postMovimiento(movimiento);
    }

    // GET - By Id
    @GetMapping(path = "/{id}")
    public Optional<MovimientoModel> getMovimientoById(@PathVariable("id") Long id) {
        return movimientoService.getMovimientoById(id);
    }

    // DELETE - By Id
    @DeleteMapping(path = "/{id}")
    public String deleteMovimientoById(@PathVariable("id") Long id) {
        boolean movimientoDeleted = this.movimientoService.deleteMovimientoById(id);
        if (movimientoDeleted) {
            return "Successful! Data deleted: " + id;
        } else {
            return "ERROR: User does not exist or an error occurred, please try again: " + id;
        }
    }

}
