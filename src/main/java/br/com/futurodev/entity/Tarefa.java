package br.com.futurodev.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarefa_id")
    private Long id;

    @Column(length = 35, nullable = false)
    private String nome;

    @Column(nullable = false)
    private String dia;

    @Column(nullable = false)
    private String hora;

    @Column(length = 45)
    private String descricao;


}
