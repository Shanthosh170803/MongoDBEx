package com.practice.Mongodb.Service;

import java.util.List;

import com.practice.Mongodb.Document.Docu;

public interface ServiceInterface {

	public void create(Docu docu);

	public Docu readByid(int id);

	public List<Docu> read();

	public Docu update(int id, Docu docu);

	public void deleteByid(int id);

}
