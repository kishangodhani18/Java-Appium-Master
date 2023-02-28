import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidTest {
    AndroidDriver driver = null;
    private final static Logger log=Logger.getLogger(AndroidTest.class);

    @BeforeMethod
    public void setUp() throws URISyntaxException, MalformedURLException {
        System.out.println("setUp");
        log.debug("setUp");

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "GM1901");
            caps.setCapability(MobileCapabilityType.UDID, "a70eaf07");
            caps.setCapability(MobileCapabilityType.APP, "com.samsung.android.oneconnect");
            caps.setCapability(MobileCapabilityType.NO_RESET, true);
            caps.setJavascriptEnabled(true);
            caps.setAcceptInsecureCerts(true);
            URL url = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url, caps);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void someTest() {
        System.out.println("driver " + driver.getSessionId());
        System.out.println("driver " + driver.getOrientation());
        log.debug("someTest");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown");
        log.debug("tearDown");
    }

}
