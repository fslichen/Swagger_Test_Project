package evolution;

import java.util.Map;

import org.junit.Test;

import com.evolution.controller.AlphaController;
import com.evolution.controller.BetaController;
import com.evolution.controller.TheOtherController;
import com.evolution.controller.dto.AnyDto;

import evolution.dto.DefaultSwagger;
import evolution.dto.Property;

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
	
	@Test
	public void testExample() throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		Object zipCode4AlphaController = SwaggerFactory.apiExample(AlphaController.class, 
				AlphaController.class.getDeclaredMethod("post", AnyDto.class), 
				AnyDto.class.getDeclaredField("zipCode"));
		System.out.println(zipCode4AlphaController);
		Object zipCode4BetaController = SwaggerFactory.apiExample(BetaController.class, 
				BetaController.class.getDeclaredMethod("post", AnyDto.class), 
				AnyDto.class.getDeclaredField("zipCode"));
		System.out.println(zipCode4BetaController);
	}
	
	
}
