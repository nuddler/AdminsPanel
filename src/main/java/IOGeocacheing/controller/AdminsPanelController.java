package IOGeocacheing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import IOGeocacheing.services.IDao;

@Controller
@RequestMapping("/panel/*")
public class AdminsPanelController {
    
    @Autowired
    private IDao restfulDao;
    
    

}
