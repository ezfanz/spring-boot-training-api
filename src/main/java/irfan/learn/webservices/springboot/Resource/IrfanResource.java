package irfan.learn.webservices.springboot.Resource;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.parser.Entity;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import irfan.learn.webservices.springboot.Model.Irfan;
import irfan.learn.webservices.springboot.Model.User;
import irfan.learn.webservices.springboot.Repository.IrfanRepository;
import irfan.learn.webservices.springboot.Service.IrfanService;



@RestController
public class IrfanResource {
    
    private IrfanService service;

    private IrfanRepository irfanRepository;

    public IrfanResource(IrfanService service, IrfanRepository irfanRepository) {
        this.service = service;
        this.irfanRepository = irfanRepository;
    }
       //GET /users
    @GetMapping("/irfans")
    public List<Irfan> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/irfans/{id}")
    public EntityModel<Irfan> retrieveUser(@PathVariable int id) {
        Irfan irfan = service.findOne(id);

        if (irfan == null)
            throw new UserNotFoundException("id:" + id);

        EntityModel<Irfan> entityModel = EntityModel.of(irfan);

        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());

        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }

}
