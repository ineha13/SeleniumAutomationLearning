package utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.Properties;

public class ConfigRead4 {

	Properties prop;

	public ConfigRead4() throws Exception {

		FileInputStream fis = new FileInputStream("./Config/confAmzScrnshot.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getSampleAppURL() {

		return prop.getProperty("appURL_Sample");

	}

	public String getBrowser() {

		return prop.getProperty("browser");

	}

}
