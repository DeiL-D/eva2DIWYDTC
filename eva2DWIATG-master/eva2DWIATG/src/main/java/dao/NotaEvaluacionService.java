package dao;

import java.util.List;

/**
 * Interfaz que actúa sobre PedidoDao
 * Tan solo se define la signatura de los métodos que actuarán sobre
 * PedidoDao, la implementación se define en PedidoServicioImpl
 *
 */
public interface NotaEvaluacionService {
	
	/**
	 * Método que inserta un nuevo pedido en base de datos.
	 * @param pedido
	 */
	public void insert(NotaEvaluacion ev);
	
	/**
	 * Método que trae todos los registros de la tabla ped_tbh_pedidos
	 * @return 
	 */
	public List<NotaEvaluacion> select();
	public List<NotaEvaluacion> selectDos();
	public List<NotaEvaluacion> selectTRes();
	
}