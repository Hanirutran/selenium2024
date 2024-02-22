package selenium;

	import org.testng.annotations.Test;

	public class LearnAttributes1 {
		
		@Test (priority=4,invocationCount=5,invocationTimeOut=30)   
		public void signOut() {
			System.out.println("sign out");
		}
		
		@Test(priority=3,description="This test cases for Signup")
		public void signUp() {
			System.out.println("signUp");
		}
		
		@Test (priority=2,enabled=false)
		public void login() {
			System.out.println("login");
		}

		@Test
		public void searchProduct() {
			System.out.println("search Product");
		}
		
		
		@Test (priority=-5)
		public void addToCart() {
			System.out.println("add to cart");
		}

	

	}


