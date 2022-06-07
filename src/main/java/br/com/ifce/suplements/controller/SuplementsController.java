package br.com.ifce.suplements.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.com.ifce.suplements.model.Suplements;
import br.com.ifce.suplements.service.SuplementsService;

@Controller
public class SuplementsController {
  @Autowired
  private SuplementsService serviceSuplements;

  @GetMapping("suplements/form")
  public String form() {
    return "form";
  }

  @GetMapping("suplements/save")
  public String save(Suplements suplement) {
    serviceSuplements.saveService(suplement);
    return "save";
  }

  @GetMapping("suplements/listar")
  public ModelAndView listar() {
    List<Suplements> suplements = serviceSuplements.listar();
    ModelAndView mv = new ModelAndView("lista");
    mv.addObject("listarSuplements", suplements);
    return mv;
  }

  @GetMapping("suplements/delete/{id}")
  public ModelAndView excluir(@PathVariable Long id) {
    serviceSuplements.excluir(id);
    ModelAndView mv = new ModelAndView("redirect:suplements/listar");
    return mv;
  }
}
