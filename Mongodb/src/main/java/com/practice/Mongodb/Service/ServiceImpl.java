package com.practice.Mongodb.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Mongodb.Document.Docu;
import com.practice.Mongodb.Repo.Repo;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private Repo repo;
	
	@Override
	public Docu readByid(int id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Docu> read() {
		return repo.findAll();
	}

	@Override
	public void deleteByid(int id) {
		repo.deleteById(id);

	}

	@Override
	public void create(Docu docu) {
		repo.save(docu);

	}

	@Override
	public Docu update(int id, Docu docu) {
		docu.setId(id);
		return repo.save(docu);
	}

}
