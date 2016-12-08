package negocio;

import java.util.Date;

/**
 * Created by clairton on 07/12/16.
 */
public class Produto {
    private Date validade;

    public Produto(Date validade) {
        this.validade = validade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}
