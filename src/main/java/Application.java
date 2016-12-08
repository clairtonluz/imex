import engine.Context;
import engine.Task;
import negocio.DentroDaValidade;
import negocio.Produto;

import java.util.Date;

/**
 * Created by clairton on 07/12/16.
 */
public class Application {


    public static void main(String... args) {
        Context context = new Context();
        context.add("produto", new Produto(new Date(0)));

        Task task = new DentroDaValidade();
        task.execute(context);

        if (context.hasError()) {
            context.getErros().forEach(System.err::println);
        }
    }
}
