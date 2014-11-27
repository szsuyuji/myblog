package com.szsuyuji.blog.infrastructure.persistence;

import java.io.Serializable;

public interface Repository<T, E extends Serializable> {
	public T load(E e);

	public void store(T agg);
}
