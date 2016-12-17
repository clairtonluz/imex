import engine.BusinessProcess;
import engine.Context;
import engine.ProcessType;
import negocio.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

/**
 * Created by clairton on 17/12/16.
 */
public class Teste {

    @Test
    public void deveriaTestarOProcesso(){
        Produto produto = new Produto();
        produto.setDesconto(1);
        Context context = new Context();
        context.add("produto", produto);

        BusinessProcess process = new BusinessProcess(ProcessType.REMEDIO_BRASIL);
        process.execute("tela1", context);

        Set<String> errors = context.getErrors();
        Assert.assertTrue(errors.contains("Preço Inválido."));
        Assert.assertTrue(errors.contains("Fora da validade"));
        Assert.assertTrue(errors.contains("Desconto Inválido."));
    }
}
