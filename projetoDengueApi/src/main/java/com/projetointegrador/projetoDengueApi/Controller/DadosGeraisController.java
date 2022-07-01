package com.projetointegrador.projetoDengueApi.Controller;

import com.projetointegrador.projetoDengueApi.Entitys.DadosGerais;
import com.projetointegrador.projetoDengueApi.Services.DadosGeraisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "dadosGerais")
public class DadosGeraisController {
    //INJEÇÃO DEPENDENCIA
    private  DadosGeraisService dadosGeraisService;

    @Autowired
    public DadosGeraisController(DadosGeraisService dadosGeraisService) {
        this.dadosGeraisService = dadosGeraisService;
    }
    //GET
    @GetMapping
    public List<DadosGerais> getDadosGerais(){
        return dadosGeraisService.getDadosGerais();
    }
    //POST
    @PostMapping()
    public void registerNewDadosGerais(@RequestBody DadosGerais dadosGerais){
        dadosGeraisService.addNewDadosGerais(dadosGerais);
    }
    //PUT
    @PutMapping(path = "{dadosGeraisId}")
    public void updateDadosGerais(
            @PathVariable("dadosGeraisId") Long dadosGeraisId,
            @RequestParam(required=false)String nome,
            @RequestParam(required=false)String cartaoSUS,
            @RequestParam(required=false)String agravoDoenca,
            @RequestParam(required=false)String dataNotificacao,
            @RequestParam(required=false)String municipioNotificacao){
        dadosGeraisService.updateDadosGerais(dadosGeraisId,nome,cartaoSUS,agravoDoenca,dataNotificacao,municipioNotificacao);
    }
    //DELETE
    @DeleteMapping(path = "{dadosId}")
    public void deleteDadosGerais(@PathVariable("dadosId")Long dadosGeraisId){
        dadosGeraisService.deletarDadosGerais(dadosGeraisId);
    }
}
