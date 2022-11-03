package utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.Properties;

public class ConfigReadFrame {

	Properties prop;

	public ConfigReadFrame() throws Exception {

		FileInputStream fis = new FileInputStream("./Config/confFrame.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getSampleAppURL() {

		return prop.getProperty("appURL");

	}

	public String getBrowser() {

		return prop.getProperty("browser");

	}

}
