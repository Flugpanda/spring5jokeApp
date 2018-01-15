package com.tutorial.spring.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Java based spring configuration example
 * 
 * @author Bastian Bräunel
 *
 */
//@Configuration
public class ChuckConfiguration {

	/**
	 * Declare ChuckNorrisQuotes as a bean by java based configuration
	 * 
	 * @return	ChuckNorrisQuotes as a bean
	 */
//	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
