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
	 * 
	 * @param	ChuckNorrisQuotes will get injected by java based configuration
	 */
	public JokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}
	
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
