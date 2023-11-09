package irfan.learn.webservices.springboot.Resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import irfan.learn.webservices.springboot.Model.Irfan;
import irfan.learn.webservices.springboot.Service.IrfanService;



@RestController
public class IrfanResource {
    
    private IrfanService service;

    public IrfanResource(IrfanService service) {
        this.service = service;
    }
       //GET /users
    @GetMapping("/irfans")
    public List<Irfan> retrieveAllUsers() {
        return service.findAll();
    }
}
