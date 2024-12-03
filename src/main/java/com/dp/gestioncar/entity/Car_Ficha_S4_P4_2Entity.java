
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
@Table(name = "car_ficha_s4_p4_2", schema = "SIGA")
public class Car_Ficha_S4_P4_2Entity implements Serializable {
    
     @EmbeddedId
    private Car_Ficha_S4_P4_2PkEntity car_ficha_s4_p4_2pk;

    private String usu_registro;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_registro;
    private String usu_actualiza;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_actualiza;
    
    private String estado;
    private String p4_2_nom_residente;
    private String p4_2_sexo;
    private Integer p4_2_edad;
    private String p4_2_partidanac;
    private String p4_2_certinac;
    private String p4_2_reniec;
    private String p4_2_defensoria;
    private String p4_2_amerita;
    
    public Car_Ficha_S4_P4_2Entity() {
    }

    public Car_Ficha_S4_P4_2PkEntity getCar_ficha_s4_p4_2pk() {
        return car_ficha_s4_p4_2pk;
    }

    public void setCar_ficha_s4_p4_2pk(Car_Ficha_S4_P4_2PkEntity car_ficha_s4_p4_2pk) {
        this.car_ficha_s4_p4_2pk = car_ficha_s4_p4_2pk;
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

    public String getP4_2_nom_residente() {
        return p4_2_nom_residente;
    }

    public void setP4_2_nom_residente(String p4_2_nom_residente) {
        this.p4_2_nom_residente = p4_2_nom_residente;
    }

    public String getP4_2_sexo() {
        return p4_2_sexo;
    }

    public void setP4_2_sexo(String p4_2_sexo) {
        this.p4_2_sexo = p4_2_sexo;
    }

    public Integer getP4_2_edad() {
        return p4_2_edad;
    }

    public void setP4_2_edad(Integer p4_2_edad) {
        this.p4_2_edad = p4_2_edad;
    }

    public String getP4_2_partidanac() {
        return p4_2_partidanac;
    }

    public void setP4_2_partidanac(String p4_2_partidanac) {
        this.p4_2_partidanac = p4_2_partidanac;
    }

    public String getP4_2_certinac() {
        return p4_2_certinac;
    }

    public void setP4_2_certinac(String p4_2_certinac) {
        this.p4_2_certinac = p4_2_certinac;
    }

    public String getP4_2_reniec() {
        return p4_2_reniec;
    }

    public void setP4_2_reniec(String p4_2_reniec) {
        this.p4_2_reniec = p4_2_reniec;
    }

    public String getP4_2_defensoria() {
        return p4_2_defensoria;
    }

    public void setP4_2_defensoria(String p4_2_defensoria) {
        this.p4_2_defensoria = p4_2_defensoria;
    }

    public String getP4_2_amerita() {
        return p4_2_amerita;
    }

    public void setP4_2_amerita(String p4_2_amerita) {
        this.p4_2_amerita = p4_2_amerita;
    }

   
    
}