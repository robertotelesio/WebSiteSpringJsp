package it.nttdata.corso.springjsp.business.impl;


import it.nttdata.corso.springjsp.model.WebSiteInfo;
import it.nttdata.corso.springjsp.repository.WebSiteInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class WebSiteInfoBOImpl {
    @Autowired
    WebSiteInfoRepository webSiteInfoRepository;

    public WebSiteInfo getWebSiteInfo () throws DataAccessException {
        return webSiteInfoRepository.findFirstByOrderByIdDesc();
    }
}
