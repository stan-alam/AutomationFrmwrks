package com.stan.automation.utils;

import org.apache.commons.io.FileUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Map;

/**
 * Loads and parses the config yaml file into a map of key-value pairs
 */
public class ConfigurationUtils {
    private static final String RESOURCE_DIR = "src/test/config/";
    private static final String DEFAULT_CONFIG = RESOURCE_DIR + "config.yaml";

    /**
     * Locate the config yamland return its absolute path
     * @param fileName the file (with extension) to find
     * @return the absolute path to the file
     */
    public static String locateResource(String fileName) {
        File root = new File(RESOURCE_DIR);
        File foundFile = null;
        try {
            boolean recursive = true;
            Collection<File> files = FileUtils.listFiles(root, null, recursive);

            for (File file : files) {
                if (file.getName().equals(fileName)) {
                    foundFile = file;
                    break;
                }
            }
            foundFile.getAbsolutePath();
        } catch (Exception e) {
            throw new IllegalArgumentException("Error in locating config file", e);
        }

        return foundFile.getAbsolutePath();
    }

    /**
     * Locate the file using locateResource() and then load its contents into a string
     * @param fileName the file to read
     * @return the file contents as a string, newlines preserved
     */
    public static String loadResource(String fileName) {
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(locateResource(fileName)));
            return new String(encoded, Charset.defaultCharset());
        } catch (IOException e) {
            throw new IllegalArgumentException("Supplied filename caused an IOException", e);
        }
    }

    public static String getStringProperty(String key) {
        return getStringProperty(key, DEFAULT_CONFIG);
    }
    
    /**
     * Look up a string value from the config file
     * Will throw a runtime exception if the value is not a string, not found
     */
    public static String getStringProperty(String key, String filePath) {
        Object value = getObjectProperty(key, filePath);

        if (! (value instanceof String))
            throw new IllegalArgumentException("Value for key " +key+ " is not a String");

        return (String)value;
    }


}
