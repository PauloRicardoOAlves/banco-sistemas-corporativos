package com.example.banco.controller;

import com.example.banco.model.Transacao;
import com.example.banco.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @GetMapping
    public List<Transacao> listar(){
        return service.listar();
    }

    @PostMapping
    public Transacao salvar (@RequestBody Transacao t){
        System.out.println(t);
        return service.salvar(t);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
