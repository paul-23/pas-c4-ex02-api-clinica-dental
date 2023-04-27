/**
 * 
 */
package pas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pas.dto.Cita;
import pas.dto.Cliente;
import pas.dto.Dentista;
import pas.service.CitaServiceImpl;
import pas.service.ClienteServiceImpl;
import pas.service.DentistaServiceImpl;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class DentistaController {

	@Autowired
	DentistaServiceImpl dentistaServiceImpl;
	
	@Autowired
	ClienteServiceImpl clienteServiceImpl;
	
	@Autowired
	CitaServiceImpl citaServiceImpl;

	@GetMapping("/dentistas")
	public List<Dentista> listDentista() {
		return dentistaServiceImpl.listarDentistas();
	}

	@GetMapping("/dentistas/{id}")
	public Dentista dentistasById(@PathVariable(name = "id") Long id) {
		Dentista dentistaXID = new Dentista();
		dentistaXID = dentistaServiceImpl.dentistaXID(id);
		return dentistaXID;
	}

	@PostMapping("/dentistas")
	public Dentista saveDentista(@RequestBody Dentista dentista) {
		return dentistaServiceImpl.guardarDentista(dentista);
	}

	@PutMapping("/dentistas/{id}")
	public Dentista updateDentista(@PathVariable(name = "id") Long id, @RequestBody Dentista dentista) {
		Dentista selectedDentista = new Dentista(id, dentista.getDni(), dentista.getNombre(), dentista.getApellido());
		Dentista updatedDentista = new Dentista();
		updatedDentista = dentistaServiceImpl.actualizarDentista(selectedDentista);
		return updatedDentista;
	}

	@DeleteMapping("/dentistas/{id}")
	public void deleteDentista(@PathVariable(name = "id") Long id) {
		dentistaServiceImpl.eliminarDentista(id);
	}
	
	@GetMapping("/dentistas/clientes")
	public List<Cliente> listarClientes() {
		return clienteServiceImpl.listarClientes();
	}
	
	@GetMapping("/dentistas/citas")
	public List<Cita> listarCitas() {
		return citaServiceImpl.listarCitas();
	}

}
