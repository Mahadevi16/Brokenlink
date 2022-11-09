package coding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Code {
	ChromeDriver driver;
	public void part1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement text = driver.findElement(By.className("title"));
		System.out.println(text.getText());
		System.out.println(text.getCssValue("font-size"));
		System.out.println(text.getCssValue("font-family"));
		System.out.println(text.getCssValue("font-weight"));
		System.out.println(text.getCssValue("color"));
		WebElement bgcolor = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul"));
		System.out.println(bgcolor.getCssValue("background")); // doubt on the result
		WebElement text1 = driver.findElement(By.id("home"));
		System.out.println(text1.getText());
		System.out.println(text1.getCssValue("font-size"));
		System.out.println(text1.getCssValue("font-family"));
		System.out.println(text1.getCssValue("font-weight"));
		System.out.println(text1.getCssValue("font-color"));
		//driver.findElement(By.id("blogsmenu")).click();
		WebElement text2 = driver.findElement(By.xpath("//p[text()='This blog is created for ']"));
		System.out.println(text2.getText());
		WebElement text3 = driver.findElement(By.linkText("http://www.Selenium143.blogspot.com"));
		System.out.println(text3.getCssValue("color"));
		System.out.println("-----------------");
		WebElement text4 = driver.findElement(By.id("pah"));
		System.out.println(text4.getText());
		System.out.println(text4.getCssValue("font-size"));
		System.out.println(text4.getCssValue("font-family"));
		System.out.println(text4.getCssValue("font-weight"));
		System.out.println(text4.getCssValue("color"));
		System.out.println("------------------------------------------------------");
		WebElement text5 = driver.findElement(By.xpath("//div[@id='Blog1']/div[1]/div/h2/span"));
		System.out.println(text5.getText());
		System.out.println(text.getCssValue("background-color"));
		System.out.println("--------------------------------------------------------");
		WebElement text6 = driver.findElement(By.xpath("//h2[text()=\'Multi Selection box\']"));
		System.out.println(text6.getText());
		Select dd2 = new Select(driver.findElement(By.id("multiselect1")));
		dd2.selectByIndex(3);
		System.out.println("--------------------------------------");
		Select dd1 = new Select(driver.findElement(By.id("drop1")));
		dd1.selectByVisibleText("doc 4");
		System.out.println("------------------------------------");
		driver.findElements(By.id("blog-pager"));//cannot able do anything Home
		System.out.println("---------------");
		driver.findElement(By.id("ta1")).sendKeys("Value passing");
		driver.findElement(By.id("ta1")).clear();
		driver.findElement(By.id("textbox1")).clear();
		driver.findElement(By.id("textbox1")).sendKeys("sentence");
		driver.findElement(By.xpath("//div[@id='BlogSearch1_form']/form/table/tbody/tr/td[1]/input")).sendKeys("hello");
		driver.findElement(By.className("gsc-search-button")).click();
		System.out.println("----------------------------");
		WebElement text7 = driver.findElement(By.xpath("//h2[text()='Radio options']"));
		System.out.println(text7.getText());
		WebElement text9 = driver.findElement(By.id("radio1"));
		text9.click();
		WebElement texts = driver.findElement(By.id("radio2"));
		texts.click();
		if(text9.isEnabled())
		{
		System.out.println("Male Radio button is selected");
		}
		
		System.out.println("---------------------------");
		WebElement text8 = driver.findElement(By.id("but1"));
		if(text8.isEnabled())
		{
			System.out.println("It is Enabled");
		}
		else
		{
			System.out.println("It is disabled");
		}
		WebElement text11 = driver.findElement(By.id("checkbox1"));
		WebElement text12 = driver.findElement(By.id("checkbox2"));
		text12.click();
		if(text11.isSelected())
		{
		System.out.println("Orange box is selected");
		}
		else if((text12.isSelected()))
		{
			System.out.println("Blue box selected");
		}
		else {
			System.out.println("No one is selected");
		}
		driver.findElement(By.xpath("//div[@id='HTML10']/div[1]/button[1]")).click();
		System.out.println("........................");
		WebElement text13 = driver.findElement(By.xpath("//div[@id='HTML31']/div[1]/form/text()[1]"));
		System.out.println(text13.getText());
		driver.findElement(By.xpath("//div[@id='HTML31']/div[1]/form/input[1]")).sendKeys("Hi");
		driver.findElement(By.xpath("//div[@id=\"HTML31\"]/div[1]/form/input[2]")).sendKeys("Hello");
		System.out.println("---------------------");
		WebElement txt = driver.findElement(By.id("table1"));
		System.out.println(txt.getText());
		
		
		
}
	public static void main(String[] args) {
		Code object=new Code();
		object.part1();
	}
}
