package it.nttdata.corso.springjsp.repository;

import it.nttdata.corso.springjsp.model.WebSiteInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebSiteInfoRepository extends JpaRepository<WebSiteInfo,Long> {
    WebSiteInfo findFirstByOrderByIdDesc ();
}
