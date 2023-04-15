package br.com.futurodev.service;

import br.com.futurodev.entity.Tarefa;
import br.com.futurodev.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> buscarTarefas(){
        return tarefaRepository.findAll();
    }

    public Tarefa salvarTarefas(Tarefa tarefa) {

        return tarefaRepository.save(tarefa);
    }

    public void apagarPorId(Long id) {
       // this.tarefaRepository.apagarPorId(id);
    }
}
