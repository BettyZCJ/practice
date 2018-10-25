package testNG;

import org.testng.annotations.Test;

public class TestNGAttributes {
	@Test(priority=0)
	public void d() {
		
	}
	@Test(dependsOnMethods=("h"))
	public void e() {
		
	}
	@Test(priority=89)
	public void o() {
		
	}
	@Test(priority=45)
	public void h() {
		
	}
	@Test(enabled=false)
	public void f() {
		
	}
	@Test(priority=3)
	public void m() {
		
	}
	

}
