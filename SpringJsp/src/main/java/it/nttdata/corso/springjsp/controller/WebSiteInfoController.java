package it.nttdata.corso.springjsp.controller;

import it.nttdata.corso.springjsp.business.impl.WebSiteInfoBOImpl;
import it.nttdata.corso.springjsp.model.WebSiteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebSiteInfoController {
    @Autowired
    WebSiteInfoBOImpl webSiteInfoBOImpl;

    @GetMapping(path ={ "/","/index"})
    public ModelAndView home(){
        WebSiteInfo webSiteInfo = webSiteInfoBOImpl.getWebSiteInfo();
        throw new IllegalArgumentException("T");
        // new ModelAndView("/jsp.index.jsp,)","Info",webSiteInfo);
    }

}
