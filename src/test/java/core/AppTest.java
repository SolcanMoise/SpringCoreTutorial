package core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	@Before
	public void setUp() {
		App.setContext(new ClassPathXmlApplicationContext("models/universitate.xml"));
	}

	@Test
	public void testApp() {
		assertNotNull(App.getContext());
		assertNotNull(App.getBeanForUniversitate());
	}

}
