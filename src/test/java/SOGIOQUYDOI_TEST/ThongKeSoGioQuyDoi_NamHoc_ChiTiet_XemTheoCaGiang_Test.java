package SOGIOQUYDOI_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageSetup.Setup;
import SOGIOQUYDOI_PAGE.ThongKeSoGioQuyDoi_NamHoc_ChiTiet_XemTheoCaGiang_Page;

public class ThongKeSoGioQuyDoi_NamHoc_ChiTiet_XemTheoCaGiang_Test {
	static WebDriver driver;
	@BeforeSuite
	public void Setup() throws InterruptedException {
		Setup setup = new Setup();
		driver = setup.setup();
		Thread.sleep(2000);
	}
	@BeforeTest
	public void Setup2() throws InterruptedException {
		ThongKeSoGioQuyDoi_NamHoc_ChiTiet_XemTheoCaGiang_Page MainPage = new ThongKeSoGioQuyDoi_NamHoc_ChiTiet_XemTheoCaGiang_Page(driver);
		MainPage.navigateToPage();
		MainPage.selectLessonType();
		MainPage.SearchInput("Năm học");
		MainPage.ChooseYear("2023 - 2024");
		MainPage.selectMajor("Tất cả");
		MainPage.switchToDetailsTab();
	}
	@Test
	public void Action() throws InterruptedException {
		System.out.println("Testcase 1:Chức năng xem danh sách thống kê số giờ quy đổi của giáo viên theo Học Kỳ với chi tiết và xem theo ca giảng");
		Thread.sleep(2000);
		WebElement dataElement = driver.findElement(By.xpath("//*[@id=\"tblStatisticsDetails\"]/tbody"));
		String getDatString = dataElement.getText();
		System.out.println(getDatString);
		System.out.println("========");

	}

	@Test
	public void Action2() throws InterruptedException {
		System.out.println("Testcase 2:Chức năng xem danh sách thống kê số giờ quy đổi của giáo viên theo Học Kỳ hiển thị 25 dữ liệu với chi tiết và xem theo ca giảng");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"tblStatisticsDetails_length\"]/label/select"));
		Select select = new Select(dropdown);
		select.selectByValue("25");
		Thread.sleep(2000);
		WebElement dataElement = driver.findElement(By.xpath("//*[@id=\"tblStatisticsDetails\"]/tbody"));
       String getDatString=dataElement.getText();
       System.out.println(getDatString);
		System.out.println("========");
	}
	@Test
	public void Action3() throws InterruptedException {
		System.out.println("Testcase 3:Chức năng xem danh sách thống kê số giờ quy đổi của giáo viên theo Học Kỳ hiển thị 50 dữ liệu với chi tiết và xem theo ca giảng");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"tblStatisticsDetails_length\"]/label/select"));
		Select select = new Select(dropdown);
		select.selectByValue("50");
		Thread.sleep(2000);
		WebElement dataElement = driver.findElement(By.xpath("//*[@id=\"tblStatisticsDetails\"]/tbody"));
       String getDatString=dataElement.getText();
       System.out.println(getDatString);
       System.out.println("========");

	}
	@Test
	public void Action4() throws InterruptedException {
		System.out.println("Testcase 4:Chức năng xem danh sách thống kê số giờ quy đổi của giáo viên theo Học Kỳ hiển thị tất cả dữ liệu với chi tiết và xem theo ca giảng");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"tblStatisticsDetails_length\"]/label/select"));
		Select select = new Select(dropdown);
		select.selectByValue("-1");
		Thread.sleep(2000);
		WebElement dataElement = driver.findElement(By.xpath("//*[@id=\"tblStatisticsDetails\"]/tbody"));
       String getDatString=dataElement.getText();
       System.out.println(getDatString);
		System.out.println("========");

	}
	@AfterTest
	public void Close() {
		driver.close();
	}
}
