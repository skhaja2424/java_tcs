package com.example.demo.Clientes;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    // GET → ALL CUSTOMERS
    public ArrayList<ClienteModel> getClientes() {
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    // POST → CUSTOMER (Save and update cliente)
    public ClienteModel postCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    // GET → CUSTOMER BY ID
    public Optional<ClienteModel> getClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    public boolean deleteClienteById(Long id) {
        try {
            clienteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            // TO DO: handle exception
            System.out.println("ERROR: data does not exist or an error occurred");
            return false;
        }
    }
}
