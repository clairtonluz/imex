package negocio;

import engine.Context;
import engine.Task;

import java.util.Date;

/**
 * Created by clairton on 07/12/16.
 */
public class DentroDaValidade implements Task {

    @Override
    public void execute(Context context) {
        Produto produto = context.get("produto");
        if (produto.getValidade().before(new Date()))
            context.addError("Produto vencido");
    }
}
