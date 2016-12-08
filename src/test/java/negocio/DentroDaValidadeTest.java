package negocio;

import engine.Context;
import engine.Task;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by clairton on 07/12/16.
 */
public class DentroDaValidadeTest {
    Context context;

    @Before
    public void setUp() throws Exception {
        context = new Context();
    }

    @Test
    public void deveriaValidarProdutoForaDaValidade() throws Exception {
        Task task = new DentroDaValidade();
        context.add("produto", new Produto(new Date(0)));
        task.execute(context);

        Assert.assertTrue(context.hasError());
        Assert.assertEquals(1, context.getErros().size());
        String expected = "Produto vencido";
        Assert.assertTrue(context.getErros().contains(expected));
    }
}