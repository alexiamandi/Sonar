package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsoNtoObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsoNtoObjectApplication.class, args);
		JsoNtoObjectApplication obj = new JsoNtoObjectApplication();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		try {

			// Convert JSON string from file to Object

			// ArrayList<Spring> spring = mapper.readValue(new
			// URL("http://localhost:9000/api/resources?resource=33&format=json"),
			// Spring.class);
			// System.out.println(spring);

		
			ArrayList<Spring> result;

			
		result = mapper.readValue(new URL("http://localhost:9000/api/resources?format=json"),
					mapper.getTypeFactory().constructCollectionType(ArrayList.class, Spring.class));
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i).toS());
		}
		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
