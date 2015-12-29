/**
 *   File Name: Example.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Nov 14, 2015
 *   
 */

package com.sqa.ao.testNGTests;

/**
 * Example //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class Example {

	public static void main(String[] args) {
		System.out.println(" " + bogo(new Extension()));
	}

	static int bogo(Base b) {
		b.add(8);
		return b.i;
	}
}