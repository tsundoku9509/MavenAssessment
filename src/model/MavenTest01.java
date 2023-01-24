/**
 * @author ${Austin Mays} - ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * ${01/24/2023}
 */

package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MavenTest01 {
	String mav = "100";
	MavenClass maven = new MavenClass(mav);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(mav, maven.mavPrint());
	}
	@Test
	public void mavIntTest() {
		int mavenInt = Integer.parseInt(mav);
		assertTrue(mavenInt == maven.mavInt());
	}

}
