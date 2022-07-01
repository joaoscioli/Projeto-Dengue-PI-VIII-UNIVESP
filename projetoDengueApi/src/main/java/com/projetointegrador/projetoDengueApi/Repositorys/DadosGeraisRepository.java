package com.projetointegrador.projetoDengueApi.Repositorys;

import com.projetointegrador.projetoDengueApi.Entitys.DadosGerais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosGeraisRepository extends JpaRepository<DadosGerais,Long> {

}
