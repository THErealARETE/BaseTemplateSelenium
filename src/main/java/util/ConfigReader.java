package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class ConfigReader {
    public static Properties getPropertyObject() throws IOException {
        FileInputStream fp = new FileInputStream("Config/config.properties");
        Properties prop = new Properties();
        prop.load(fp);
        return prop;
    }


    private ConfigReader() {

    }

    public static String getUrl() throws IOException {
        return getPropertyObject().getProperty("url");
    }

    public static String getUserName() throws IOException {
        return getPropertyObject().getProperty("username");
    }

    public static String getPassword() throws IOException {
        return getPropertyObject().getProperty("password");
    }


}
