package com.qa.hs.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeyWordEngine;
/**
 * 
 * AUTHOR : ABHILASH 
 *
 */
public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("demo");
		//d
	}
	
//	@Test
//	public void signUpTest(){
//		keyWordEngine = new KeyWordEngine();
//		keyWordEngine.startExecution("signup");
//	}
	
	
	

}
