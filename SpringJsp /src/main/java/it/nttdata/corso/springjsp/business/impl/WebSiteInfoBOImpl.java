package it.nttdata.corso.springjsp.business.impl;


import it.nttdata.corso.springjsp.business.interfaces.WebSiteInfoBOI;
import it.nttdata.corso.springjsp.model.WebSiteInfo;
import it.nttdata.corso.springjsp.repository.WebSiteInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSiteInfoBOImpl implements WebSiteInfoBOI {
    @Autowired
    WebSiteInfoRepository webSiteInfoRepository;

    public WebSiteInfo getWebSiteInfo () throws DataAccessException {
        return webSiteInfoRepository.findFirstByOrderByIdDesc();
    }

    @Override
    public List<WebSiteInfo> getAllSites(){
        return webSiteInfoRepository.findAll();
    }

    public void insertWebSiteInfo(WebSiteInfo webSiteInfo) throws DataAccessException{
        webSiteInfoRepository.save(webSiteInfo);
    }
    public void deleteWebSiteInfo(long id) throws DataAccessException{
        webSiteInfoRepository.deleteById(id);
    }

}
