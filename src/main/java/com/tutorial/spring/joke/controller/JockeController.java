package com.tutorial.spring.joke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutorial.spring.joke.service.IJokeService;

/**
 * This class is the spring mvc controller for the joke view 
 * 
 * @author Bastian Bräunel
 *
 */
@Controller
public class JockeController {

	private IJokeService jokeService;
	private final static String JOKE_ATTRIBUTE = "joke";

	/**
	 * default constructor 
	 * 
	 * @param jokeService	constructor based dependency injection
	 */
	public JockeController(IJokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	
	/**
	 * Method to manipulate the joke view
	 * 
	 * @param model		injected by the spring framework
	 * @return			a string that is associated with the view
	 */
	@RequestMapping({"/", ""})
	public String showNextJoke(Model model) {
		model.addAttribute(JOKE_ATTRIBUTE, jokeService.getJoke());
		return JOKE_ATTRIBUTE;
	}
}
