package entidade;

import java.util.Date;


public class Venda {
    private String nome_produto, data_pagamento;
    private double valor;
    
    public Venda(String nome_produto, double valor, String data_pagamento){
        this.nome_produto = nome_produto;
        this.valor = valor;
        this.data_pagamento = data_pagamento;
    }

    public Venda() {
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

}
