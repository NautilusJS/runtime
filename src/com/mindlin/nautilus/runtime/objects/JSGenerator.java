package com.mindlin.nautilus.runtime.objects;

public interface JSGenerator<T> {
	T next(Object...values);
}
