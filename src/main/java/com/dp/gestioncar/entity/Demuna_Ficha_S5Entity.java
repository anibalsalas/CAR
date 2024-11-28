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
@Table(name = "car_ficha_s5", schema = "SIGA")
public class Demuna_Ficha_S5Entity implements Serializable {
    
    @Id
    public Integer id_ficha_s5;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s5;

    private String usu_valida;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_valida;
    
    private String p5_1;
    private String p5_2;
    private String p5_3;
    private String p5_4;
    private String p5_6;
    private String p5_7;
    
    private Integer p5_5_bolivia;	
    private Integer p5_5_chile;	
    private Integer p5_5_colo;
    private Integer p5_5_ecu;	
    private Integer p5_5_vene;	
    private Integer p5_5_otros;
    private Integer p5_5_total;	


}