package com.Task.Scheduler.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "pagos_reportados")
public class Pago {

 private static final long serialVersionUID = 1L;
@Id
@Column(name = "idpagos_reportados")
private String id;


@Column(name = "cui")
private String cui;

@Column(name = "nombre")
private String nombre;

@Column(name = "pagare")
private String pagare;

@Column(name = "telefono")
private int telefono;

@Column(name = "montopago")
private double montopago;

@Column(name = "banco")
private String banco;

@Column(name = "noreferencia")
private String noreferencia;

@Column(name = "fechapago")
private String fechapago;

@Lob 
	@Basic(fetch = FetchType.LAZY)
@Column(name = "boleta", columnDefinition="longblob", nullable=true)
private byte[] boleta;

@Column(name = "nogestion")
private String nogestion;


@Column(name = "procesado", nullable = false, columnDefinition = "TINYINT(1)")
//@Type(type = "org.hibernate.type.NumericBooleanType")
private boolean procesado;



    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCui() {
        return this.cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPagare() {
        return this.pagare;
    }

    public void setPagare(String pagare) {
        this.pagare = pagare;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getMontopago() {
        return this.montopago;
    }

    public void setMontopago(double montopago) {
        this.montopago = montopago;
    }

    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNoreferencia() {
        return this.noreferencia;
    }

    public void setNoreferencia(String noreferencia) {
        this.noreferencia = noreferencia;
    }

    public String getFechapago() {
        return this.fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }


    public byte[] getBoleta() {
        return this.boleta;
    }

    public void setBoleta(byte[] boleta) {
        this.boleta = boleta;
    }            
      
    public String getNogestion() {
        return this.nogestion;
    }

    public void setNogestion(String nogestion) {
        this.nogestion = nogestion;
    }

    public boolean isProcesado() {
        return this.procesado;
    }

    public boolean getProcesado() {
        return this.procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cui='" + getCui() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", pagare='" + getPagare() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", montopago='" + getMontopago() + "'" +
            ", banco='" + getBanco() + "'" +
            ", noreferencia='" + getNoreferencia() + "'" +
            ", fechapago='" + getFechapago() + "'" +
            //", boleta='" + getBoleta() + "'" +
            ", nogestion='" + getNogestion() + "'" +
            ", procesado='" + isProcesado() + "'" +
            "}";
    }





    
}
