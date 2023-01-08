package controlador;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import dao.NotaEvaluacion;
import impl.Consultas;



@Controller
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); //Creación de un objeto Scanner
//variables
		List<NotaEvaluacion> cod;
		List<NotaEvaluacion> desc;
		List<NotaEvaluacion> nota;
		//Obtenemos el contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		//Añadimos a nuestra clase consulta el contexto
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		nota = consulta.Evaluacion();
		desc = consulta.EvaluacionTres();
		cod = consulta.EvaluacionDos();
		for (int i=0 ;i< cod.size(); i++) {
			System.out.println(" Codigo del alumno:              "+cod.get(i) + "        Evaluacion:           " + desc.get(i)+ "       nota del alumno:         " + nota.get(i));
		}
		System.out.println("A continuacion itroduce los valores que te pidan para la introduccion correcta de datos");
		System.out.println("Introduce el nombre: ");
		String nombre=sc.next();
        System.out.println("Introduce el codigo de la evaluación");
		String evaluacion=sc.next();
		System.out.println("Introduce la nota de dicha evaluación");
		int coda=sc.nextInt();
		//insertamos
		dto.NotaEv evDTO = new dto.NotaEv(nombre, coda, evaluacion,81);
		//igualamos las variables de tipo NotasEvaluacions a la lista que devolvemos en cada select
		
		//Consulta y paso de DTO a DAO
		consulta.insertarUnPedido(toDAO.DTONotaEvToDAO.convert(evDTO));
		
		
	}

}
