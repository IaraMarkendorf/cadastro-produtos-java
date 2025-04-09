package org.serratec.aula04.modelos;

public class Produto {
/*ATRIBUTOS PRIMITIVOS*/
	private String descricao;
	private double valor;
	private int quantidade;
	
/*CONSTRUTOR. Ele é chamado quando você cria um novo objeto do tipo Produto.
O this serve para diferenciar os atributos da classe (this.descricao) dos parâmetros que você recebe (descricao).*/
	private Produto(String descricao, double valor, int quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
/*METODOS GETTERS E SETTERS permitem acessar e alterar os atributos privados de forma controlada. Por exemplo:
getDescricao() retorna o valor atual da descrição.
setDescricao("Novo nome") altera a descrição do produto.*/
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
// Método para calcular ICMS (12% do valor total)
    public double calcularIcms() {
        double total = valor * quantidade;
        return total * 0.12;
    }
    
    
}

	
    
