/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IDentistaDAO;
import pas.dto.Dentista;

/**
 * @author paul_
 *
 */

@Service
public class DentistaServiceImpl {

	@Autowired
	IDentistaDAO iDentistaDAO;

	public List<Dentista> listarDentistas() {
		return iDentistaDAO.findAll();
	}

	public Dentista guardarDentista(Dentista dentista) {
		return iDentistaDAO.save(dentista);
	}

	public Dentista dentistaXID(Long id) {
		return iDentistaDAO.findById(id).get();
	}

	public Dentista actualizarDentista(Dentista dentista) {
		return iDentistaDAO.save(dentista);
	}

	public void eliminarDentista(Long id) {
		iDentistaDAO.deleteById(id);
	}
	
}
