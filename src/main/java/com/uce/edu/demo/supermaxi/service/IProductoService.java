package com.uce.edu.demo.supermaxi.service;

import java.util.List;

import com.uce.edu.demo.supermaxi.modelo.Producto;

public interface IProductoService {
	
	public void insertar(Producto poducto);
	public void actualizar(Producto producto);
	public Producto buscarProductoBarra(String codigoBarra);
	public Producto buscarProductoStock(Integer stock);
	public List<Producto> obtnerProductos();

	public Producto buscarProductoParametros(String barra, String nombre,String categria, Integer stock);

	

}
