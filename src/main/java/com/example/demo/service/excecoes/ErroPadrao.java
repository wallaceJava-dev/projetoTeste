package com.example.demo.service.excecoes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ErroPadrao {
    private final LocalDateTime tempoErro;
    private final int status;
    private final String erro;
    private final String mensagem;

}