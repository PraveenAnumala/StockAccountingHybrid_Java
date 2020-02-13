import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdactinBasic {

	public static void main(String[] args) {
		
        String logindata[][] = {{"rameshadepu","ramesh"},{"praveenanumala","praveen@9"},{"praveenanumala","praveen@1"}};
		
		System.out.println(logindata.length);
		
		for(int i=0; i<logindata.length;i++) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveena\\Desktop\\PC Anumala\\Selenium\\StockAccountingHybrid\\Drivers\\chromedriver.exe");	
			
		WebDriver driver=new ChromeDriver();	
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://adactin.com/HotelAppBuild2/");
		
		boolean Actual = false;
		
		try {
		
		driver.findElement(By.id("username")).sendKeys(logindata[i][0]);
		
		driver.findElement(By.name("password")).sendKeys(logindata[i][1]);
		
		driver.findElement(By.id("login")).click();
		
		
			try{
			Actual= driver.findElement(By.name("location")).isDisplayed();
			}catch(Exception isdisplayedexception){
				System.out.println("Login failed");
			}
		
		if(Actual ==true)
		{
			System.out.println("Login successfully");
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.close();
		
		}

	}
		
		

}


