package com.example.banco.service;

import com.example.banco.model.Transacao;
import com.example.banco.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repo;

    public List<Transacao> listar() {
        return repo.findAll();
    }

    public Transacao salvar(Transacao t){
        return repo.save(t);
    }

    public void deletar (Long id){
        repo.deleteById(id);
    }
}
