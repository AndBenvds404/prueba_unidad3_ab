package com.uce.edu.demo;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.supermaxi.modelo.Producto;
import com.uce.edu.demo.supermaxi.service.IGestorSupermaxi;
import com.uce.edu.demo.supermaxi.service.IProductoService;

@SpringBootApplication
public class PruebaPaU3AbApplication implements CommandLineRunner {

	Logger log = LoggerFactory.getLogger(PruebaPaU3AbApplication.class);
	
	@Autowired
	private IGestorSupermaxi gestorSupermaxi;
	@Autowired
	private IProductoService productoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaU3AbApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		Producto p2 = new Producto();
		p2.setCodigoBarras("0006");
		p2.setNombre("jamon");
		p2.setCategoria("embutido");
		p2.setPrecio(new BigDecimal(3.5));
		p2.setStock(10);
		//si se vuelve a ingresar se sumara al stock en caso de existir el producto
		//caso contario se insertará uno nuevo
		this.productoService.insertar(p2);
	
		
		//this.gestorSupermaxi.realizarVenta("0006", 2, "1727", "12345");
		
	}
	

}
