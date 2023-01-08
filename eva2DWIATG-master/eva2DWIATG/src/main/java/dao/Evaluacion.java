package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DAO para la entidad eva_cat_evaluacion
 *
 */

@Entity
@Table(name="eva_cat_evaluacion", schema="sc_evaluacion")
public class Evaluacion {

	//Propiedades
	@Id
	@Column
	String cod_evaluacion;
	@Column
	String desc_evaluacion;
	
	//Constructores
	public Evaluacion(String cod_evaluacion, String desc_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
		this.desc_evaluacion = desc_evaluacion;
	}

	public Evaluacion() {
		super();
	}

	//GETTERS Y SETTERS
	public String getCod_evaluacion() {
		return cod_evaluacion;
	}


	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}


	public String getDesc_evaluacion() {
		return desc_evaluacion;
	}


	public void setDesc_evaluacion(String desc_evaluacion) {
		this.desc_evaluacion = desc_evaluacion;
	}


	//Método que hace legible al objeto
	@Override
	public String toString() {
		return "Evaluacion [cod_evaluacion=" + cod_evaluacion + ", desc_evaluacion=" + desc_evaluacion + "]";
	}
	
	
	
}
