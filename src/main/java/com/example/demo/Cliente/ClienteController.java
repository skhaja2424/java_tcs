package com.example.demo.Clientes;

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
 * http://localhost/cliente
 * 
 */

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    // GET
    @GetMapping()
    public ArrayList<ClienteModel> getClientes() {
        return clienteService.getClientes();
    }

    // POST
    @PostMapping()
    public ClienteModel postCliente(@RequestBody ClienteModel cliente) {
        return clienteService.postCliente(cliente);
    }

    // GET - By Id
    @GetMapping(path = "/{id}")
    public Optional<ClienteModel> getClienteById(@PathVariable("id") Long id) {
        return clienteService.getClienteById(id);
    }

    // DELETE - By Id
    @DeleteMapping(path = "/{id}")
    public String deleteClienteById(@PathVariable("id") Long id) {
        boolean clienteDeleted = this.clienteService.deleteClienteById(id);
        if (clienteDeleted) {
            return "Successful! Data deleted: " + id;
        } else {
            return "ERROR: User does not exist or an error occurred, please try again: " + id;
        }
    }

}
