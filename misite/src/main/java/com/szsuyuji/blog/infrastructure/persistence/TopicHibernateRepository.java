package com.szsuyuji.blog.infrastructure.persistence;

import org.springframework.stereotype.Repository;

import com.szsuyuji.blog.domain.model.Topic;

@Repository
public class TopicHibernateRepository extends HibernateRepository<Topic, Long> {


}
