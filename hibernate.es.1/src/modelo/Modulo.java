package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="modulo")
public class Modulo implements Serializable {
	@Id
	@Column(name="IdModulo")
	private int idModulo;
	@Column(name="nombre")
	private String nombre;
	@ManyToMany(cascade= {CascadeType.ALL},mappedBy="modulos")
	private Set<Profesor> profesores= new HashSet<>();
	
	public Modulo() {
		super();
	}

	public int getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(Set<Profesor> profesores) {
		this.profesores = profesores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idModulo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modulo other = (Modulo) obj;
		if (idModulo != other.idModulo)
			return false;
		return true;
	}

	public Modulo(int idModulo, String nombre) {
		super();
		this.idModulo = idModulo;
		this.nombre = nombre;
		
	}
	
	
	
	
}
