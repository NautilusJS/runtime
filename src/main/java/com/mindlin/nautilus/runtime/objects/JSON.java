package com.mindlin.nautilus.runtime.objects;

import com.mindlin.nautilus.runtime.annotations.JSExtern;
import com.mindlin.nautilus.runtime.annotations.JSProperty;
import com.mindlin.nautilus.json.JSONUtils;

@JSExtern(isDefault = true)
public class JSON {
	@JSExtern
	@JSProperty
	public static Object parse(String t) {
		// TODO finish
		throw new UnsupportedOperationException();
	}

	@JSExtern
	@JSProperty
	public static String stringify(Object o) {
		return JSONUtils.serialize(o);
	}
	
	private JSON() {
		
	}
}
