package edu.hfut.wangyu.controller;

import edu.hfut.wangyu.dal.City;
import edu.hfut.wangyu.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @PostMapping(value = "/city")
    public Map findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {

        Map temp = new HashMap();
        temp.put("status","200 OK");
        temp.put("City",cityService.findCityByName(cityName));
        return temp;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getCityName() {
        return "one";
    }

}
