package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dog;
import com.example.demo.service.DogService;

@RestController
@RequestMapping("/dog")


public class DogController {

private DogService service;
	
	private DogController(DogService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Dog> createDuck(@RequestBody Dog dog){
		return new ResponseEntity<Dog>(this.service.create(dog), HttpStatus.CREATED);
	}
	
	@GetMapping("/readAll")
	public ResponseEntity<List<Dog>> readAllDogs(){
		return new ResponseEntity<List<Dog>>(this.service.readAll(), HttpStatus.OK);
	}
	
	
	@GetMapping("/readById/{id}")
	public ResponseEntity<Dog> readById(@PathVariable long id){
		return new ResponseEntity<Dog>(this.service.readById(id), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Dog> updateDuck(@PathVariable long id, @RequestBody Dog dog){
		return new ResponseEntity<Dog>(this.service.update(id, dog), HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteDuck(@PathVariable long id){
		return (this.service.delete(id)) ? new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT) : 
			new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
	}
	
	
	
}
