package ftg.ps.project.ms.acteurs.repository;

import ftg.ps.project.ms.acteurs.domain.Acheteur;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Acheteur entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AcheteurRepository extends JpaRepository<Acheteur, Long> {

}
