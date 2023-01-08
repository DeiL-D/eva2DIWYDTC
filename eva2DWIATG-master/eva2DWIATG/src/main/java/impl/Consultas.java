package impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import dao.NotaEvaluacion;
import dao.NotaEvaluacionServiceIMPL;



/**
 * Clase que agrupa las transacaciones contra base de datos.
 * La etiqueta autowired nos permite hacer inyección de dependencia de la clase
 * PedidoServicioImpl.
 * La etiqueta Transactional automatiza la gestión de la transacción.
 *
 */
@Component
public class Consultas{

	@Autowired
	private NotaEvaluacionServiceIMPL psi;
	
	@Transactional
	public void insertarUnPedido(NotaEvaluacion ev) {
		psi.insert(ev);
	}	
	
	@Transactional
	public List<NotaEvaluacion> Evaluacion() {
		return psi.select();
	}
	@Transactional
	public List<NotaEvaluacion> EvaluacionDos() {
		return psi.selectDos();
	}
	@Transactional
	public List<NotaEvaluacion> EvaluacionTres() {
		return psi.selectTres();
	}
	
}
