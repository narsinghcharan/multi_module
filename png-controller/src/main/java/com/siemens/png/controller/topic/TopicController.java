package com.siemens.png.controller.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siemens.png.model.topic.Topic;
import com.siemens.png.service.topic.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value="/topics" , method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public List<Topic> getAllTopic() {
		
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{topicId}")			//it is recommended to have same name.
	public Topic getTopic(@PathVariable("topicId") String id) {
		return topicService.getTopic(id);
	}	//http://localhost:8080/topics/Spring
	
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		
		topicService.addTopic(topic);
	}
}
