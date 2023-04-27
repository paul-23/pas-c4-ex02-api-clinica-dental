package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Dentista;

/**
 * @author paul_
 *
 */

public interface IDentistaDAO extends JpaRepository<Dentista, Long> {

}