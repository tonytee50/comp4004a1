package TestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import server.logic.model.User;

public class TestUser {

	User newUser;
	
	@Before
	public void setUp() throws Exception {
		newUser = new User(1234, 0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertEquals("[1234,0]", newUser.toString());
		
	}

}