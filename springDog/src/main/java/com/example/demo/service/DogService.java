package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Dog;
import com.example.demo.repo.DogRepo;

@Service
public class DogService implements ServiceMethods<Dog>{

	private DogRepo repo;

	
	
	public DogService(DogRepo repo) {
		this.repo = repo;
	}

	@Override
	public Dog create(Dog dog) {
		return this.repo.save(dog);
	}

	@Override
	public List<Dog> readAll() {
		return this.repo.findAll();
	}

	@Override
	public Dog readById(long id) {
		Optional<Dog> getDog = this.repo.findById(id);
		if(getDog.isPresent()) {
			return getDog.get();
		}
		return null;
	}

	//When setting values, DO NOT set the id
	@Override
	public Dog update(long id, Dog dog) {
		Optional<Dog> existingDuck = this.repo.findById(id);
		if(existingDuck.isPresent()) {
			Dog exists = existingDuck.get();
			exists.setAge(dog.getAge());
			exists.setGender(dog.getGender());
			exists.setName(dog.getName());
			
			return this.repo.saveAndFlush(exists);
		}
		return null;
	}

	//Deletes the id, and checks to see if it it still exists (should return true if it has worked)
	@Override
	public boolean delete(long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
