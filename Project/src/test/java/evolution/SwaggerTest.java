package evolution;

import org.junit.Test;

import evolution.dto.DefaultSwagger;

public class SwaggerTest {
	@Test
	public void test() {
		String basePackageName = "com.evolution";
		String destinationPath = "/Users/chenli/Desktop/Swagger_Documents";
		SwaggerFactory.swaggers(basePackageName, destinationPath, new DefaultSwagger());
	}
}
