package com.testing;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClasss {
	//Browser launch()
	
	public static WebDriver driver;
	public static File file;
	public static  ExtentReports extentReports; 
	protected static void launchingBrowser(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver(); }
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver(); }
		driver.manage().window().maximize();	
	}
	//Launch URL
	protected static void launchingURL(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {

			Assert.fail("ERROR:OCCURE DURING URL LAUNCHING");}
	}
	//Sendkeys
	protected static void passInput(WebElement element ,String value) {
		
		try {
			element .sendKeys(value);
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING VALUE PASSING IN THE ELEMENT");
		}
	}
	protected static void clickElement(WebElement element) {
		 try {
			element.click();
		} catch (Exception e) {
			
			Assert.fail("ERROR:OCCURE DURING CLICKING THE ELEMENT");	 
		}}
		 //Navigation
		 protected static void navigationMethods (String type) {
			 try {
				if (type.equalsIgnoreCase("forward")) {
				driver.navigate().forward();	
				}
				 else if (type.equalsIgnoreCase("back")) {
						driver.navigate().back();	
					}  else if (type.equalsIgnoreCase("refresh")) {
						driver.navigate().refresh();	
					}
			} catch (Exception e) {
				Assert.fail("ERROR:OCCURE DURING THE NAVIGATION");
			}
		 }
		 
		protected static void navigateTOUrl(String url) {
			try {
				driver.navigate().to(url);
			} catch (Exception e) {
				Assert.fail("ERROR:OCCURE DURING THE NAVIGATION URL PASSING");
			}}
//Dropdown
		protected static void selectDropdown(WebElement element, String type, String value ) {
			
			Select select = new Select (element);
			
			try {
				if (type.equalsIgnoreCase("value")) {
					select.selectByValue(value);}
				else if (type.equalsIgnoreCase("visible text")) {
					select.selectByVisibleText(value);}
				else if (type.equalsIgnoreCase("index")) {
					select.selectByIndex(Integer.parseInt(value));}
			} catch (NumberFormatException e) {
				Assert.fail("ERROR:OCCURE DURING THE DROPDOWN SELECTION CHECK THE TYPE AND VALUE");
			}}
