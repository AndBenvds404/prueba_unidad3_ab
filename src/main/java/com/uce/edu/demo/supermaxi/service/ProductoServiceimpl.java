package com.uce.edu.demo.supermaxi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermaxi.modelo.Producto;
import com.uce.edu.demo.supermaxi.repository.IProductoRepository;
@Service
public class ProductoServiceimpl implements IProductoService{

	@Autowired
	private IProductoRepository productoRepository;
	
	@Override
	public void insertar(Producto p) {
    
		// TODO Auto-generated method stub
		Producto prod = this.productoRepository.buscarProductoBarra(p.getCodigoBarras());
		if (prod==null) {
			this.productoRepository.insertarProducto(p);
		}else {
			Integer stockactual = prod.getStock()+p.getStock();
			prod.setStock(stockactual);
			this.productoRepository.actualizarProducto(prod);
		}
		
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		this.productoRepository.actualizarProducto(p);
	}

	@Override
	public Producto buscarProductoBarra(String codigoBarra) {
		// TODO Auto-generated method stub
		return this.productoRepository.buscarProductoBarra(codigoBarra);
	}

	@Override
	public Producto buscarProductoStock(Integer stock) {
		// TODO Auto-generated method stub
		return this.productoRepository.buscarProductoStock(stock);
	}

	@Override
	public List<Producto> obtnerProductos() {
		// TODO Auto-generated method stub
		return this.obtnerProductos();
	}

	@Override
	public Producto buscarProductoParametros(String barra, String nombre, String categria, Integer stock) {
		// TODO Auto-generated method stub
		return this.buscarProductoParametros(barra, nombre, categria, stock);
	}

	
	
	

}
