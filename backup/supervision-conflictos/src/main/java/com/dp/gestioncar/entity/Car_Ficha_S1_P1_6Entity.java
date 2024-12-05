
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
@Table(name = "car_ficha_s1_p1_6", schema = "SIGA")
public class Car_Ficha_S1_P1_6Entity implements Serializable {
    
     @EmbeddedId
    private Car_Ficha_S1_P1_6PkEntity car_ficha_s1_p1_6pk;

    private String usu_registro;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_registro;
    private String usu_actualiza;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_actualiza;
    
    private String estado;
    private String p1_6_nom_residente;
    private String p1_6_sexo;
    private Integer p1_6_edad;
    private String p1_6_nacionalidad;
    private Integer p1_6_documento;
    private String p1_6_nom_padre_madre;
    private String p1_6_establecimiento;
    private String p1_6_nom_institucion;
    
    public Car_Ficha_S1_P1_6Entity() {
    }

    public Car_Ficha_S1_P1_6PkEntity getCar_ficha_s1_p1_6pk() {
        return car_ficha_s1_p1_6pk;
    }

    public void setCar_ficha_s1_p1_6pk(Car_Ficha_S1_P1_6PkEntity car_ficha_s1_p1_6pk) {
        this.car_ficha_s1_p1_6pk = car_ficha_s1_p1_6pk;
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

    public String getP1_6_nom_residente() {
        return p1_6_nom_residente;
    }

    public void setP1_6_nom_residente(String p1_6_nom_residente) {
        this.p1_6_nom_residente = p1_6_nom_residente;
    }

    public String getP1_6_sexo() {
        return p1_6_sexo;
    }

    public void setP1_6_sexo(String p1_6_sexo) {
        this.p1_6_sexo = p1_6_sexo;
    }

    public Integer getP1_6_edad() {
        return p1_6_edad;
    }

    public void setP1_6_edad(Integer p1_6_edad) {
        this.p1_6_edad = p1_6_edad;
    }

    public String getP1_6_nacionalidad() {
        return p1_6_nacionalidad;
    }

    public void setP1_6_nacionalidad(String p1_6_nacionalidad) {
        this.p1_6_nacionalidad = p1_6_nacionalidad;
    }

    public Integer getP1_6_documento() {
        return p1_6_documento;
    }

    public void setP1_6_documento(Integer p1_6_documento) {
        this.p1_6_documento = p1_6_documento;
    }

    public String getP1_6_nom_padre_madre() {
        return p1_6_nom_padre_madre;
    }

    public void setP1_6_nom_padre_madre(String p1_6_nom_padre_madre) {
        this.p1_6_nom_padre_madre = p1_6_nom_padre_madre;
    }

    public String getP1_6_establecimiento() {
        return p1_6_establecimiento;
    }

    public void setP1_6_establecimiento(String p1_6_establecimiento) {
        this.p1_6_establecimiento = p1_6_establecimiento;
    }

    public String getP1_6_nom_institucion() {
        return p1_6_nom_institucion;
    }

    public void setP1_6_nom_institucion(String p1_6_nom_institucion) {
        this.p1_6_nom_institucion = p1_6_nom_institucion;
    }

    
    
    
}