package com.sonar;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Home {
	Logger logger = Logger.getLogger("myLogger");

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Instance instance) {
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String GetMetrics(Instance instance, Model model) {

		ArrayList<Metric> metrics = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		model.addAttribute("ok", "It's NOT ok!");
		try {
			metrics = mapper.readValue(new URL(instance.getLink() + "api/resources?metrics=lines&format=json"),
					mapper.getTypeFactory().constructCollectionType(ArrayList.class, Metric.class));
			model.addAttribute("ok", "It's ok!");
		} catch (MalformedURLException e) {
			logger.log(null, "Eroare:", e);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
			logger.log(null, "Eroare:", e);
		} catch (JsonMappingException e) {
			logger.log(null, "Eroare:", e);
		} catch (IOException e) {
			logger.log(null, "Eroare:", e);
		}
		model.addAttribute("link", instance.getLink());
		model.addAttribute("metrics", metrics);
		return "result";
	}
}
