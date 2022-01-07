package com.TestNg_Project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	private void facebook() {
		
		System.out.println("facebook");
	}
	@Test
	private void whatsapp() {
		
		System.out.println("whatsapp");
	}
	@Test
	private void spotify() {
		
		System.out.println("Spotify");
	}
	@Test(enabled = false)
	private void wynkmusic() {
		
		System.out.println("Wynk Music");
	}
	@Ignore
	@Test
	private void books() {
		
		System.out.println("Books");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
