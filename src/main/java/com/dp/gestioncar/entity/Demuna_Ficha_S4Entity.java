package com.dp.gestioncar.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car_ficha_s4", schema = "SIGA")

public class Demuna_Ficha_S4Entity implements Serializable {
    @Id
    public Integer id_ficha_s4;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    
    private String estado_s4;
    
       private String usu_valida;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_valida;
    
    private String p4_1;
    private Integer p4_3;

    private Integer p4_5;
   
    private String p4_6_o1;
    private String p4_6_o2;
    private String p4_6_o3;
    private String p4_6_o4;
    private String p4_6_o5;
    private String p4_6_otro;
    private String p4_7;
    private String p4_8;
    private String p4_9;

    private String p4_10_o1;
    private String p4_10_o2;
    private String p4_10_o3;
    private String p4_10_o4;
    private String p4_10_o5;
    private String p4_10_o6;
    private String p4_10_o7;
    private String p4_10_o8;
           
    private String p4_10_otro;

}