package br.com.footdata.footapi.service;

import java.util.List;

import br.com.footdata.footapi.model.Event;

public interface EventService {
    Event findById(String id);
    void deleteById(String id);
    Event save(Event event);
	List<Event> findAll();
}