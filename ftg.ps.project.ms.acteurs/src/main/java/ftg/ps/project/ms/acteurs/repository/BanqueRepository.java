package ftg.ps.project.ms.acteurs.repository;

import ftg.ps.project.ms.acteurs.domain.Banque;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Banque entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BanqueRepository extends JpaRepository<Banque, Long> {

}
