package ftg.ps.project.ms.acteurs.repository;

import ftg.ps.project.ms.acteurs.domain.Organisme;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Organisme entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrganismeRepository extends JpaRepository<Organisme, Long> {

}
