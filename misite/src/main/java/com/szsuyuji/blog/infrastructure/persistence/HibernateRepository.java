package com.szsuyuji.blog.infrastructure.persistence;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.reflect.TypeToken;

@SuppressWarnings("unchecked")
abstract public class HibernateRepository<T, E extends Serializable> {

	@SuppressWarnings("serial")
	private TypeToken<T> typeToken = new TypeToken<T>(getClass()) {
	};
	private Class<? super T> type = typeToken.getRawType();

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public T load(E e) {
		return (T)getSession().load(type, e);
	}

	public void store(T agg) {
		getSession().save(agg);
	}
}
