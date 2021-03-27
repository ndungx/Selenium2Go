package selenium2go;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author NDungx
 */
public class Selenium2Go {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String driverPath = "chromedriver.exe"; //đường dẫn trỏ đến tập tin điều khiên trình duyệt

        //báo với JVM máy ảo java tải/ nạp/ load driver điều khiển trình duyệt
        // giống với hàm Class.forName() bên java web
        System.setProperty("webdriver.chrome.driver", driverPath);

        //trình duyệt xuất hiện
        WebDriver myBrowser = new ChromeDriver();
        //myBrowser chính là object trình duyệt, mình điều khiển qua code 
        //gọi các hàm bắt trình duyệt làm gì đó bằng '.'
        //default trình duyệt là 1/2 màn hình -> cần phóng to ra
        myBrowser.manage().window().maximize();

        myBrowser.get("https://youtube.com");

        //đi tìm ô search
        WebElement searchBox = myBrowser.findElement(By.id("search"));
        //đưa keyword: "chúng ta của hiên tại"
        searchBox.sendKeys("Chúng ta của hiện tại");

        WebElement searchButton = myBrowser.findElement(By.id("search-icon-legacy"));
        searchButton.click();
    }

}
