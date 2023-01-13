package it.nttdata.corso.springjsp.business.interfaces;

import it.nttdata.corso.springjsp.model.WebSiteInfo;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface WebSiteInfoBOI {
    List<WebSiteInfo>getAllSites();

    void insertWebSiteInfo(WebSiteInfo webSiteInfo) throws DataAccessException;

    void deleteWebSiteInfo(long id) throws DataAccessException;

    public WebSiteInfo getWebSiteInfo() throws DataAccessException;
}

