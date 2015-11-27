package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Profesor")
public class Profesor implements Serializable {
	@Id
	@Column(name = "Id")
	private int id;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ape1")
	private String ape1;
	
	@Column(name = "ape2")
	private String ape2;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Direccion direccion;
	
	@OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
	private Set<CorreoElectronico> correos;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ProfesorModulo", joinColumns = { @JoinColumn(name = "idProfesor") }, inverseJoinColumns = { @JoinColumn(name = "idModulo") })
	private Set<Modulo> modulos = new HashSet<>();
	
	@Enumerated(EnumType.ORDINAL)
	private tipofuncionario tipofuncionario;
	
	public Set<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(Set<Modulo> modulos) {
		this.modulos = modulos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Profesor() {
		super();
	}

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public Set<CorreoElectronico> getCorreos() {
		return correos;
	}

	public void setCorreos(Set<CorreoElectronico> correos) {
		this.correos = correos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Profesor other = (Profesor) obj;
		if (id != other.id)
			return false;
		return true;
	}

	// @Override
	/*
	 * public String toString() { return "Profesor [id=" + id + ", nombre=" +
	 * nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", tipoFuncionario=" +
	 * tipoFuncionario + "]";
	 */
	// }
	public Profesor(int id, String nombre, String ape1, String ape2) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;

	}

	public Profesor(int id,String nombre, String ape1, String ape2,
			
			modelo.tipofuncionario tipofuncionario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		
		this.tipofuncionario = tipofuncionario;
	}

}
