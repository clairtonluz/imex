package negocio;

import java.util.Date;

import engine.Context;
import engine.Task;

public class DentroDaValidade implements Task {

	@Override
	public void execute(Context context) {
		Produto produto = context.get("produto");
		
		if (produto.getValidade() == null || 
				produto.getValidade().before(new Date())) {
			context.addError("Fora da validade");
		}
	}
}
