package com.example.demo.Movimientos;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimientoService {

    @Autowired
    MovimientoRepository movimientoRepository;

    // GET → ALL CUSTOMERS
    public ArrayList<MovimientoModel> getMovimientos() {
        return (ArrayList<MovimientoModel>) movimientoRepository.findAll();
    }

    // POST → CUSTOMER (Save and update movimiento)
    public MovimientoModel postMovimiento(MovimientoModel movimiento) {
        return movimientoRepository.save(movimiento);
    }

    // GET → CUSTOMER BY ID
    public Optional<MovimientoModel> getMovimientoById(Long id) {
        return movimientoRepository.findById(id);
    }

    public boolean deleteMovimientoById(Long id) {
        try {
            movimientoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            // TO DO: handle exception
            System.out.println("ERROR: data does not exist or an error occurred");
            return false;
        }
    }
}
