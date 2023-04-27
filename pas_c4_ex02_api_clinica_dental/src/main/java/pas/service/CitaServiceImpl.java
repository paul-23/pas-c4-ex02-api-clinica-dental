/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.ICitaDAO;
import pas.dto.Cita;
import pas.dto.Cliente;

/**
 * @author paul_
 *
 */

@Service
public class CitaServiceImpl {

	@Autowired
	ICitaDAO iCitaDAO;

	public List<Cita> listarCitas() {
		return iCitaDAO.findAll();
	}

	public Cita guardarCita(Cita cita) {
		return iCitaDAO.save(cita);
	}

	public Cita citaXID(Long id) {
		return iCitaDAO.findById(id).get();
	}
	
	public List<Cita> citasXClientes(Cliente cliente) {
		return this.iCitaDAO.findByCliente(cliente);
	}

	public Cita actualizarCita(Cita cita) {
		return iCitaDAO.save(cita);
	}

	public void eliminarCita(Long id) {
		iCitaDAO.deleteById(id);
	}
	
}
