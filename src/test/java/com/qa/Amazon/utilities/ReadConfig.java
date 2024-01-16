package com.qa.Amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadConfig {

    private static final Logger logger = Logger.getLogger(ReadConfig.class.getName());
    private Properties pro;

    public ReadConfig() {
        try {
            File src = new File("./ConfiurationFile/config.properties");
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Exception occurred while reading config file", e);
        }
    }

    public String getBaseUrl() {
        return getProperty("baseUrl");
    }

    public String getUsername() {
        return getProperty("username");
    }

    public String getPassword() {
        return getProperty("password");
    }

    public String getIePath() {
        return getProperty("iepath");
    }

    private String getProperty(String key) {
        if (pro != null) {
            return pro.getProperty(key);
        } else {
            logger.warning("Properties object is null. Returning null for key: " + key);
            return null;
        }
    }
}
