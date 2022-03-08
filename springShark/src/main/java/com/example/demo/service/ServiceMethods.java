package com.example.demo.service;

import java.util.List;

public interface ServiceMethods <T> {

		T create(T dog);
		
		List<T> readAll();
		
		T readById(long id);
		
		T update(long id, T duck);
		
		boolean delete(long id);
	}

