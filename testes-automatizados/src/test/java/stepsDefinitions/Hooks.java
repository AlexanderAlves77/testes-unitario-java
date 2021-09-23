package stepsDefinitions;

import io.cucumber.java.*;
import static utils.Utils.*;

public class Hooks {

	@Before
	public void steUp() {
		acessarSistema();
	}
	
	@After
	public void tearDown() {
		
	}
}
