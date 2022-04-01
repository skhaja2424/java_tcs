package com.example.demo.Cuentas;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaService {

    @Autowired
    CuentaRepository cuentaRepository;

    // GET → ALL CUSTOMERS
    public ArrayList<CuentaModel> getCuentas() {
        return (ArrayList<CuentaModel>) cuentaRepository.findAll();
    }

    // POST → CUSTOMER (Save and update cuenta)
    public CuentaModel postCuenta(CuentaModel cuenta) {
        return cuentaRepository.save(cuenta);
    }

    // GET → CUSTOMER BY ID
    public Optional<CuentaModel> getCuentaById(Long id) {
        return cuentaRepository.findById(id);
    }

    public boolean deleteCuentaById(Long id) {
        try {
            cuentaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            // TO DO: handle exception
            System.out.println("ERROR: data does not exist or an error occurred");
            return false;
        }
    }
}
