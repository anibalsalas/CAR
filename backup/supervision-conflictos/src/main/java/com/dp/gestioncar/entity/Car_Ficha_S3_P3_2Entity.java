
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
@Table(name = "car_ficha_s3_p3_2", schema = "SIGA")
public class Car_Ficha_S3_P3_2Entity implements Serializable {

    @EmbeddedId
    private Car_Ficha_S3_P3_2PkEntity car_ficha_s3_p3_2pk;  // Correcto

    private String usu_registro;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_registro;

    private String usu_actualiza;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_actualiza;

    private String estado;

    private String p3_2_lista_profesiones;
    private Integer p3_2_voluntariado;
    private Integer p3_2_728;
    private Integer p3_2_cas;
    private Integer p3_2_276;
    private Integer p3_2_locacion;
    private Integer p3_2_terceros;
    private Integer p3_2_total;

    public Car_Ficha_S3_P3_2Entity() {
    }

    public Car_Ficha_S3_P3_2PkEntity getCar_ficha_s3_p3_2pk() {
        return car_ficha_s3_p3_2pk;
    }

    public void setCar_ficha_s3_p3_2pk(Car_Ficha_S3_P3_2PkEntity car_ficha_s3_p3_2pk) {
        this.car_ficha_s3_p3_2pk = car_ficha_s3_p3_2pk;
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

    public String getP3_2_lista_profesiones() {
        return p3_2_lista_profesiones;
    }

    public void setP3_2_lista_profesiones(String p3_2_lista_profesiones) {
        this.p3_2_lista_profesiones = p3_2_lista_profesiones;
    }

    public Integer getP3_2_voluntariado() {
        return p3_2_voluntariado;
    }

    public void setP3_2_voluntariado(Integer p3_2_voluntariado) {
        this.p3_2_voluntariado = p3_2_voluntariado;
    }

    public Integer getP3_2_728() {
        return p3_2_728;
    }

    public void setP3_2_728(Integer p3_2_728) {
        this.p3_2_728 = p3_2_728;
    }

    public Integer getP3_2_cas() {
        return p3_2_cas;
    }

    public void setP3_2_cas(Integer p3_2_cas) {
        this.p3_2_cas = p3_2_cas;
    }

    public Integer getP3_2_276() {
        return p3_2_276;
    }

    public void setP3_2_276(Integer p3_2_276) {
        this.p3_2_276 = p3_2_276;
    }

    public Integer getP3_2_locacion() {
        return p3_2_locacion;
    }

    public void setP3_2_locacion(Integer p3_2_locacion) {
        this.p3_2_locacion = p3_2_locacion;
    }

    public Integer getP3_2_terceros() {
        return p3_2_terceros;
    }

    public void setP3_2_terceros(Integer p3_2_terceros) {
        this.p3_2_terceros = p3_2_terceros;
    }

    public Integer getP3_2_total() {
        return p3_2_total;
    }

    public void setP3_2_total(Integer p3_2_total) {
        this.p3_2_total = p3_2_total;
    }

   
    
}