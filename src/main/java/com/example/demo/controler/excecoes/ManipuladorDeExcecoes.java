package com.example.demo.controler.excecoes;

import com.example.demo.service.excecoes.ErroPadrao;
import com.example.demo.service.excecoes.ExcecoesDeDominio;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ManipuladorDeExcecoes {
    public ManipuladorDeExcecoes() {
    }

    @ExceptionHandler(ExcecoesDeDominio.class)
    public ResponseEntity<ErroPadrao> objetoNaoEncontrado(ExcecoesDeDominio e, HttpServletRequest request){
        ErroPadrao erro = new ErroPadrao(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }
}