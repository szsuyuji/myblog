package com.szsuyuji.test;

import java.lang.reflect.Type;

import com.google.common.reflect.TypeToken;

abstract class AbstractDAO<T> {
	private final TypeToken<T> typeToken = new TypeToken<T>(getClass()) {
	};
	private final Type type = typeToken.getType();


	public void getType() {
		System.out.println(type);
	}
}
