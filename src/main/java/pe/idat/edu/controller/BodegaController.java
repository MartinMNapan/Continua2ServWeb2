package pe.idat.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.edu.model.Bodega;
import pe.idat.edu.service.BodegaService;

@Controller
@RequestMapping(path = "/bodega/v1")
public class BodegaController {
	
	@Autowired
	private BodegaService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Bodega>> listar(){
		return new ResponseEntity<List<Bodega>>(service.listarBodega(), HttpStatus.OK);
	}

}
