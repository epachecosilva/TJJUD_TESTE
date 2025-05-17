package com.exemplo.livros.service;

import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.HashMap;

@Service
public class RelatorioService {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private ResourceLoader resourceLoader;

    public byte[] gerarRelatorioLivros() {
        try {
            InputStream inputStream = resourceLoader.getResource("classpath:relatorioLivros.jrxml").getInputStream();
            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), dataSource.getConnection());
            return JasperExportManager.exportReportToPdf(jasperPrint);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar relatório: " + e.getMessage(), e);
        }
    }
} 