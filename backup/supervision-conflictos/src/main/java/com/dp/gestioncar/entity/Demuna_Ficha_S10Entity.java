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
@Table(name = "car_ficha_s10", schema = "SIGA")

public class Demuna_Ficha_S10Entity implements Serializable {
    @Id
    public Integer id_ficha_s10;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s10;
    
    
       private String usu_valida;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_valida;
    

    private String p10_1_1;
    private String p10_1_2;
    private String p10_1_3;
    private String p10_1_4;
    private String p10_1_4_otro;
    private String p10_1_5;
    private String p10_1_6;
    private String p10_1_6_otro;
    private String p10_1_7;
    private String p10_1_7_estado;
    private String p10_1_8;
    private String p10_1_8_otro;
    private String p10_1_9;
    private String p10_1_9_estado;
    private String p10_1_10;
     private String p10_1_10_estado;
    private String p10_1_10_otro;
    private String p10_1_11;
    private String p10_1_11_estado;
    private String p10_1_12;
    private String p10_1_12_otro;
    private String p10_1_13;
    private String p10_1_13_estado;
    private String p10_1_14;
    private String p10_1_15;
    private String p10_1_16;
    private String p10_1_16_otro;
    private String p10_1_17;
    private String p10_1_18;
    private String p10_2_1;
    private String p10_2_2;
    private String p10_2_3;
    private String p10_2_4;
    private String p10_2_5;
    private String p10_2_6;
    private String p10_2_7;
    private String p10_2_8;
    private String p10_2_9;
    private String p10_2_10;
    private String p10_2_11;
    private String p10_3_1;
    private String p10_3_2_a;
    private String p10_3_2_b;
    private String p10_3_2_c;
    private String p10_3_2_d;
    private String p10_3_2_e;
    private String p10_3_2_f;
    private String p10_3_2_otro;
    private String p10_3_3;
    private Integer p10_3_3_horas;
    private String p10_3_4;
    private String p10_3_5;
    private String p10_3_6;
    private String p10_3_7_a;
    private String p10_3_7_b;
    private String p10_3_7_c;
    private String p10_3_7_d;
    private String p10_3_7_e;
    private String p10_3_7_f;
    private String p10_3_7_g;
     private String p10_3_7_h;
    private String p10_3_7_otro;
    private Integer p10_3_8_cantidad;
    private String p10_3_9;
    private String p10_3_10;
    private String p10_3_11;
    private String p10_3_12;
    private String p10_3_13;
    private String p10_3_14;
    private String p10_3_15;
    private String p10_3_16;
    private String p10_3_16_operativos;
    
    private String p10_3_17;
    private String p10_3_18;
    private String p10_3_19_a;
    private String p10_3_19_b;
    private String p10_3_19_c;
    private String p10_3_20;
    private String p10_3_21;
    private String p10_3_22;
    private String p10_3_23;
    private String p10_3_24;
    private String p10_3_25;
    private String p10_3_26;
    private String p10_3_26_a;
    private String p10_3_26_b;
    private String p10_3_26_c;
    private String p10_3_26_d;
    private String p10_3_26_e;
    private String p10_3_26_f;
    private String p10_3_26_otro;
    private String p10_3_27;
    private String p10_3_28;
    private String p10_3_28_otro;
    private String p10_4_1;
    private String p10_4_2;
    private String p10_4_3;
    private String p10_4_3_otro;
    private String p10_4_4;
    private String p10_4_5;
    private String p10_4_5_otro;
    private String p10_4_6;
    private String p10_5_1;
    private String p10_5_2;
    private String p10_5_3;
    private String p10_5_4;
    private String p10_5_5_a;
    private String p10_5_5_b;
    private String p10_5_5_c;
    private String p10_5_5_d;
    private String p10_5_5_e;
    private String p10_5_5_otro;
    private String p10_5_6;
    private String p10_5_7;
    private String p10_5_8;
    private String p10_5_9;
    private String p10_5_10;
    private String p10_5_11;
    private String p10_6_1;
    private String p10_6_2;
    private String p10_6_3;
    private String p10_6_4;
    private String p10_6_5;
    private String p10_7_1;
    private String p10_7_2_a;
    private String p10_7_2_b;
    private String p10_7_2_c;
    private String p10_7_3;
    private String p10_7_4;
    private String p10_7_5;
    private String p10_7_6;
    private String p10_7_7;
    private String p10_7_8;
    private String p10_7_9;
    private String p10_7_9_espacio;
    private String p10_8_1;
    private String p10_8_2;
    private String p10_8_3;
    private String p10_8_4;
    private String p10_8_5;
    private String p10_8_6;
    private String p10_obervaciones;
    private String aceptar;
    private String p10_1_12_a;
    private String p10_1_12_b;
    private String p10_1_12_c;
    private String p10_1_12_d;
    private String p10_1_4_a;
    private String p10_1_4_b;
    private String p10_1_4_c;
    private String p10_1_4_d;
    private String  p10_1_6_a;
    private String  p10_1_6_b;
    private String  p10_1_6_c;
    private String  p10_1_6_d;
    private String  p10_1_6_e;
    private String p10_1_8_a;
    private String p10_1_8_b;
    private String p10_1_8_c;
    private String p10_1_8_d;
    private String p10_1_16_a;
    private String p10_1_16_b;
    private String p10_1_16_c;
    private String p10_1_16_d;
    private String p10_1_10_a;
    private String p10_1_10_b;
    private String p10_1_10_c;
    private String p10_1_10_d;
    
    private String p10_3_28_a;
    private String p10_3_28_b;
    private String p10_3_28_c;
    private String p10_3_28_d;
    private String p10_3_28_e;
    private String p10_3_28_f;
    private String nom_funcionario_entrevistado;
    private String cargo_funcionario_entrevistado;
    private String cel_funcionario_entrevistado;
    private String correo_funcionario_entre;
    
    
       @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_1_6_ARCH')")
    private Integer s10_1_6_arch_id_archivo;
       
            @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_1_7_ARCH')")
    private Integer s10_1_7_arch_id_archivo;

               @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_1_10_ARCH')")
    private Integer s10_1_10_arch_id_archivo;
               
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_1_12_ARCH')")
    private Integer s10_1_12_arch_id_archivo;            

   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_1_16_ARCH')")
    private Integer s10_1_16_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_2_ARCH')")
    private Integer s10_2_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_3_23_ARCH')")
    private Integer s10_3_23_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_5_4_ARCH')")
    private Integer s10_5_4_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_6_4_ARCH')")
    private Integer s10_6_4_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_6_5_ARCH')")
    private Integer s10_6_5_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_7_3_ARCH')")
    private Integer s10_7_3_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_7_4_ARCH')")
    private Integer s10_7_4_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_3_28_ARCH')")
    private Integer s10_3_28_arch_id_archivo;   
   
   @Formula("(select count(ea.id_archivo) \n"
    + "from siga.car_archivo ea \n"
    + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S10' and ea.nom_campo = 'S10_8_7_ARCH')")
    private Integer s10_8_7_arch_id_archivo; 
}
