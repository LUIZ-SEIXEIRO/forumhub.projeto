
package com.example.forumhub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;

    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Topico(String titulo, String mensagem) {
        this.titulo = titulo;
        this.mensagem = mensagem;
    }
}
                                    