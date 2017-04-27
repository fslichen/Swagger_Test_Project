package evolution;

import org.junit.Test;

import com.evolution.controller.TheOtherController;

import evolution.dto.DefaultSwagger;

public class SwaggerTest {
	@Test
	public void testSwaggers() {
		String basePackageName = "com.evolution";
		String destinationPath = "/Users/chenli/Desktop/Swagger_Documents";
		SwaggerFactory.swaggers(basePackageName, destinationPath, new DefaultSwagger());
	}
	
	@Test
	public void testSwagger() {
		SwaggerFactory.swagger(TheOtherController.class, "/Users/chenli/Desktop/Swagger_Documents/TheOtherController.yaml", new DefaultSwagger());
	}
}
