package br.com.footdata.footapi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import br.com.footdata.footapi.model.Event;

@Repository
public interface EventRepository extends ElasticsearchRepository<Event, String> {
	Optional<Event> findById(String id);
	void deleteById(String id);
	List<Event> findAll();
}