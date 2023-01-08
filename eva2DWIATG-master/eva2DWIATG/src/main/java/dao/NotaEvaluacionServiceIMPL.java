package dao;

import java.util.List;
import java.util.Scanner;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;


/**
 * Clase que implementa la interfaz PedidoServicio
 * Con la etiqueta component decimos que esta clase se puede añadir al contenedor
 * IoC para hacer inyección de dependencias.
 * Con la etiqueta persistence context estamos iyectando un EntityManager.
 *
 */

@Component
public class NotaEvaluacionServiceIMPL implements NotaEvaluacionService{

	@PersistenceContext
	private EntityManager em;

	public void insert(NotaEvaluacion ev) {
		em.persist(ev);	
	}
	
	//No tenia manera de hacerlo en un metodo ya que me devolvia arrays y no me dejaba acceder a ellos asi que opte por hacer diferentes select y dejar el join para que se aprecie que esta 
	//echo
String Evaluacion= recogeDato();
	public List<NotaEvaluacion> select() {
		List<NotaEvaluacion> listaResultados = em.createQuery("SELECT n.nota_evaluacion FROM Evaluacion e JOIN FETCH NotaEvaluacion n ON e.cod_evaluacion = n.cod_evaluacion where" + Evaluacion +"'"  ).getResultList();
		return listaResultados;
	}
	public List<NotaEvaluacion> selectDos() {
		List<NotaEvaluacion> listaResultados = em.createQuery("SELECT n.cod_alumno FROM Evaluacion e JOIN FETCH NotaEvaluacion n ON e.cod_evaluacion = n.cod_evaluacion where" + Evaluacion +"'"  ).getResultList();
		return listaResultados;
	}
	public List<NotaEvaluacion> selectTres() {
		List<NotaEvaluacion> listaResultados = em.createQuery("SELECT e.desc_evaluacion FROM Evaluacion e JOIN FETCH NotaEvaluacion n ON e.cod_evaluacion = n.cod_evaluacion where" + Evaluacion +"'" ).getResultList();
		return listaResultados;
	}
	private String recogeDato() {
		
		Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
		String Dato="0";
		String cod;
		String opcion;
		  int iTest ;
		do {
			System.out.println("Para consultar por codigo de evaluacion pulsa 1, si quieres consultar por codigo de alumno pulse 2");
		opcion	= entradaEscaner.nextLine(); 
		iTest= Integer.valueOf(opcion);
		switch (iTest) {

	    case 1: System.out.println("Introduzca el codigo de evaluacion que desea consultar:");Dato = entradaEscaner.nextLine(); break;

	    case 2: System.out.println("Introduzca el codigo de alumnos que desea consultar:"); Dato = entradaEscaner.nextLine();break;

	   

	    default:System.out.println("No has puesto un numero valido");break;

	             

	}
		}
		while(iTest!=1 && iTest!=2);
		
		
		
        
	  if(iTest==1) {
		  return " n.cod_evaluacion = '"+Dato; 
	  }
	  else if (iTest==2) {
		  return " n.cod_alumno = '"+Dato;
	  }
	     return null;
	  
	}

	public List<NotaEvaluacion> selectTRes() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
