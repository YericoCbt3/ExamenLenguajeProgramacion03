package com.example.demo.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Libros;
import com.example.demo.service.LibrosService;

import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

@Controller 
@RequestMapping("/reporte")
public class ReporteController {

	@Autowired
	private LibrosService librosservice;
	
	@GetMapping("/reporto")
	public void reporte (HttpServletResponse response) throws JRException, IOException {
		InputStream jasperStream = this.getClass().getResourceAsStream("/Reportes/reporto.jasper");
		Map<String, Object> params = new HashMap<>();

	    
	    List<Libros> listLibro = librosservice.getAllLibros();
	    
	    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listLibro);
	    JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
        
        response.setContentType("application/x-pdf");
        response.setHeader("Content-disposition", "filename=reporte_Libro.pdf");
        final OutputStream outputStream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
	}
}
