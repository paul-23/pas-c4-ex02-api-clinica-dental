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
import pas.service.CitaServiceImpl;
import pas.service.ClienteServiceImpl;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class CitaController {

	@Autowired
	CitaServiceImpl citasServiceImpl;
	
	@Autowired
	ClienteServiceImpl clienteServiceImpl;

	@GetMapping("/citas")
	public List<Cita> listCita() {
		return citasServiceImpl.listarCitas();
	}

	@GetMapping("/citas/{id}")
	public Cita citaById(@PathVariable(name = "id") Long id) {
		Cita citaXID = new Cita();
		citaXID = citasServiceImpl.citaXID(id);
		return citaXID;
	}

	@PostMapping("/citas")
	public Cita saveCita(@RequestBody Cita cita) {
		return citasServiceImpl.guardarCita(cita);
	}

	@PutMapping("/citas/{id}")
	public Cita updateCita(@PathVariable(name = "id") Long id, @RequestBody Cita cita) {
		Cita selectedCita = new Cita(id, cita.getFecha_hora(), cita.getCliente(), cita.getDentista());
		Cita updatedCita = new Cita();
		updatedCita = citasServiceImpl.actualizarCita(selectedCita);
		return updatedCita;
	}

	@DeleteMapping("/citas/{id}")
	public void deleteCita(@PathVariable(name = "id") Long id) {
		citasServiceImpl.eliminarCita(id);
	}
	
	@GetMapping("/citas/cliente/{id}")
	public List<Cita> citaXusuarioID(@PathVariable(name="id") Long id) {
		return citasServiceImpl.citasXClientes(clienteServiceImpl.clienteXID(id));
	}
	
}
