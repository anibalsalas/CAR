/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestioncar.repository;


import com.dp.gestioncar.entity.Educa_Ficha_S5_9Entity;
import com.dp.gestioncar.entity.Educa_Ficha_S5_9PkEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author asalas
 */

public interface Educa_Ficha_S5_9Repository extends JpaRepository<Educa_Ficha_S5_9Entity, Educa_Ficha_S5_9PkEntity> {

    @Query(value = "select nvl(max(id),0) + 1 from siga.educa_ficha_s5_gabinete where id_ficha=:id_ficha", nativeQuery = true)
    public Integer generarIdS5_9(@Param("id_ficha") Integer id_ficha);

    @Query(value = "select f from Educa_Ficha_S5_9Entity f where f.educa_ficha_s5_9pk.id_ficha=:id_ficha order by 1 asc")
    public List<Educa_Ficha_S5_9Entity> listarS5_9ByIdFichaGrupo(@Param("id_ficha") Integer id_ficha);

}