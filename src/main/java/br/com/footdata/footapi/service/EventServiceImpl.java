package br.com.footdata.footapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.footdata.footapi.dao.EventRepository;
import br.com.footdata.footapi.model.Event;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    @Autowired
    public void setSubjectRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

	@Override
	public Event save(Event event) {
		if(event!=null) {
			return eventRepository.save(event);
		}else {
			return null;
		}
	}

	@Override
	public Event findById(String id) {
		return eventRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteById(String id) {
		eventRepository.deleteById(id);
	}

	@Override
	public List<Event> findAll() {
		return eventRepository.findAll();
	}

}