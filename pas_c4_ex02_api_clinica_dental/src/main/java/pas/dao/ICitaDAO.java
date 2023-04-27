package pas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Cita;
import pas.dto.Cliente;

/**
 * @author paul_
 *
 */

public interface ICitaDAO extends JpaRepository<Cita, Long> {
	
	List<Cita> findByCliente(Cliente cliente);
	
}
