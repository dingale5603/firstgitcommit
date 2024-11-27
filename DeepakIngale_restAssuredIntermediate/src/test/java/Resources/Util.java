package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Util {

	
	public static Properties prop;
	static RequestSpecification req;
	
	
	
	
	public static String ReadProperties(String key) throws IOException {
		prop= new Properties();
		FileInputStream fis= new FileInputStream("/Users/dipak.ingale/eclipse-workspace/DeepakIngale_restAssuredIntermediate/src/test/java/Resources/Objects.properties");
		prop.load(fis);
		return prop.getProperty(key)
		;
	}
	
	
	
	public static RequestSpecification  requestSpec() throws IOException {
		RequestSpecification req = (RequestSpecification) new RequestSpecBuilder()
				 .addHeader("Content-Type","application/json")
				 .setBaseUri(ReadProperties("baseURI"));
		 return req;
	}
	
	
	
    public void responceSpec() {
		
	}
}
