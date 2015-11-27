package modelo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "correoelectronico")
public class CorreoElectronico implements Serializable {

	@Id
	@Column(name="IdCorreo")
	private int idcorreo;
	@Column(name = "DireccionCorreo")
	private String direccionCorreo;
	@ManyToOne
	@JoinColumn(name = "IdProfesor")
	private Profesor profesor;

	public CorreoElectronico() {
		super();
	}

	public int getIdcorreo() {
		return idcorreo;
	}

	public void setIdcorreo(int idcorreo) {
		this.idcorreo = idcorreo;
	}

	public String getDireccionCorreo() {
		return direccionCorreo;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((direccionCorreo == null) ? 0 : direccionCorreo.hashCode());
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
		CorreoElectronico other = (CorreoElectronico) obj;
		if (direccionCorreo == null) {
			if (other.direccionCorreo != null)
				return false;
		} else if (!direccionCorreo.equals(other.direccionCorreo))
			return false;
		return true;
	}
	
}
