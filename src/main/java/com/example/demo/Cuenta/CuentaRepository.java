package com.example.demo.Cuentas;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends CrudRepository<CuentaModel, Long> {
    // You can create custom abstract methods
}
