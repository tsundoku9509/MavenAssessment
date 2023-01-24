/**
 * @author ${Austin Mays} - ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * ${01/24/2023}
 */


package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MavenTest02 {
	String mavDiv = "100";
	MavenClass mavenDiv = new MavenClass(mavDiv);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDiv() {
		Integer mavenInt = Integer.parseInt(mavDiv);
		Integer mavDivTest = 10;
		Integer mavDivSolveTest = mavenInt/mavDivTest;
		assertNotNull(mavenDiv.mavIntDiv(mavDivSolveTest));
	}

}
