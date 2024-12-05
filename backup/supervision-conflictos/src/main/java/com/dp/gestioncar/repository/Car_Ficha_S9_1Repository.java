/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestioncar.repository;


import com.dp.gestioncar.entity.Car_Ficha_S9_P9_1Entity;
import com.dp.gestioncar.entity.Car_Ficha_S9_P9_1PkEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author asalas
 */

public interface Car_Ficha_S9_1Repository extends JpaRepository<Car_Ficha_S9_P9_1Entity, Car_Ficha_S9_P9_1PkEntity> {

    @Query(value = "select nvl(max(id),0) + 1 from siga.car_ficha_s9_p9_1 where id_ficha=:id_ficha", nativeQuery = true)
    public Integer generarIdS9_1(@Param("id_ficha") Integer id_ficha);

    @Query(value = "select f from Car_Ficha_S9_P9_1Entity f where f.car_ficha_s9_p9_1pk.id_ficha=:id_ficha order by 1 asc")
    public List<Car_Ficha_S9_P9_1Entity> listarS9_1ByIdFichaGrupo(@Param("id_ficha") Integer id_ficha);



}