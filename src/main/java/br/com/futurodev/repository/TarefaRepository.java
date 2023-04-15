package br.com.futurodev.repository;

import br.com.futurodev.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> { //porque long e não string
                                                            //Long é o tipo do id
}
