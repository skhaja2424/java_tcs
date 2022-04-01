package com.example.demo.Clientes;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_cliente;

    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String direccion;
    private String password;
    private Boolean status;

    @OneToMany(mappedBy = "clientes", cascade = CascadeType.ALL)
    private Set<OrderModel> orders;

    public Long getIdCliente() {
        return this.id_cliente;
    }

    public void setIdCliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return this.nombres;
    }

    public void setNombre(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return this.apellidos;
    }

    public void setApellido(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isStatus() {
        return this.status;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
