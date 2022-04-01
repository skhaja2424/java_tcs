package com.example.demo.Movimientos;

import java.util.Set;

import javax.persistence.*;
import com.example.demo.Cuentas.CuentaModel

@Entity
@Table(name = "movimientos")
public class MovimientoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idMovimiento;
    
    private String referencia;
    private String debito;
    private String credito;
    private String cedula;
    private String fecha;
    private Boolean status;

    @OneToMany(mappedBy = "movimientos", cascade = CascadeType.ALL)
    private Set<OrderModel> orders;
    @JoinColumn(name = "idCuenta", nullable = false, referencedColumnName = "idCuenta")
    private CustomerModel cuenta;

    public Long getIdMovimiento() {
        return this.idMovimiento;
    }

    public void setIdMovimient(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDebito() {
        return this.debito;
    }

    public void setDebito(String debito) {
        this.debito = debito;
    }

    public String getCredito() {
        return this.credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public CuentaModel getCuenta(){
        return this.cuenta;
    }

    public void setCuenta(CuentaModel cuenta){
        this.cuenta = cuenta;
    }

}
