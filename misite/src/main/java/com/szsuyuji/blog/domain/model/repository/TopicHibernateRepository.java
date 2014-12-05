package com.szsuyuji.blog.domain.model.repository;

import org.springframework.stereotype.Repository;

import com.szsuyuji.blog.domain.model.Topic;
import com.szsuyuji.blog.infrastructure.persistence.HibernateRepository;

@Repository
public class TopicHibernateRepository extends HibernateRepository<Topic, Long> {


}
