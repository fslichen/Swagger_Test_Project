package evolution;

import java.util.Map;

import org.junit.Test;

import com.evolution.controller.ExamplePropertiesController;
import com.evolution.controller.dto.example.properties.AnyDto;

import evolution.dto.DefaultSwagger;
import evolution.dto.Property;

public class ExamplePropertiesTest {
	@Test
	public void testApiExampleProperties() throws NoSuchMethodException, SecurityException {
		Map<String, Property> map = SwaggerFactory.apiExampleProperties(ExamplePropertiesController.class, 
				ExamplePropertiesController.class.getDeclaredMethod("post", AnyDto.class), 
				AnyDto.class);
		System.out.println(map);
	}
	
	@Test
	public void testSwagger() {
		SwaggerFactory.swagger(ExamplePropertiesController.class, "", new DefaultSwagger());
	}
}
