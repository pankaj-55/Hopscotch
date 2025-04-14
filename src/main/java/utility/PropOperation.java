package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropOperation {
    public Properties properties;
    private String filePath;

    public PropOperation(String filePath) {
        this.filePath = filePath;
        File file = new File(filePath);
        try {
            FileInputStream inputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

    public void updateValue(String key, String value) {
        properties.setProperty(key, value);
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            properties.store(outputStream, "Updated properties file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
