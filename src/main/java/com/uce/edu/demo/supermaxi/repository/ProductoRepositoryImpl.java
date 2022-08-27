package com.uce.edu.demo.supermaxi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.supermaxi.modelo.Producto;
@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository{

	Logger log = LoggerFactory.getLogger(ProductoRepositoryImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarProducto(Producto poducto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(poducto);
	}
	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}
	@Override
	public Producto buscarProductoBarra(String codigoBarra) {
		
			try {
				TypedQuery<Producto> miTypedQuery = (TypedQuery<Producto>) this.entityManager
						.createQuery("SELECT p FROM Producto p  WHERE p.codigoBarras = :datocodigoBarra", Producto.class);
				miTypedQuery.setParameter("datocodigoBarra", codigoBarra);
				return miTypedQuery.getSingleResult();
			}catch(NoResultException e) {
				log.info("no hay stock");
				return null;
			}
	}

	@Override
	public Producto buscarProductoStock(Integer stock) {
		// TODO Auto-generated method stub
		return null;
	}

	




}
