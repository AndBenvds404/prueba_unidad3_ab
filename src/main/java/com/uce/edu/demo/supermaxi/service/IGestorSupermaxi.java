package com.uce.edu.demo.supermaxi.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.supermaxi.modelo.Producto;

public interface IGestorSupermaxi {
	

	void realizarVenta(String codigoDeBarras, Integer cantidad, String cedulaCliente, String numeroDeVenta);
	void reporteVentas(LocalDateTime fechaVenta, String categoriaProducto, Integer cantidad);

}
