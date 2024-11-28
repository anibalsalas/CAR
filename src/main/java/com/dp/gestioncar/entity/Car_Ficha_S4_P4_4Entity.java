
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
@Table(name = "car_ficha_s4_p4_4", schema = "SIGA")
public class Car_Ficha_S4_P4_4Entity implements Serializable {
    
     @EmbeddedId
    private Car_Ficha_S4_P4_4PkEntity car_ficha_s4_p4_4pk;

    private String usu_registro;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_registro;
    private String usu_actualiza;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_actualiza;
    
    private String estado;
    private String p4_4_nom_residente;
    private String p4_4_sexo;
    private Integer p4_4_edad;
    private String p4_4_nacionalidad;
    private String p4_4_documento;
    private String p4_4_tipodoc;
    private String p4_4_vigente;
    
    public Car_Ficha_S4_P4_4Entity() {
    }

    public Car_Ficha_S4_P4_4PkEntity getCar_ficha_s4_p4_4pk() {
        return car_ficha_s4_p4_4pk;
    }

    public void setCar_ficha_s4_p4_4pk(Car_Ficha_S4_P4_4PkEntity car_ficha_s4_p4_4pk) {
        this.car_ficha_s4_p4_4pk = car_ficha_s4_p4_4pk;
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

    public String getP4_4_nom_residente() {
        return p4_4_nom_residente;
    }

    public void setP4_4_nom_residente(String p4_4_nom_residente) {
        this.p4_4_nom_residente = p4_4_nom_residente;
    }

    public String getP4_4_sexo() {
        return p4_4_sexo;
    }

    public void setP4_4_sexo(String p4_4_sexo) {
        this.p4_4_sexo = p4_4_sexo;
    }

    public Integer getP4_4_edad() {
        return p4_4_edad;
    }

    public void setP4_4_edad(Integer p4_4_edad) {
        this.p4_4_edad = p4_4_edad;
    }

    public String getP4_4_nacionalidad() {
        return p4_4_nacionalidad;
    }

    public void setP4_4_nacionalidad(String p4_4_nacionalidad) {
        this.p4_4_nacionalidad = p4_4_nacionalidad;
    }

    public String getP4_4_documento() {
        return p4_4_documento;
    }

    public void setP4_4_documento(String p4_4_documento) {
        this.p4_4_documento = p4_4_documento;
    }

    public String getP4_4_tipodoc() {
        return p4_4_tipodoc;
    }

    public void setP4_4_tipodoc(String p4_4_tipodoc) {
        this.p4_4_tipodoc = p4_4_tipodoc;
    }

    public String getP4_4_vigente() {
        return p4_4_vigente;
    }

    public void setP4_4_vigente(String p4_4_vigente) {
        this.p4_4_vigente = p4_4_vigente;
    }
  				
    
}