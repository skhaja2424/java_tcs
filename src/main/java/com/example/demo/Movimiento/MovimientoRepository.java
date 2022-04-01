package com.example.demo.Movimientos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends CrudRepository<MovimientoModel, Long> {
    // You can create custom abstract methods
}
