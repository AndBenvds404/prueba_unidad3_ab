package com.uce.edu.demo.supermaxi.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermaxi.modelo.Producto;
import com.uce.edu.demo.supermaxi.modelo.Venta;
@Service
public class GestorSupermaxiImpl implements IGestorSupermaxi{
	
	@Autowired
	private IProductoService productoService;
	@Autowired
	private IVentaService ventaService;
	

	@Override
	public void realizarVenta(String codigoDeBarras, Integer cantidad, String cedulaCliente, String numeroDeVenta) {
		// TODO Auto-generated method stub
		Producto prod = this.productoService.buscarProductoBarra(codigoDeBarras);
		Integer stock = prod.getStock();
		if (stock >= cantidad) {
			
			Venta v = new Venta();
			v.setNumero(numeroDeVenta);
			v.setFecha(LocalDateTime.now());
			v.setCedulaCliente(cedulaCliente);
			BigDecimal total= prod.getPrecio().multiply(new BigDecimal(cantidad));
			v.setTotalVenta(total);
			this.ventaService.realizarVenta(v);
			
		}else {
			
		}
	}

	@Override
	public void reporteVentas(LocalDateTime fechaVenta, String categoriaProducto, Integer cantidad) {
		// TODO Auto-generated method stub
		
	}
	
	

}
