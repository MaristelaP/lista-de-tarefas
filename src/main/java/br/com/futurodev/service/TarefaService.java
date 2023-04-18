package br.com.futurodev.service;

import br.com.futurodev.entity.Tarefa;
import br.com.futurodev.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;


    public Tarefa salvarTarefas(Tarefa tarefa) {

        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> buscarTarefas(){
        return tarefaRepository.findAll();
    }

    public Tarefa atualizarTarefa(Long id, Tarefa tarefaAtualizada) {
        Optional<Tarefa> tarefaPesquisada = this.tarefaRepository.findById(id);

        if(tarefaPesquisada.isPresent()) {
            tarefaPesquisada.get().setNome(tarefaAtualizada.getNome());
            return this.tarefaRepository.save(tarefaPesquisada.get());
        }
        return null;
    }

    public void apagarPorId(Long id) {
        this.tarefaRepository.deleteById(id);
    }
}
