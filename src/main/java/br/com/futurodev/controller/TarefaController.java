package br.com.futurodev.controller;

import br.com.futurodev.entity.Tarefa;
import br.com.futurodev.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;


    @PostMapping
    public Tarefa post(@RequestBody Tarefa tarefa) {
        return tarefaService.salvarTarefas(tarefa);
    }

    @GetMapping
    public List<Tarefa> get(){
        return tarefaService.buscarTarefas();
    }

    @PutMapping("/{id}")
    public Tarefa put(@PathVariable Long id, @RequestBody Tarefa tarefa ) {
        return this.tarefaService.atualizarTarefa(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        this.tarefaService.apagarPorId(id);
    }
}
