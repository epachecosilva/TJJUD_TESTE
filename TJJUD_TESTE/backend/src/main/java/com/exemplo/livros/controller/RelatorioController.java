package com.exemplo.livros.controller;

import com.exemplo.livros.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/relatorio")
public class RelatorioController {
    @Autowired
    private RelatorioService relatorioService;

    @GetMapping
    public ResponseEntity<byte[]> gerarRelatorio() {
        byte[] pdf = relatorioService.gerarRelatorioLivros();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("filename", "relatorio_livros.pdf");
        return new ResponseEntity<>(pdf, headers, HttpStatus.OK);
    }
} 