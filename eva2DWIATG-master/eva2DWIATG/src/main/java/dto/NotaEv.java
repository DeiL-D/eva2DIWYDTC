package dto;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;

public class NotaEv {

	// Propiedades

	String md_uuid;

	Timestamp md_fch;

	String cod_alumno;

	int nota_evaluacion;

	String cod_evaluacion;
	int id_nota_evaluacion;
	

	// Constructor
	public NotaEv(String cod_alumno, int nota_evaluacion, String cod_evaluacion, int id_nota_evaluacion) {
		super();
		//le introduce un valor aleatorio pñara que el uuid sea diferente de otros usuarios
		md_uuid =  UUID.randomUUID().toString();;
		md_fch = Timestamp.valueOf("2007-09-23 10:10:10");
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
		this.id_nota_evaluacion = id_nota_evaluacion;
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public int getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}

	public void setId_nota_evaluacion(int id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
	}
	public Timestamp getMd_fch() {
		return md_fch;
	}

	public void setMd_fch(Timestamp md_fch) {
		this.md_fch = md_fch;
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

}
