package ftg.ps.project.ms.acteurs.repository;

import ftg.ps.project.ms.acteurs.domain.AnimateurFournisseur;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AnimateurFournisseur entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AnimateurFournisseurRepository extends JpaRepository<AnimateurFournisseur, Long> {

}
