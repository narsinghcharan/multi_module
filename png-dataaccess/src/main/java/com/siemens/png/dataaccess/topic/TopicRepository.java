package com.siemens.png.dataaccess.topic;

import org.springframework.data.repository.CrudRepository;

import com.siemens.png.model.topic.Topic;


//@Repository("topicRepository")
public interface TopicRepository extends CrudRepository<Topic, String> 
{
	//getAllTopic()
	//getTopic(String id)
	//updateTopic(Topic topic)
	//deleteTopic(String id)
	
}
