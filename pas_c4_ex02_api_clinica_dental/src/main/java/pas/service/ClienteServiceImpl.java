/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IClienteDAO;
import pas.dto.Cliente;

/**
 * @author paul_
 *
 */

@Service
public class ClienteServiceImpl {

	@Autowired
	IClienteDAO iClienteDAO;

	public List<Cliente> listarClientes() {
		return iClienteDAO.findAll();
	}

	public Cliente guardarCliente(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}

	public Cliente clienteXID(Long id) {
		return iClienteDAO.findById(id).get();
	}

	public Cliente actualizarCliente(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}

	public void eliminarCliente(Long id) {
		iClienteDAO.deleteById(id);
	}
	
}
