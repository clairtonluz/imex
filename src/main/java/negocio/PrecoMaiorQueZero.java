package negocio;

import engine.Context;
import engine.Task;

public class PrecoMaiorQueZero implements Task {

	@Override
	public void execute(Context context) {
		Produto produto = context.get("produto");
		
		if (produto.getPreco() <= 0) {
			context.addError("Preço Inválido.");
		}
	}
}
