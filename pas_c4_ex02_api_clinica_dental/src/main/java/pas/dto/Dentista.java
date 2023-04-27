package pas.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author paul_
 *
 */

@Entity
@Table(name = "dentistas")
public class Dentista {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "dni")
	private String dni;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dentista")
	private List<Cita> cita;

	public Dentista() {

	}

	public Dentista(Long id, String dni, String nombre, String apellido) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Long getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cita")
	public List<Cita> getCita() {
		return cita;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setCita(List<Cita> cita) {
		this.cita = cita;
	}
	
}
