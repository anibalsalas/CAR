
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
@Table(name = "car_ficha_s9_p9_1", schema = "SIGA")
public class Car_Ficha_S9_P9_1Entity implements Serializable {
    
     @EmbeddedId
    private Car_Ficha_S9_P9_1PkEntity car_ficha_s9_p9_1pk;

    private String usu_registro;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_registro;
    private String usu_actualiza;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_actualiza;
    
    private String estado;
    private String p9_1_nom_residente;
    private String p9_1_sexo;
    private Integer p9_1_edad;
    private String p9_1_nacionalidad;
    private String p9_1_motivo;
    private String p9_1_atendido;
    private String p9_1_amerita;
    
    public Car_Ficha_S9_P9_1Entity() {
    }

    public Car_Ficha_S9_P9_1PkEntity getCar_ficha_s9_p9_1pk() {
        return car_ficha_s9_p9_1pk;
    }

    public void setCar_ficha_s9_p9_1pk(Car_Ficha_S9_P9_1PkEntity car_ficha_s9_p9_1pk) {
        this.car_ficha_s9_p9_1pk = car_ficha_s9_p9_1pk;
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

    public String getP9_1_nom_residente() {
        return p9_1_nom_residente;
    }

    public void setP9_1_nom_residente(String p9_1_nom_residente) {
        this.p9_1_nom_residente = p9_1_nom_residente;
    }

    public String getP9_1_sexo() {
        return p9_1_sexo;
    }

    public void setP9_1_sexo(String p9_1_sexo) {
        this.p9_1_sexo = p9_1_sexo;
    }

    public Integer getP9_1_edad() {
        return p9_1_edad;
    }

    public void setP9_1_edad(Integer p9_1_edad) {
        this.p9_1_edad = p9_1_edad;
    }

    public String getP9_1_nacionalidad() {
        return p9_1_nacionalidad;
    }

    public void setP9_1_nacionalidad(String p9_1_nacionalidad) {
        this.p9_1_nacionalidad = p9_1_nacionalidad;
    }

    public String getP9_1_motivo() {
        return p9_1_motivo;
    }

    public void setP9_1_motivo(String p9_1_motivo) {
        this.p9_1_motivo = p9_1_motivo;
    }

    public String getP9_1_atendido() {
        return p9_1_atendido;
    }

    public void setP9_1_atendido(String p9_1_atendido) {
        this.p9_1_atendido = p9_1_atendido;
    }

    public String getP9_1_amerita() {
        return p9_1_amerita;
    }

    public void setP9_1_amerita(String p9_1_amerita) {
        this.p9_1_amerita = p9_1_amerita;
    }

    
  				
    
}