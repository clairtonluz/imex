package negocio;

import engine.Context;
import engine.Task;

public class DescontoMenorQue100 implements Task {

	@Override
	public void execute(Context context) {
		Produto produto = context.get("produto");
		
		if (!produto.isDescontoValido()) {
			context.addError("Desconto Inválido.");
		}
	}
}
