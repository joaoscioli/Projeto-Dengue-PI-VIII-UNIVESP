package com.projetointegrador.projetoDengueApi.Config;

import com.projetointegrador.projetoDengueApi.Entitys.DadosGerais;
import com.projetointegrador.projetoDengueApi.Repositorys.DadosGeraisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ApiConfig {
    @Bean
    CommandLineRunner commandLineRunner
            (DadosGeraisRepository repository){
        return args -> {
            DadosGerais maria = new DadosGerais(
                    "Maria Elisa Samuel",
                    "#19210443",
                    "Chikungunya",
                    "23/01/21",
                    "Sorocaba"
            );
            DadosGerais joao = new DadosGerais(
                    "João Henrique Fiho",
                    "#12148490",
                    "Dengue",
                    "12/02/21",
                    "Sorocaba"
            );
            DadosGerais rosa = new DadosGerais(
                    "Rosa Maria",
                    "#89654213",
                    "Dengue",
                    "20/02/21",
                    "Sorocaba"
            );
            DadosGerais flavia = new DadosGerais(
                    "Flavia Rocha",
                    "#98361233",
                    "Dengue",
                    "01/03/21",
                    "Sorocaba"
            );
            DadosGerais michael = new DadosGerais(
                    "Michael Filho",
                    "#12344341",
                    "Dengue",
                    "11/03/21",
                    "Sorocaba"
            );
            DadosGerais clademir = new DadosGerais(
                    "Clademir Fiho",
                    "#83742843",
                    "Dengue",
                    "12/02/21",
                    "Sorocaba"
            );
            DadosGerais fernanda = new DadosGerais(
                    "Fernarda Ribeiro",
                    "#14834953",
                    "Chikungunya",
                    "11/02/21",
                    "Sorocaba"
            );
            DadosGerais gabriel = new DadosGerais(
                    "Gablriel Aparecido",
                    "#80948534",
                    "Chikungunya",
                    "10/02/21",
                    "Sorocaba"
            );
            DadosGerais paulo = new DadosGerais(
                    "Paulo Henrique",
                    "#87463123",
                    "Chikungunya",
                    "03/04/21",
                    "Sorocaba"
            );
            repository.saveAll(
                    List.of(maria,joao,rosa,flavia,michael,clademir,fernanda,gabriel,paulo)
            );
        };
    }
}
