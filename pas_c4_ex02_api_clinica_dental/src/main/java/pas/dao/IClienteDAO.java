package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Cliente;

/**
 * @author paul_
 *
 */

public interface IClienteDAO extends JpaRepository<Cliente, Long> {

}
