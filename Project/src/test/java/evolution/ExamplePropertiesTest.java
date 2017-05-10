package evolution;

import java.util.Map;

import org.junit.Test;

import com.evolution.controller.AlphaController;
import com.evolution.controller.ExamplePropertiesController;
import com.evolution.controller.dto.example.properties.AnyDto;

import evolution.dto.Property;

public class ExamplePropertiesTest {
	@Test
	public void testExampleProperties() throws NoSuchMethodException, SecurityException {
		Map<String, Property> map = SwaggerFactory.apiExampleProperties(AlphaController.class, 
				AlphaController.class.getDeclaredMethod("post", AnyDto.class), 
				AnyDto.class);
		System.out.println(map);
	}
	
	@Test
	public void test() throws NoSuchMethodException, SecurityException {
		Map<String, Property> map = SwaggerFactory.apiExampleProperties(ExamplePropertiesController.class, 
				ExamplePropertiesController.class.getDeclaredMethod("post", AnyDto.class), 
				AnyDto.class);
		System.out.println(map);
	}
}
