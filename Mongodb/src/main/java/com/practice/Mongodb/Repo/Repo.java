package com.practice.Mongodb.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.practice.Mongodb.Document.Docu;

@Repository
public interface Repo extends MongoRepository<Docu, Integer> {

}
