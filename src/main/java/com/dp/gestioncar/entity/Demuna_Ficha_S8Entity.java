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
@Table(name = "car_ficha_s8", schema = "SIGA")

public class Demuna_Ficha_S8Entity implements Serializable {
    @Id
    public Integer id_ficha_s8;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s8;
    
       private String usu_valida;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_valida;
    
    private String p8_1;
    private String p8_2;
    private String p8_2_otro;
    private String p8_3;
    private String p8_4;
    private String p8_5;
    private String p8_5_otro;
    private String p8_6;
    private String p8_7;
    private String p8_7_otro;
    private String p8_8;
    private String p8_9;
    private String p8_9_otro;
    private String p8_10;
    private String p8_11;
    private String p8_12;
    private String p8_12_otro;
    private String p8_13;
    private String p8_14_a;
    private String p8_14_b;
    private String p8_14_c;
    private String p8_14_d;
    private String p8_14_e;
    private String p8_14_f;
    private String p8_14_g;
    private String p8_14_h;
    private String p8_14_i;

  @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S8' and ea.nom_campo = 'S8_11_ARCH')")
    private Integer s8_11_arch_id_archivo;

  
  
@Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S8' and ea.nom_campo = 'S8_13_ARCH')")
    private Integer s8_13_arch_id_archivo;


@Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S8' and ea.nom_campo = 'S8_14_ARCH')")
    private Integer s8_14_arch_id_archivo;


}