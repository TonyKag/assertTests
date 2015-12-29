/**
 *   File Name: TextMessageTest.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 31, 2015
 *   
 */

package com.sqa.ao.jutitTests;

import org.junit.Assert;
import org.junit.Test;

/**
 * TextMessageTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class TextMessageTest {
	String msg1 = "My message";
	String msg2 = "My message";

	@Test
	public void testEqualsString() {
		Assert.assertEquals("Strings should be equal", msg1, msg2);
	}

}
