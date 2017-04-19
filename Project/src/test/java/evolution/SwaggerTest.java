package evolution;

import org.junit.Test;

public class SwaggerTest {
	@Test
	public void test() {
		String projectPath = "/Users/chenli/Desktop/Playground/Git/Test_Project/Project/src/main/java/evolution";
		String destinationPath = "/Users/chenli/Desktop/Swagger_Documents";
		SwaggerFactory.swaggers(projectPath, destinationPath);
	}
}
