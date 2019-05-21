package com.evento.ibm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.evento.ibm.Model.Cadastro;
import com.evento.ibm.Repository.EmpresaRepository;

@Controller
public class EmpresaController {

	@Autowired
	private EmpresaRepository er;
	
	@RequestMapping(value="/cadastrarEmpresa",  method= RequestMethod.GET)
	public String form() {
		return "empresa/formEmpresa";
	}
	@RequestMapping(value="/cadastrarEmpresa",  method= RequestMethod.POST)
	public String form(Cadastro cadastro) {
		er.save(cadastro);
		return "redirect:/cadastrarEmpresa";
	}
	@RequestMapping("/empresa")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/index");
		Iterable<Cadastro> lista = er.findAll();
		mv.addObject("listas",lista);
		return mv;
		
	}
	
	}



