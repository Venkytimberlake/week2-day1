package selen2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
WebElement eleUserName = driver.findElement(By.id("username"));
eleUserName.sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Integra");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("V");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatesh");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Pondicherry");
//WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
//Select dd=new Select(ele);
//dd.selectByValue("LEAD_CONFERENCE");
//driver.findElement(By.className("primaryEmail")).sendKeys("venkeeeys@gmail.com");

driver.findElement(By.className("smallSubmit")).click();

System.out.println(driver.findElement(By.id("viewLead_statusId_sp")).getText());
}

}
