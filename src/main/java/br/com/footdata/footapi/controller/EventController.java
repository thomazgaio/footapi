package br.com.footdata.footapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.footdata.footapi.model.Event;
import br.com.footdata.footapi.service.EventService;
import br.com.footdata.footapi.util.Util;

@RestController
public class EventController {

	@Autowired
	public EventService service;

	@RequestMapping("/event")
	public Event event(@RequestParam(value="id") String id) {
		Event event = null;

		if(!Util.isEmpty(id)) {
			int intId = Util.DUMMY_INTEGER;

			try{
				intId = Integer.parseInt(id);
			}catch (NumberFormatException e) {
				return null;
			}

			if(intId > Util.DUMMY_INTEGER) {
				event = service.findById(id);
			}
		}

		return event;
	}
}
