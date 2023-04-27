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
import pas.service.ClienteServiceImpl;
import pas.service.DentistaServiceImpl;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	ClienteServiceImpl clienteServiceImpl;

	@GetMapping("/clientes")
	public List<Cliente> listCliente() {
		return clienteServiceImpl.listarClientes();
	}

	@GetMapping("/clientes/{id}")
	public Cliente clienteById(@PathVariable(name = "id") Long id) {
		Cliente clienteXID = new Cliente();
		clienteXID = clienteServiceImpl.clienteXID(id);
		return clienteXID;
	}

	@PostMapping("/clientes")
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		return clienteServiceImpl.guardarCliente(cliente);
	}

	@PutMapping("/clientes/{id}")
	public Cliente updateCliente(@PathVariable(name = "id") Long id, @RequestBody Cliente cliente) {
		Cliente selectedCliente = new Cliente(id, cliente.getDni(), cliente.getNombre(), cliente.getApellido());
		Cliente updatedCliente = new Cliente();
		updatedCliente = clienteServiceImpl.actualizarCliente(selectedCliente);
		return updatedCliente;
	}

	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable(name = "id") Long id) {
		clienteServiceImpl.eliminarCliente(id);
	}

}
