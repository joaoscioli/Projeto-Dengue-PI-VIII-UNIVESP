package com.projetointegrador.projetoDengueApi.Services;

import com.projetointegrador.projetoDengueApi.Entitys.DadosGerais;
import com.projetointegrador.projetoDengueApi.Repositorys.DadosGeraisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DadosGeraisService {
    //INJEÇÃO DEPENDENCIA
    private final DadosGeraisRepository dadosGeraisRepository;

    @Autowired
    public DadosGeraisService(DadosGeraisRepository dadosGeraisRepository) {
        this.dadosGeraisRepository = dadosGeraisRepository;
    }
    //GET Dados Gerais
    public List<DadosGerais> getDadosGerais(){
        return dadosGeraisRepository.findAll();
    }
    //POST Adicionar Dados Gerais
    public void addNewDadosGerais(DadosGerais dadosGerais){
        Optional<DadosGerais> dadosGeraisOptional = dadosGeraisRepository
                .findById(dadosGerais.getId());
        if(dadosGeraisOptional.isPresent()){
            throw new IllegalStateException("ID Já Existe");
        }
        dadosGeraisRepository.save(dadosGerais);
    }
    //DELETE
    public void deletarDadosGerais(Long dadosGeraisId){
        boolean exists = dadosGeraisRepository.existsById(dadosGeraisId);
        if(!exists){
            throw new IllegalStateException("Dados Gerais com ID "+dadosGeraisId+" não existe");
        }
        dadosGeraisRepository.deleteById(dadosGeraisId);
    }
    //PUT
    @Transactional
    public void updateDadosGerais(Long dadosGeraisId, String nome,
                                  String cartaoSUS, String agravoDoenca,
                                  String dataNotificacao, String municipioNotificacao) {
        DadosGerais dadosGerais = dadosGeraisRepository.findById(dadosGeraisId)
                .orElseThrow(() -> new IllegalStateException(
                        "Dados Gerais com Id " + dadosGeraisId + " não existe"));

        if (nome != null &&
                nome.length() > 0 &&
                !Objects.equals(dadosGerais.getNome(), nome)) {
            dadosGerais.setNome(nome);
        }

        if (cartaoSUS != null &&
                cartaoSUS.length() > 0 &&
                !Objects.equals(dadosGerais.getCartaoSUS(), cartaoSUS)) {
            dadosGerais.setCartaoSUS(cartaoSUS);
        }

        if (agravoDoenca != null &&
                agravoDoenca.length() > 0 &&
                !Objects.equals(dadosGerais.getAgravoDoenca(), agravoDoenca)) {
            dadosGerais.setAgravoDoenca(agravoDoenca);
        }

        if (dataNotificacao != null &&
                dataNotificacao.length() > 0 &&
                !Objects.equals(dadosGerais.getDataNotificacao(), dataNotificacao)) {
            dadosGerais.setDataNotificacao(dataNotificacao);
        }

        if (municipioNotificacao != null &&
                municipioNotificacao.length() > 0 &&
                !Objects.equals(dadosGerais.getMunicipioNotificacao(), municipioNotificacao)) {
            dadosGerais.setMunicipioNotificacao(municipioNotificacao);
        }

    }

}



