package com.uce.edu.demo.supermaxi.repository;

import java.util.List;

import com.uce.edu.demo.supermaxi.modelo.Producto;

public interface IProductoRepository {

	public void insertarProducto(Producto poducto);
	public void actualizarProducto(Producto producto);
	public Producto buscarProductoBarra(String codigoBarra);
	public Producto buscarProductoStock(Integer stock);


}
