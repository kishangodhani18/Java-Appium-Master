# Appium-with-Java
This project demonstrates "Andriod Mobile Automation" using Java with some examples.
I will update with more examples soon. Please expect a litle bit delay as I am pretty much occupied these days. Thank You.

## Start Appium Server using Appium desktop GUI App.
### Change Desire capability according to your Configuration. [Appium-capabilities](https://appium.io/docs/en/writing-running-appium/caps/)
```
For Example

//------------------ Android -------------
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "9.0.1");
        capabilities.setCapability("deviceName","devices-name here");
        capabilities.setCapability("platformName","Android");
        driver  = new AndroidDriver<MobileElement>(new URL("http://<Appium-server>:4723/"), capabilities);

//---------  iOS -------------
        DesiredCapabilities capabilities1 = new DesiredCapabilities();
        capabilities1.setCapability("platformVersion", "13.2.2");
        capabilities1.setCapability("deviceName","iPhone");
        capabilities1.setCapability("platformName","iOS");
        capabilities1.setCapability("udid","ud-id here");
        capabilities1.setCapability("autoAcceptAlerts","true");
        driver1 = new IOSDriver<MobileElement>(new URL("http://<Appium-server>:4723/"), capabilities1);"
```

## For Using Java run file

Build and run a file direct using RUN button on IDE.
