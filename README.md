# 🛒 Cadastro de Produtos - Java Console App

Este é um projeto simples de console desenvolvido em **Java**, com o objetivo de praticar **Programação Orientada a Objetos (POO)**.  
O sistema permite o **cadastro de produtos**, calculando o valor total da compra e o **ICMS** (Imposto sobre Circulação de Mercadorias e Serviços) de 12%.

---

## 📦 Estrutura do Projeto

📁 src ├── org.serratec.aula04.modelos │ └── Produto.java # Classe que representa o produto (modelo) ├── org.serratec.aula04.principal │ └── TestaProduto.java # Classe principal com interação via console

---

## 🚀 Como funciona

1. O programa solicita ao usuário:
   - Nome (descrição) do produto
   - Valor unitário
   - Quantidade

2. Com base nesses dados:
   - Calcula o **valor total** (`valor * quantidade`)
   - Calcula o **ICMS (12%)** sobre o valor total

3. Exibe todas as informações no console.

4. Pergunta se o usuário deseja continuar cadastrando produtos.

---

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento (`private`, `getters` e `setters`)
- Construtores
- Métodos com retorno (`calcularIcms`)
- Laço `while`
- Uso do `Scanner` para entrada de dados
- Interação básica com o usuário via terminal

---

## 🖥️ Exemplo de uso

Digite o nome do produto: Notebook Digite o valor do produto: 3500 Digite a quantidade do produto: 2

Descrição: Notebook Valor: 3500.0 Total: 7000.0 ICMS: 840.0

Deseja continuar cadastrando? (S/N): N

Cadastro finalizado!
---

## 📌 Requisitos

- Java 8 ou superior
- IDE como Eclipse, IntelliJ ou editor com suporte a Java
- Terminal / console para entrada de dados

---

## 👩‍💻 Autora

Desenvolvido por **Iara Markendorf** como parte dos estudos em Java e Orientação a Objetos.

---
