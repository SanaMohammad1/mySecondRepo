package tek.sdet.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {
	private static ReadYamlFiles readYamlFiles;// private instance of this class// by using getInstance(String filePath)
	// we can use this class return instance of this class line 25 below == sigleton design pattern
	private HashMap propertyMap;

	private ReadYamlFiles(String filePath) throws FileNotFoundException {// constructor. inside it initializing
		//to read FileInputStream, and we use the yaml class obj to load the data from this yaml file
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filePath);
		Yaml yaml = new Yaml();
		this.propertyMap = yaml.load(fileInputStream);
	}

	public HashMap getYamlProperty(String key) {// this method return the yaml property, which stored in hashmap as key/Vslue in env_config.yml
		
		return (HashMap) this.propertyMap.get(key);
	}

	// this method checks if there is an instance of a class or not
	public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException {// this is the return instance
		if (readYamlFiles == null)
			readYamlFiles = new ReadYamlFiles(filePath);
		return readYamlFiles;

	}

}
