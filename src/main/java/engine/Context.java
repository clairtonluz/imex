package engine;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Context {

	private final Set<String> errors = new LinkedHashSet<>();
	private final Map<String, Object> data = new HashMap<>();

	public void addError(String msg) {
		errors.add(msg);
	}

	public Set<String> getErrors() {
		return Collections.unmodifiableSet(errors);
	}

	public void add(String key, Object value) {
		data.put(key, value);
	}

	@SuppressWarnings("unchecked")
	public <T extends Object> T get(String key) {
		return (T) data.get(key);
	}
}
