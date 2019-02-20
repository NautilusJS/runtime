import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;

import com.mindlin.nautilus.runtime.JSScriptEngine;
import com.mindlin.nautilus.runtime.JSScriptEngineFactory;

module com.mindlin.nautilus.runtime {
	requires transitive java.scripting;
	requires transitive com.mindlin.nautilus;
	
	exports com.mindlin.nautilus.runtime;
	exports com.mindlin.nautilus.runtime.annotations;
	exports com.mindlin.nautilus.runtime.objects;
	
	provides ScriptEngineFactory with JSScriptEngineFactory;
	provides ScriptEngine with JSScriptEngine;
}