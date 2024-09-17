package com.waltujo.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waltujo.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET) //@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User gael = new User("1", "Gael Santana", "gale@gmail.com");
		User thomas = new User("2", "Thomás Araujo", "thomas@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(gael, thomas));
		return ResponseEntity.ok().body(list);
	}
}
