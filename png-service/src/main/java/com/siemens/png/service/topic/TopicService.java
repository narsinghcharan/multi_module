package com.siemens.png.service.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siemens.png.dataaccess.topic.TopicRepository;
import com.siemens.png.model.topic.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList();
		
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	List<Topic> topics = new ArrayList(Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework description"),
			new Topic("Hibernate", "Hibernate Framework", "Hibernate Framework description"),
			new Topic("WebServices", "Webservices Framework", "WebServices Description")));
	/*	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
*/
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
