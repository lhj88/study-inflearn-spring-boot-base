package me.whiteship.springinit.hateoas;

import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class HateoasSampleController {

    @GetMapping("/hateoas/hello")
    public EntityModel<HeateoasHello> hello(){
        HeateoasHello hello = new HeateoasHello();
        hello.setPrefix("Mr. ");
        hello.setName("HeeJu");

        EntityModel<HeateoasHello> helloResource = new EntityModel<>(hello);
        helloResource.add(linkTo(methodOn(HateoasSampleController.class).hello()).withSelfRel());
        return helloResource;
    }
}
