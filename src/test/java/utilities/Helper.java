package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

public class Helper {
	
	public static void captureScreenshot(WebDriver driver, String screenshotname)
	{
		Path dest = Paths.get("./Screenshots", screenshotname+".png");
		try {
			Files.createDirectories(dest.getParent());
			FileOutputStream out = new FileOutputStream(dest.toString());
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Expection while taking screenshots"+ e.getMessage());
		}
	}

}
