package com.uce.edu.demo.supermaxi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermaxi.modelo.Venta;
import com.uce.edu.demo.supermaxi.repository.IProductoRepository;
import com.uce.edu.demo.supermaxi.repository.IVentaRepository;
@Service
public class VentaServiceImpl implements IVentaService {
	
	@Autowired
	private IVentaRepository ventaRepository;
	@Autowired
	private IProductoRepository productoRepository;
	
	@Override
	public void realizarVenta(Venta v) {
		// TODO Auto-generated method stub
		
	}

}
