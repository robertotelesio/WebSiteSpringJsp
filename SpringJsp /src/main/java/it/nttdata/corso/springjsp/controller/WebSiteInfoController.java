package it.nttdata.corso.springjsp.controller;

import it.nttdata.corso.springjsp.business.interfaces.WebSiteInfoBOI;
import it.nttdata.corso.springjsp.model.WebSiteInfo;
import it.nttdata.corso.springjsp.repository.WebSiteInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebSiteInfoController {
    @Autowired
    WebSiteInfoBOI webSiteInfoBOI;


    @Autowired
    private WebSiteInfoRepository webSiteInfoRepository;

    @GetMapping(path = {"/","/index"})
    public ModelAndView home(){
        WebSiteInfo webSiteInfo = webSiteInfoBOI.getWebSiteInfo();
        return new ModelAndView("/jsp/index.jsp","Info",webSiteInfo);
    }
    @GetMapping("/secondPage")
    public ModelAndView secondPage() {
        return new ModelAndView("/jsp/secondPage.jsp");
    }

    @GetMapping(path = {"list","/listaPagine"})
    public ModelAndView sites(){
        List<WebSiteInfo> webSiteInfoList  = webSiteInfoBOI.getAllSites();
        return new ModelAndView("/jsp/listaPagine.jsp","list",webSiteInfoList);
    }

    @GetMapping("/createInfo")
    public ModelAndView getForm(){
        return new ModelAndView("/jsp/createInfo.jsp");
    }

    @PostMapping("/createInfo")
    public ModelAndView insertWebSiteInfo(@RequestParam String name,@RequestParam String description) {
        WebSiteInfo webSiteInfo = new WebSiteInfo();
        webSiteInfo.setName(name);
        webSiteInfo.setDescription(description);
        webSiteInfoBOI.insertWebSiteInfo(webSiteInfo);
        return new ModelAndView("/jsp/createInfo.jsp","operation",true);
        }
    @GetMapping("/deleteViewInfo")
    public ModelAndView getDeleteForm(){
        return new ModelAndView("/jsp/deleteInfo.jsp");
    }

    @GetMapping("/deleteInfo")
    public ModelAndView deleteWebSiteInfo(@RequestParam String id) {
        if(!id.isEmpty()){
            webSiteInfoBOI.deleteWebSiteInfo(Long.parseLong(id));
            return new ModelAndView("/jsp/deleteInfo.jsp","operation",true);
        }
        return new ModelAndView("/jsp/createInfo.jsp","id_not_found",true);
    }
    }






