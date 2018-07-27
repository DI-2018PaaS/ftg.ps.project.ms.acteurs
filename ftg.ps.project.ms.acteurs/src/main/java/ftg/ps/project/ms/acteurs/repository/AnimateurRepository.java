package ftg.ps.project.ms.acteurs.repository;

import ftg.ps.project.ms.acteurs.domain.Animateur;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Animateur entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AnimateurRepository extends JpaRepository<Animateur, Long> {

}
