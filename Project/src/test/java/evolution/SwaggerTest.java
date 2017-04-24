package evolution;

import org.junit.Test;

import evolution.dto.DefaultSwagger;

public class SwaggerTest {
	@Test
	public void test() {
		String basePackagePath = "/Users/chenli/Desktop/Playground/Git/Test_Project/Project/src/main/java/evolution";
		String destinationPath = "/Users/chenli/Desktop/Swagger_Documents";
		SwaggerFactory.swaggers(basePackagePath, destinationPath, new DefaultSwagger());
	}
}
