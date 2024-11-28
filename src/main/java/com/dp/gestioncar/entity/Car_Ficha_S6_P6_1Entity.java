
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestioncar.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "car_ficha_s6_p6_1", schema = "SIGA")
public class Car_Ficha_S6_P6_1Entity implements Serializable {

    @EmbeddedId
    private Car_Ficha_S6_P6_1PkEntity car_ficha_s6_p6_1pk;  // Correcto

    private String usu_registro;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_registro;

    private String usu_actualiza;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_actualiza;

    private String estado;

     private String p6_1_lista_profesiones;
    private Integer p6_1_voluntariado;
    private Integer p6_1_728;
    private Integer p6_1_cas;
    private Integer p6_1_276;
    private Integer p6_1_locacion;
    private Integer p6_1_terceros;
    private Integer p6_1_total;

    public Car_Ficha_S6_P6_1Entity() {
    }

    public Car_Ficha_S6_P6_1PkEntity getCar_ficha_s6_p6_1pk() {
        return car_ficha_s6_p6_1pk;
    }

    public void setCar_ficha_s6_p6_1pk(Car_Ficha_S6_P6_1PkEntity car_ficha_s6_p6_1pk) {
        this.car_ficha_s6_p6_1pk = car_ficha_s6_p6_1pk;
    }

    public String getUsu_registro() {
        return usu_registro;
    }

    public void setUsu_registro(String usu_registro) {
        this.usu_registro = usu_registro;
    }

    public Date getFch_registro() {
        return fch_registro;
    }

    public void setFch_registro(Date fch_registro) {
        this.fch_registro = fch_registro;
    }

    public String getUsu_actualiza() {
        return usu_actualiza;
    }

    public void setUsu_actualiza(String usu_actualiza) {
        this.usu_actualiza = usu_actualiza;
    }

    public Date getFch_actualiza() {
        return fch_actualiza;
    }

    public void setFch_actualiza(Date fch_actualiza) {
        this.fch_actualiza = fch_actualiza;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getP6_1_lista_profesiones() {
        return p6_1_lista_profesiones;
    }

    public void setP6_1_lista_profesiones(String p6_1_lista_profesiones) {
        this.p6_1_lista_profesiones = p6_1_lista_profesiones;
    }

    public Integer getP6_1_voluntariado() {
        return p6_1_voluntariado;
    }

    public void setP6_1_voluntariado(Integer p6_1_voluntariado) {
        this.p6_1_voluntariado = p6_1_voluntariado;
    }

    public Integer getP6_1_728() {
        return p6_1_728;
    }

    public void setP6_1_728(Integer p6_1_728) {
        this.p6_1_728 = p6_1_728;
    }

    public Integer getP6_1_cas() {
        return p6_1_cas;
    }

    public void setP6_1_cas(Integer p6_1_cas) {
        this.p6_1_cas = p6_1_cas;
    }

    public Integer getP6_1_276() {
        return p6_1_276;
    }

    public void setP6_1_276(Integer p6_1_276) {
        this.p6_1_276 = p6_1_276;
    }

    public Integer getP6_1_locacion() {
        return p6_1_locacion;
    }

    public void setP6_1_locacion(Integer p6_1_locacion) {
        this.p6_1_locacion = p6_1_locacion;
    }

    public Integer getP6_1_terceros() {
        return p6_1_terceros;
    }

    public void setP6_1_terceros(Integer p6_1_terceros) {
        this.p6_1_terceros = p6_1_terceros;
    }

    public Integer getP6_1_total() {
        return p6_1_total;
    }

    public void setP6_1_total(Integer p6_1_total) {
        this.p6_1_total = p6_1_total;
    }
    




 }
