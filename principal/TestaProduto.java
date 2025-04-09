package org.serratec.aula04.principal;

import java.util.Scanner;

import org.serratec.aula04.modelos.Produto;

public class TestaProduto {

	/*MAIN. É o ponto de entrada da aplicação Java — o que é executado quando você roda o programa.*/
	public static void main(String[] args) {
		
		/*O Scanner serve para ler o que o usuário digita no console.
		A variável resposta é usada para controlar o loop — se o usuário digitar "N", o programa para.*/
		Scanner sc = new Scanner(System.in);
		String resposta = "S";
		
		
		/*LAÇO WHILE.Enquanto o usuário não disser "N" (não), o programa vai continuar cadastrando produtos.*/
		while(!resposta.equalsIgnoreCase("N")) {
	
			/*Pede para o usuário digitar as informações (nome, valor, quantidade).
			nextLine() lê uma linha inteira (String).
			nextDouble() e nextInt() leem valores numéricos.
			Depois do nextInt(), usamos sc.nextLine() para limpar o buffer e evitar erro na próxima leitura de texto.*/		
			System.out.println("Digite o nome do produto: ");
            String descricao = sc.nextLine();

            System.out.println("Digite o valor do produto: ");
            double valor = sc.nextDouble();

            System.out.println("Digite a quantidade do produto: ");
            int quantidade = sc.nextInt();
            sc.nextLine(); 

            /*CRIAÇÃO DO OBJETO PRODUTO. Aqui o programa cria um novo objeto da classe Produto, usando os dados digitados.*/
            Produto p = new Produto(descricao, valor, quantidade);

            /*CALCULO DO TOTAL E ICMS. O total é calculado diretamente. O ICMS é calculado usando o método da classe Produto.*/
            double total = p.getValor() * p.getQuantidade();
            double icms = p.calcularIcms();
			
            /*EXIBIÇÃO DOS DADOS*/
			System.out.println("\nDescrição: " + p.getDescricao());
            System.out.println("Valor: " + p.getValor());
            System.out.println("Total: " + total);
            System.out.println("ICMS: " + icms);
			
            /*PERGUNTA PARA CONTINUAR. Se o usuário digitar "S", o programa volta ao início do loop.*/
			System.out.print("\nDeseja continuar cadastrando? (S/N): ");
            resposta = sc.nextLine();
            System.out.println();
		}
		/*FIM DO PROGRAMA. Quando a resposta for "N", o loop termina e o programa imprime a mensagem final.*/
		System.out.println("Cadastro finalizado!");
        sc.close();
		
	}

}
