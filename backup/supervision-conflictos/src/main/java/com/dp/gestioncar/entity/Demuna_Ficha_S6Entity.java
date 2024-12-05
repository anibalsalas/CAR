package com.dp.gestioncar.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car_ficha_s6", schema = "SIGA")

public class Demuna_Ficha_S6Entity implements Serializable {
    @Id
    public Integer id_ficha_s6;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s6;

      private String usu_valida;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_valida;
    
    private String p6_2;	
    private Integer p6_3_bolivia;
    private Integer p6_3_chile;
    private Integer p6_3_colo;
    private Integer p6_3_ecu;
    private Integer p6_3_vene;
    private Integer p6_3_otros;
    private Integer p6_3_total;

    private String p6_4_1;
    private String p6_4_1_a;
    private String p6_4_1_b;
    private String p6_4_1_c;
    private String p6_4_1_d;
    private Integer p6_4_1_cantidad_a;	
    private Integer p6_4_1_cantidad_b;	
    private Integer p6_4_1_cantidad_c;	
    private Integer p6_4_1_cantidad_d;	
    private Integer p6_4_2_cantidad;

    private Integer p6_4_3_bolivia;
    private Integer p6_4_3_chile;
    private Integer p6_4_3_colo;
    private Integer p6_4_3_ecu;
    private Integer p6_4_3_vene;
    private Integer p6_4_3_otros;
    private Integer p6_4_3_total;	

  
    private String p6_4_4;	
    private String p6_4_5;	
    private String p6_4_5_sis_respuesta;
    private String p6_4_6;
    
    private String p6_4_7;
    private String p6_4_8;
    private String p6_4_8_otro;
    private String p6_4_9_a;
    private String p6_4_9_b;
    private String p6_4_9_c;
    private String p6_4_9_d;
    private String p6_4_9_e;
    private String p6_4_9_f;
    private String p6_4_9_otro;
    private String p6_4_10;
    private String p6_4_11;
    private String p6_4_11_otro;
    private String p6_4_12_a;
    private String p6_4_12_b;
    private String p6_4_12_c;
    private String p6_4_12_d;
    private String p6_4_12_e;
    private String p6_4_12_f;
    private String p6_4_12_otro;

    private String p6_4_13;
    private String p6_4_14_a;
    private String p6_4_14_b;
    private String p6_4_14_c;
    private String p6_4_14_otro;
    private String p6_4_15;
    private String p6_4_16;
    private String p6_4_17;
    private String p6_4_18;
    private String p6_4_19;
    private String p6_4_20;
    private String p6_4_20_otro;
    private String p6_4_21_a;
    private String p6_4_21_b;
    private String p6_4_21_c;
    private String p6_4_21_d;
    private String p6_4_22;
    private String p6_4_5a_otro;
    private String p6_4_5expe;
    private String p6_4_5_amerita;


}
