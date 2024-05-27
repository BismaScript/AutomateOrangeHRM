package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public static FileInputStream fs;
    public static Properties prob= new Properties();
    public static String getconfig(String configKey) throws IOException {
        fs= new FileInputStream("config/config.properties");
        prob.load(fs);
        return prob.getProperty(configKey);
    }
}
