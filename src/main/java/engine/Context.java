package engine;

import java.util.*;

/**
 * Created by clairton on 07/12/16.
 */
public class Context {
    private final Set<String> erros = new LinkedHashSet<>();
    private final Map<String, Object> dados = new HashMap<>();


    public void add(String key, Object value) {
        dados.put(key, value);
    }

    public <T> T get(String key) {
        return (T) dados.get(key);
    }

    public void addError(String erro) {

        erros.add(erro);
    }

    public Set<String> getErros() {
        return Collections.unmodifiableSet(erros);
    }

    public boolean hasError(){
        return !erros.isEmpty();
    }

}
