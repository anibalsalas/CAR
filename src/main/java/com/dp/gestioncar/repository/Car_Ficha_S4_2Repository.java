/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestioncar.repository;


import com.dp.gestioncar.entity.Car_Ficha_S4_P4_2Entity;
import com.dp.gestioncar.entity.Car_Ficha_S4_P4_2PkEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author asalas
 */

public interface Car_Ficha_S4_2Repository extends JpaRepository<Car_Ficha_S4_P4_2Entity, Car_Ficha_S4_P4_2PkEntity> {

    @Query(value = "select nvl(max(id),0) + 1 from siga.car_ficha_s4_p4_2 where id_ficha=:id_ficha", nativeQuery = true)
    public Integer generarIdS4_2(@Param("id_ficha") Integer id_ficha);

    @Query(value = "select f from Car_Ficha_S4_P4_2Entity f where f.car_ficha_s4_p4_2pk.id_ficha=:id_ficha order by 1 asc")
    public List<Car_Ficha_S4_P4_2Entity> listarS4_2ByIdFichaGrupo(@Param("id_ficha") Integer id_ficha);



}