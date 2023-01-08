package dao;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DAO para la entidad eva_tch_notas_evaluacion
 *
 */

@Entity
@Table(name="eva_tch_notas_evaluacion", schema="sc_evaluacion")
public class NotaEvaluacion {

	//Propiedades
	@Column
	String md_uuid;
	@Column
	Timestamp md_fch;
	@Id
	@Column
	int id_nota_evaluacion;
	@Column
	String cod_alumno;
	@Column
	int nota_evaluacion;
	@Column
	String cod_evaluacion;
	
	//Constructores
	public NotaEvaluacion(String md_uuid, Timestamp md_fch, int id_nota_evaluacion, String cod_alumno, int nota_evaluacion,
			String cod_evaluacion) {
		
		this.md_uuid = UUID.randomUUID().toString();
		this.md_fch = md_fch;
		this.id_nota_evaluacion = id_nota_evaluacion;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}

	//GETTERS Y SETTERS
	public NotaEvaluacion() {
		
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Timestamp getMd_fch() {
		return md_fch;
	}

	public void setMd_fch(Timestamp md_fch) {
		this.md_fch = md_fch;
	}

	public int getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}

	public void setId_nota_evaluacion(int id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
	}

	public String getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public int getNota_evaluacion() {
		return nota_evaluacion;
	}

	public void setNota_evaluacion(int nota_evaluacion) {
		this.nota_evaluacion = nota_evaluacion;
	}

	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}


	//Método que hace legible al objeto
	@Override
	public String toString() {
		return "Evaluacion [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_nota_evaluacion=" + id_nota_evaluacion
				+ ", cod_alumno=" + cod_alumno + ", nota_evaluacion=" + nota_evaluacion + ", cod_evaluacion="
				+ cod_evaluacion + "]";
	}
	
	
	
	
	
	
	
}

