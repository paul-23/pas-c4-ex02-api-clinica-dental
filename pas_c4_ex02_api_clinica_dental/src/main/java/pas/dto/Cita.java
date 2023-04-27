package pas.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * @author paul_
 *
 */

@Entity
@Table(name = "citas")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "fecha_hora")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime fecha_hora;

	@ManyToOne
	@JoinColumn(name = "cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "dentista")
	private Dentista dentista;

	public Cita() {
		
	}

	public Cita(Long id, LocalDateTime fecha_hora, Cliente cliente, Dentista dentista) {
		this.id = id;
		this.fecha_hora = fecha_hora;
		this.cliente = cliente;
		this.dentista = dentista;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getFecha_hora() {
		return fecha_hora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Dentista getDentista() {
		return dentista;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFecha_hora(LocalDateTime fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}
	
}