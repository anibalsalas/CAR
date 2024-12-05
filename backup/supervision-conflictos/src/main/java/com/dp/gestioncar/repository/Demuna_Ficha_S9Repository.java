package com.dp.gestioncar.repository;

import com.dp.gestioncar.entity.Demuna_Ficha_S7Entity;
import com.dp.gestioncar.entity.Demuna_Ficha_S9Entity;
import com.dp.gestioncar.entity.Demuna_Ficha_S9Entity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Demuna_Ficha_S9Repository extends JpaRepository<Demuna_Ficha_S9Entity, Integer> {

    @Query(value = "select nvl(max(id_ficha_s9),0) + 1 from siga.car_ficha_s9", nativeQuery = true)
    public Integer generarIdFichaS9();

    @Query(value = "select f from Demuna_Ficha_S9Entity f where f.id_ficha=:id_ficha")
    public Demuna_Ficha_S9Entity getFichaS9ByIdFicha(@Param("id_ficha") Integer id_ficha);

    @Transactional
    @Modifying
    @Query(value = "update siga.car_ficha_s9 f set f.estado_s9 = '1', f.usu_valida=:usu_valida, f.fch_valida=sysdate where f.id_ficha=:id_ficha and f.id_ficha_s9=:id_ficha_s9", nativeQuery = true)
    public void validarSec9(@Param("id_ficha") Integer id_ficha, @Param("id_ficha_s9") Integer id_ficha_s9, @Param("usu_valida") String usu_valida);

}
