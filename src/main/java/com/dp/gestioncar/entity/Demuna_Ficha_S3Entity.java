package com.dp.gestioncar.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car_ficha_s3", schema = "SIGA")
public class Demuna_Ficha_S3Entity implements Serializable {
    @Id
    public Integer id_ficha_s3;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    
    private String estado_s3;
    
    private String usu_valida;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_valida;
  
    private Integer p3_1_1;
    private String p3_1_2;
    private String p3_1_2_otro;
    private String p3_1_3;
    private Integer p3_1_3_otro;
    private String p3_1_4;
    private Integer p3_1_4_otro;
    private String p3_1_5;
    private Integer p3_1_5_otro;
    
    private String p3_1_6;
    private Integer p3_1_7_bolivia_cantidad;
    private Integer p3_1_7_chile_cantidad;
    private Integer p3_1_7_colo_cantidad;
    private Integer p3_1_7_ecu_cantidad;
    private Integer p3_1_7_vene_cantidad;
    private Integer p3_1_7_otro_cantidad;
    private Integer p3_1_7_total;
    
    private String p3_2_1;
    
    private Integer p3_2_2_bolivia_cantidad;
    private Integer p3_2_2_chile_cantidad;
    private Integer p3_2_2_colo_cantidad;
    private Integer p3_2_2_ecu_cantidad;
    private Integer p3_2_2_vene_cantidad;
    private Integer p3_2_2_otro_cantidad;
    private Integer p3_2_2_total;	
    
    private String p3_3_1;

   private Integer p3_3_2_bolivia_cantidad;	
   private Integer p3_3_2_chile_cantidad;
   private Integer p3_3_2_colo_cantidad;
   private Integer p3_3_2_ecu_cantidad;
   private Integer p3_3_2_vene_cantidad;
   private Integer p3_3_2_otro_cantidad;
   private Integer p3_3_2_total;	
            
   
    private String p3_4_1;		
    private String p3_4_2;		
    private String p3_4_3;		
    private String p3_4_4;		
    private String p3_4_5;	
    private String p3_4_6;
    private String p3_4_6_cual;
    private String p3_4_6_otro;
    private String p3_4_7;
    private String p3_4_8;
    private String p3_4_8_otro;
    private Integer p3_4_9_horas;
    private String p3_4_10;



//      @DateTimeFormat(pattern = "dd/MM/yyyy")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date p1_12_fecha_ocurrencia;

}


//  p3_3           char(1 byte),
//  p3_3_obser     varchar2(1100 byte),
//  p3_4           char(1 byte),
//  p3_4_obser     varchar2(1100 byte),
//  p3_5           char(1 byte),
//  p3_5_obser     varchar2(1100 byte),
//  p3_6           char(1 byte),
//  p3_6_obser     varchar2(1100 byte),
//  p3_6_1         char(1 byte),
//  p3_7_luz       char(1 byte),
//  p3_7_agua      char(1 byte),
//  p3_7_tel       char(1 byte),
//  p3_7_inter     char(1 byte),
//  p3_8           char(1 byte)