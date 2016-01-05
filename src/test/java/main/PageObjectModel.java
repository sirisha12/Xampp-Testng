package main;

import java.util.concurrent.TimeUnit;

import staticMethods.FlightBooking;
import staticMethods.Home;
import staticMethods.Payment;
import staticMethods.SignUp;
import utilities.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageObjectModel

{
	private WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws Exception {

		driver.get(Constant.url);

		Thread.sleep(2000);

		// Home Page

		Home.checkboxClick(driver);

		Thread.sleep(2000);

		Home.pageNext(driver);

		Thread.sleep(2000);

		// SignUp

		SignUp.passForenameSendKeys(driver, "sirisha");

		Thread.sleep(2000);

		SignUp.passSurnameSendKeys(driver, "nalam");

		Thread.sleep(2000);

		SignUp.radioClick(driver);

		Thread.sleep(2000);

		SignUp.passAddressSendKeys(driver, "Arunodaya Colony");

		Thread.sleep(2000);

		SignUp.passAddress2SendKeys(driver, "Madhapur");

		Thread.sleep(2000);
		;

		SignUp.passCitySendKeys(driver, "Hyderabad");

		Thread.sleep(2000);
		;

		SignUp.code(driver, "500081");

		Thread.sleep(2000);

		SignUp.phone(driver, "9494634250");

		Thread.sleep(2000);

		SignUp.county(driver);

		Thread.sleep(2000);

		SignUp.pageNext1(driver);

		Thread.sleep(2000);

		// Flight Booking

		FlightBooking.departure(driver);

		Thread.sleep(2000);

		FlightBooking.passDeparturedateSendKeys(driver, "29/09/2015");

		Thread.sleep(2000);

		FlightBooking.arrival(driver);

		Thread.sleep(2000);

		FlightBooking.passReturndateSendKeys(driver, "15/10/2015");

		Thread.sleep(2000);

		FlightBooking.number(driver, "3");

		Thread.sleep(2000);

		FlightBooking.roundtripClick(driver);

		Thread.sleep(2000);

		FlightBooking.seatingClick(driver);

		Thread.sleep(2000);

		FlightBooking.ticketClick(driver);

		Thread.sleep(2000);

		FlightBooking.button(driver);

		Thread.sleep(2000);

		// Payment
		Payment.card1(driver, "1234567890");

		Thread.sleep(2000);

		Payment.name1(driver, "sirisha");

		Thread.sleep(2000);

		Payment.expiry(driver);

		Thread.sleep(2000);

		Payment.exp(driver);

		Thread.sleep(2000);

		Payment.num(driver, "234");

		Thread.sleep(2000);

		Payment.pay(driver);

		Thread.sleep(2000);

	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();

	}

}
