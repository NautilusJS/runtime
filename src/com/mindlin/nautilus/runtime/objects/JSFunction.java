package com.mindlin.nautilus.runtime.objects;

@FunctionalInterface
public interface JSFunction {
	Object invoke(Object thiz, Object...params);
}