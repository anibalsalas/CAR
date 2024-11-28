/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestioncar.repository;


import com.dp.gestioncar.entity.Car_Ficha_S3_P3_3Entity;
import com.dp.gestioncar.entity.Car_Ficha_S3_P3_3PkEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author asalas
 */

public interface Car_Ficha_S3_3Repository extends JpaRepository<Car_Ficha_S3_P3_3Entity, Car_Ficha_S3_P3_3PkEntity> {

    @Query(value = "select nvl(max(id),0) + 1 from siga.car_ficha_s3_p3_3 where id_ficha=:id_ficha", nativeQuery = true)
    public Integer generarIdS3_3(@Param("id_ficha") Integer id_ficha);

    @Query(value = "select f from Car_Ficha_S3_P3_3Entity f where f.car_ficha_s3_p3_3pk.id_ficha=:id_ficha order by 1 asc")
    public List<Car_Ficha_S3_P3_3Entity> listarS3_3ByIdFichaGrupo(@Param("id_ficha") Integer id_ficha);



}