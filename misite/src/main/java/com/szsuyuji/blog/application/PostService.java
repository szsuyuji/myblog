/**
 * 
 */
package com.szsuyuji.blog.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szsuyuji.blog.domain.model.Topic;
import com.szsuyuji.blog.infrastructure.persistence.Repository;

/**
 * 发贴服务
 * 
 * @author 孙月江
 * 
 */
@Service("postService")
public class PostService {

	@Autowired
	private Repository<Topic, Long> topicRepository;


	@Transactional
	public Long postNewTopic(String title, String content) {
		Long authorId = 0L;
		Topic topic = new Topic(title, content, authorId);
		topicRepository.store(topic);
		return topic.getId();
	}
}