//implicitwaits
			protected static void implicitWait(String type, int num) {
				try {
					if (type.equalsIgnoreCase("seconds")) {
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
						}else if (type.equalsIgnoreCase("minutes")) {
							driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(num));	
						}
				} catch (Exception e) {
					Assert.fail("ERROR:OCCURS DURING DYNAMIC IMPLICIT WAITING PERIOD CHECK THE TYPE AND TIME");
				}}//explicitwait
			protected static void explicitWait(WebElement element, String waitType,int num)	{
				
				WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(num));
				
				try {
					if (waitType.equalsIgnoreCase("visibility")) {
						wait.until(ExpectedConditions.visibilityOf(element) );
						}else if (waitType.equalsIgnoreCase("clickable"))  {
						wait.until(ExpectedConditions.elementToBeClickable(element));	
						}else if (waitType.equalsIgnoreCase("presence"))  {
							wait.until(ExpectedConditions.invisibilityOf(element));}
				} catch (Exception e) {
					Assert.fail("ERROR:OCCURS DURING DYNAMIC IMPLICIT WAIT");
				}}
			//get title & current URL
		protected static void getTitle() 
			{
			    try {
					String title = driver.getTitle();
					System.out.println("Page title:"+title);
					String currentUrl = driver.getCurrentUrl();
					System.out.println("Current title:"+currentUrl);
				} catch (Exception e) {
					Assert.fail("ERROR:OCCURS DURING GETTING PAGE TITLE AND URL");
									}}
			    //scroll up & down
			    protected static void scrollUpDown(int pixel, String direction) {
			    	try {
						JavascriptExecutor js= (JavascriptExecutor)driver;
						if (direction.equalsIgnoreCase("down")) {
							js.executeScript("window.scrollBy(O,"+pixel+");");
						}else if (direction.equalsIgnoreCase("up")) {
							js.executeScript("window.scrollBy(O,-"+pixel+");");
						}
					} catch (Exception e) {
						Assert.fail("ERROR:OCCURS DURING PAGE SCROLLUP & SCROLLDOWN");
					} }
			    //select options
			    protected static void selectOption(WebElement element, String type, String value) {
			    	try {
						Select select= new Select(element);
						if (type.equalsIgnoreCase("text")) {
							select.selectByVisibleText(value);}
						else if (type.equalsIgnoreCase("index")) {
							select.selectByIndex(Integer.parseInt(value));}
						else if (type.equalsIgnoreCase("value")) {
							select.selectByIndex(Integer.parseInt(value));}
					} catch (Exception e) {
						Assert.fail("ERROR:OCCURS DURING VALUE SELECTION");
					}}
			    		
				//deselect options
			    protected static void deSelectOption (WebElement element , String type, String value) {
			    	try {
						Select select= new Select(element);
						if (type.equalsIgnoreCase("text")) {
							select.deselectByVisibleText(value);}
						else if (type.equalsIgnoreCase("index")) {
							select.deselectByIndex(Integer.parseInt(value));}
						else if (type.equalsIgnoreCase("value")) {
							select.deselectByValue(value);}
					} catch (Exception e) {
						Assert.fail("ERROR:OCCURS DURING VALUE DESELECTION");
					}}
				//Robot Actions
			    protected static void robot(int keyEvent, String actionType) {
			    	try {
						Robot robot= new Robot();
						if (actionType.equalsIgnoreCase(actionType)) {
							robot.keyPress(keyEvent);}
						else if (actionType.equalsIgnoreCase(actionType)) {
							robot.keyRelease(keyEvent);}
					} catch (AWTException e) {
						Assert.fail("ERROR:OCCURS DURING ROBOT ACTION");
					}}
			    //FRAMES
			    protected static void switchToFrame(WebElement element, String type,int num) {
			    	try {
						if (type.equalsIgnoreCase("index")) {
							driver.switchTo().frame(Integer.parseInt(type));}
						else if (type.equalsIgnoreCase("name")) {
						driver.switchTo().frame(element);}
						else if (type.equalsIgnoreCase("element")) {
							driver.switchTo().frame(element);}
					} catch (NumberFormatException e) {
						Assert.fail("ERROR:OCCURS DURING SWITCHING TO FRAME");
					}	}
			    //windows handling
			    protected static void windowsHandling(int num) {
			    	try {
						List<String> window = new ArrayList (driver.getWindowHandles());
						driver.switchTo().window(window.get(num));
					} catch (Exception e) {
						Assert.fail("ERROR:OCCURS DURING HANDLING TO WINDOWS");
					}}
			    //alert
			    
			    protected static void alert(String button) {
			    	try {
						if (button.equalsIgnoreCase("ok")) {
							driver.switchTo().alert().accept();}
						else if (button.equalsIgnoreCase("cancel")) {
							driver.switchTo().alert().dismiss();}
					} catch (Exception e) {
						Assert.fail("ERROR:OCCURS DURING ACCEPT/REJECT POP-UP MESSAGE");
					}}
			    //Actions
			    protected static void performAction(String actionType,WebElement element) {
			    	try {
						Actions actions = new Actions(driver);
						if (actionType.contains("move")) {
							actions.moveToElement(element).perform();}
						else if(actionType.contains("doubleclick")) {
						actions.doubleClick(element).perform();	
						}else if(actionType.contains("rightclick")) {
						actions.contextClick(element).perform();}
					} catch (Exception e) {
						Assert.fail("ERROR:OCCURS DURING PERFORMING ACTION");
					}}
			    	
			    //Take Screenshot
			    protected static void takeScreenshot(String fileName) throws IOException {
			    
			    	try {
						TakesScreenshot Shot= (TakesScreenshot)driver;
						File Src =Shot.getScreenshotAs(OutputType.FILE);
						File dest= new File(fileName);
						FileHandler.copy(Src , dest);
					} catch (IOException e) {
						Assert.fail("ERROR:OCCURS DURING TAKING SCREENSHOT");	
					}
			    	
			    	
			    }
			    public static void extentReportStart(String location) {
					extentReports = new ExtentReports();
					file = new File(location);
					ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
					extentReports.attachReporter(sparkReporter);
					extentReports.setSystemInfo("OS", System.getProperty("os.name"));
					extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
				}

				public static void extentReportTearDown(String location) throws IOException {
					extentReports.flush();
					file = new File(location);
					Desktop.getDesktop().browse((file).toURI());
				}

				public String takeScreenshot() throws IOException {
					TakesScreenshot screenshot = (TakesScreenshot) driver;
					String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
					File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
					File destfile = new File("Screenshort\\.png" + "_" + timeStamp + ".png");
					FileUtils.copyFile(scrfile, destfile);
					return destfile.getAbsolutePath();
				}
			  
}
			    		
			
			    
			    
				
			
		 
	


