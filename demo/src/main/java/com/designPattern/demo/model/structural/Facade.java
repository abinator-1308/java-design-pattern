package com.designPattern.demo.model.structural;

import java.sql.Driver;

class Firefox {
    public static Driver getFirefoxDriver() {
        return null;
    }

    public static void generateHTML(String test, Driver driver) {
        System.out.println("generate HTML code in Firefox");
    }

    public static void generateJunit(String test, Driver driver) {
        System.out.println("generate JUnit code in Firefox");
    }
}

class Chrome {
    public static Driver getChromeDriver() {
        return null;
    }

    public static void generateHTML(String test, Driver driver) {
        System.out.println("generate HTML code in Chrome");
    }

    public static void generateJunit(String test, Driver driver) {
        System.out.println("generate JUnit code in Chrome");
    }
}

class BrowserFacade {
    public static void generateReport(String browser, String test, String report) {
        Driver driver = null;
        switch (browser) {
            case "firefox":
                driver = Firefox.getFirefoxDriver();
                switch (test) {
                    case "html":
                        Firefox.generateHTML(test, driver);
                        break;
                    case "junit":
                        Firefox.generateJunit(test, driver);
                        break;
                }
                break;
            case "chrome":
                driver = Chrome.getChromeDriver();
                switch (test) {
                    case "html":
                        Chrome.generateHTML(test, driver);
                        break;
                    case "junit":
                        Chrome.generateJunit(test, driver);
                        break;
                }
                break;
        }
    }
}

public class Facade {
    public static void checkReport( ) {
        BrowserFacade.generateReport("chrome", "junit", "report");
    }
}
