// controls and links paths within project
package com.csis3275.controller_mku_03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csis3275.model_mku_03.Vehicle_mku_03;

@Controller // registers class as Controller with Spring
@RequestMapping("/vehicle-mku-03") // processes requests to/from vehicle-mku-03.jsp file
public class VehicleController_mku_03 {
	// default GET handler for info from vehicle_mku_03 file
	@RequestMapping(method = RequestMethod.GET)
	public String newVehicle(ModelMap model) {
		Vehicle_mku_03 vehicle = new Vehicle_mku_03();
		model.addAttribute("vehicle-mku-03", vehicle);
		return "vehicle-mku-03";
	}

	// default POST handler to process POST requests and validates user input on submission
	@RequestMapping(method = RequestMethod.POST)
	public String saveVehicle(Vehicle_mku_03 vehicle, BindingResult result, ModelMap model) {
		// to validate user inputs
		if (result.hasErrors()) {
			return "vehicle-mku-03";
		}
		
		// model attributes used in success-mku-03.jsp file on success
		model.addAttribute("success", "Your Vehicle Summary");
		model.addAttribute("vehicle-mku-03", vehicle);
		model.addAttribute("wheels", vehicle.getWheels());
		model.addAttribute("source", vehicle.getPowerSource());
		model.addAttribute("sound", vehicle.sound());
		model.addAttribute("seat", vehicle.seats());
		return "success-mku-03";
	}
	
	// model attribute set for drop down list called in vehicle-mku-03.jsp
	@ModelAttribute("years")
	public List<String> initializeYears() {
		List<String> years = new ArrayList<String>();
		years.add("2020");
		years.add("2019");
		years.add("2018");
		years.add("2017");
		years.add("2016");
		years.add("2015");
		years.add("2014");
		years.add("2013");
		years.add("2012");
		years.add("2011");
		years.add("2010");
		years.add("2009");
		years.add("2009");
		years.add("2008");
		years.add("2007");
		years.add("2006");
		years.add("<2005");
		return years;
	}
}
