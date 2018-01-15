package com.tutorial.spring.joke.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * This service is responsible to deliver the random Chuck Norris jokes.
 * 
 * @author Bastian Bräunel
 *
 */
@Service
public class JokeService implements IJokeService {
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	/**
	 * default constructor
	 */
	public JokeService() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
