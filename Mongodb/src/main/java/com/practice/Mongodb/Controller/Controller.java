package com.practice.Mongodb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Mongodb.Document.Docu;
import com.practice.Mongodb.Service.ServiceInterface;

@RestController
@RequestMapping(value = "/api")
public class Controller {

	@Autowired
	private ServiceInterface serviceInterface;
	
	
	@PostMapping("/create")
	public void create(@RequestBody Docu docu) {
		serviceInterface.create(docu);
	}

	@GetMapping("/readall")
	public List<Docu> get() {
		return serviceInterface.read();
	}

	@GetMapping("/readByid/{id}")
	public Docu readByid(@PathVariable int id) {
		return serviceInterface.readByid(id);
	}

	@PutMapping("/updateByid/{id}")
	public Docu update(@PathVariable int id, @RequestBody Docu docu) {
		return serviceInterface.update(id, docu);
	}

	@DeleteMapping("/deleteByid/{id}")
	public void delete(@PathVariable int id) {
		serviceInterface.deleteByid(id);
	}

}
