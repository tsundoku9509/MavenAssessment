/**
 * @author ${Austin Mays} - ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * ${01/24/2023}
 */

package model;

public class MavenClass {
	private String mavenTest;
	public int mav;
	
	public MavenClass(String mav) {
		this.mavenTest = mav;
	}
	public MavenClass() {
		// TODO Auto-generated constructor stub
	}
	public String mavPrint() {
		return mavenTest;
	}
	public int mavInt() {
		mav = Integer.parseInt(mavenTest);
		return mav;
	}
	public Integer mavIntDiv(int mav) {
		mav = Integer.parseInt(mavenTest);
		int mavDiv = 10;
		int mavDivSolve = mav/mavDiv;
		return mavDivSolve;
	}
	public static void main(String[] args) {
		MavenClass mav = new MavenClass("100");
		System.out.println(mav);
	}
}
