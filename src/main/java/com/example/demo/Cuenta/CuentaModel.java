package com.example.demo.Cuentas;

import java.util.Set;

import javax.persistence.*;

import com.example.demo.Clientes.ClienteModel

@Entity
@Table(name = "cuentas")
public class CuentaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idCuenta;

    private String numero_cuenta;
    private String tipo_cuenta;
    private String saldo;
    private Boolean status;

    @OneToMany(mappedBy = "cuentas", cascade = CascadeType.ALL)
    private Set<OrderModel> orders;
    @JoinColumn(name = "id_cliente", nullable = false, referencedColumnName = "id_cliente")
    private CustomerModel cliente;

    public Long getIdCuenta() {
        return this.idCuenta;
    }

    public void setIdCuenta(Long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNumeroCuenta() {
        return this.numero_cuenta;
    }

    public void setNumeroCuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getTipoCuenta() {
        return this.tipo_cuenta;
    }

    public void setTipoCuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public String getSaldo() {
        return this.saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
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

    public ClienteModel getCliente(){
        return this.cliente;
    }

    public void setCliente(ClienteModel cliente){
        this.cliente = cliente;
    }
}
