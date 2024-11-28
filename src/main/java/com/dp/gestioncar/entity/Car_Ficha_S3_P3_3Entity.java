
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
@Table(name = "car_ficha_s3_p3_3", schema = "SIGA")
public class Car_Ficha_S3_P3_3Entity implements Serializable {

    @EmbeddedId
    private Car_Ficha_S3_P3_3PkEntity car_ficha_s3_p3_3pk;  // Correcto

    private String usu_registro;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_registro;

    private String usu_actualiza;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_actualiza;

    private String estado;

    private String p3_3_ocupacion;
    private Integer p3_3_voluntariado;
    private Integer p3_3_728;
    private Integer p3_3_cas;
    private Integer p3_3_276;
    private Integer p3_3_locacion;
    private Integer p3_3_terceros;
    private Integer p3_3_total;

    public Car_Ficha_S3_P3_3Entity() {
    }

    public Car_Ficha_S3_P3_3PkEntity getCar_ficha_s3_p3_3pk() {
        return car_ficha_s3_p3_3pk;
    }

    public void setCar_ficha_s3_p3_3pk(Car_Ficha_S3_P3_3PkEntity car_ficha_s3_p3_3pk) {
        this.car_ficha_s3_p3_3pk = car_ficha_s3_p3_3pk;
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

    public String getP3_3_ocupacion() {
        return p3_3_ocupacion;
    }

    public void setP3_3_ocupacion(String p3_3_ocupacion) {
        this.p3_3_ocupacion = p3_3_ocupacion;
    }

    public Integer getP3_3_voluntariado() {
        return p3_3_voluntariado;
    }

    public void setP3_3_voluntariado(Integer p3_3_voluntariado) {
        this.p3_3_voluntariado = p3_3_voluntariado;
    }

    public Integer getP3_3_728() {
        return p3_3_728;
    }

    public void setP3_3_728(Integer p3_3_728) {
        this.p3_3_728 = p3_3_728;
    }

    public Integer getP3_3_cas() {
        return p3_3_cas;
    }

    public void setP3_3_cas(Integer p3_3_cas) {
        this.p3_3_cas = p3_3_cas;
    }

    public Integer getP3_3_276() {
        return p3_3_276;
    }

    public void setP3_3_276(Integer p3_3_276) {
        this.p3_3_276 = p3_3_276;
    }

    public Integer getP3_3_locacion() {
        return p3_3_locacion;
    }

    public void setP3_3_locacion(Integer p3_3_locacion) {
        this.p3_3_locacion = p3_3_locacion;
    }

    public Integer getP3_3_terceros() {
        return p3_3_terceros;
    }

    public void setP3_3_terceros(Integer p3_3_terceros) {
        this.p3_3_terceros = p3_3_terceros;
    }

    public Integer getP3_3_total() {
        return p3_3_total;
    }

    public void setP3_3_total(Integer p3_3_total) {
        this.p3_3_total = p3_3_total;
    }

    
    
}