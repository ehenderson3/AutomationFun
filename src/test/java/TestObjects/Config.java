package TestObjects;

public interface Config {
    final String baseUrl            = System.getProperty("baseUrl", "http://staffing-manager.dev.surgeforward.com/");
    //final String baseUrl            = System.getProperty("baseUrl", "https://comsearch.dev.surgeforward.com");
    //final String baseUrl            = System.getProperty("baseUrl", "https://legosandbox.com");
    final String browser            = System.getProperty("browser", "chrome");
    final String host               = System.getProperty("host","localhost");// "localhost" or browserstack
    final String browserVersion     = System.getProperty("browserVersion","54");
    final String platform           = System.getProperty("platform","Windows");
    final String os_version         = System.getProperty("os_version","7");
    final String resolution         = System.getProperty("resolution","1920 x 1080");

}
