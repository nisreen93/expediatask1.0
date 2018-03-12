package com.expedia.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.expedia.domain.Generic;
import com.expedia.util.ApiUtil;

@Controller
@RequestMapping("api")
public class ApiController {

	private Map<String, Generic> apiMap = new HashMap<String, Generic>();

	@RequestMapping(value="/getmethodlist", method = { RequestMethod.GET },produces = "application/json")
	public @ResponseBody List<Generic> getMethodList() {
		ApiUtil.generateRoot();
		apiMap.put("1", new Generic(1, "../api/destinationname", "DestinationName", null, ApiUtil.getDestinationName()));
		apiMap.put("2", new Generic(2, "../api/lengthofstay", "LengthOfStay", null, ApiUtil.getLengthOfStay()));
		apiMap.put("3", new Generic(3, "../api/mintripstartdate", "MinTripStartDate", ApiUtil.getMinTripStartDate(), null));
		apiMap.put("4", new Generic(4, "../api/mintripstartdate", "MaxTripStartDate", ApiUtil.getMaxTripStartDate(), null));
		apiMap.put("5", new Generic(5, "../api/minstarrating", "MinStarRating", ApiUtil.getMinStarRating(), null));
		apiMap.put("6", new Generic(6, "../api/maxstarsating", "MaxStarRating", ApiUtil.getMaxStarRating(), null));
		apiMap.put("7", new Generic(7, "../api/minsotalsate", "MinTotalRate", ApiUtil.getMinTotalRate(), null));
		apiMap.put("8", new Generic(8, "../api/maxtotalpate", "MaxTotalRate", ApiUtil.getMaxTotalRate(), null));
		apiMap.put("9", new Generic(9, "../api/minguestrating", "MinGuestRating", ApiUtil.getMinGuestRating(), null));
		apiMap.put("10", new Generic(10, "../api/maxguestrating", "MaxGuestRating", ApiUtil.getMaxGuestRating(), null));
		return new ArrayList<Generic>(apiMap.values());
	}

	
	@RequestMapping(value = "/updateapi", method = { RequestMethod.POST })
	public @ResponseBody Generic updateApi(@RequestParam("api") String api) {
		return apiMap.get(api);
	}

}
