# Sistema Bancário em Java

## Descrição

Este projeto é uma implementação simples de um **Sistema Bancário desenvolvido em Java**, criado com o objetivo de demonstrar conceitos fundamentais da **Programação Orientada a Objetos (POO)**.

O sistema simula operações básicas de contas bancárias, como exibição de informações, depósito, cálculo de rendimento em conta poupança e limite de saque em conta corrente.

Este projeto é ideal para fins educacionais, especialmente para estudantes que estão aprendendo conceitos como **herança, encapsulamento e sobrescrita de métodos em Java**.

---

## Funcionalidades

O sistema possui três tipos de contas:

### Conta

Classe base do sistema bancário.

Funcionalidades:

* Armazenar titular da conta
* Armazenar número da conta
* Armazenar saldo
* Exibir informações da conta
* Realizar depósitos

---

### ContaPoupanca

Classe que herda da classe **Conta**.

Funcionalidades adicionais:

* Definir taxa de juros
* Aplicar rendimento sobre o saldo
* Exibir taxa de rendimento

---

### ContaCorrente

Classe que herda da classe **Conta**.

Funcionalidades adicionais:

* Definir limite de crédito
* Calcular limite total disponível para saque

---

## Estrutura do Projeto

```
projeto
│
├── Conta.java
├── ContaPoupanca.java
├── ContaCorrente.java
└── Main.java
```

Descrição dos arquivos:

* **Conta.java** → Classe base do sistema bancário
* **ContaPoupanca.java** → Classe de conta poupança com cálculo de juros
* **ContaCorrente.java** → Classe de conta corrente com limite de saque
* **Main.java** → Classe principal responsável por executar o sistema

---

## Conceitos de Programação Utilizados

Este projeto utiliza diversos conceitos de **Programação Orientada a Objetos**, incluindo:

* Encapsulamento
* Herança
* Sobrescrita de métodos (`@Override`)
* Construtores
* Métodos getters e setters
* Organização de classes

---


## Objetivo do Projeto

O objetivo principal deste projeto é **praticar conceitos básicos de Java e Programação Orientada a Objetos**, simulando um pequeno sistema bancário.

---

## Autor

Felipe Crivelli Lima

---

## Licença

Este projeto é destinado para fins educacionais e de aprendizado.
