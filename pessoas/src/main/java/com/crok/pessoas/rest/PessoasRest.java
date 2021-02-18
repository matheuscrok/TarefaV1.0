package com.crok.pessoas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crok.pessoas.dao.PessoasDao;
import com.crok.pessoas.model.Pessoas;
@RestController
@RequestMapping("/rest")
public class PessoasRest {

	
	@Autowired
	private PessoasDao pessoasDao;
	
	@GetMapping
	public List<Pessoas> get() {
		return pessoasDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Pessoas pessoa) {
		pessoasDao.save(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		pessoasDao.deleteById(id);
	}
}
