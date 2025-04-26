DesafioDIO-BancoDigital

Este projeto é um sistema bancário digital implementado em Java, desenvolvido como parte do desafio da Digital Innovation One (DIO). O objetivo é aplicar e demonstrar os principais conceitos de Programação Orientada a Objetos (POO): abstração, encapsulamento, herança e polimorfismo.

:pushpin: Funcionalidades

Conta Corrente (CheckingAccount)

Conta Poupança (SavingsAccount)

Operações básicas:

Depósito (deposit)

Saque (withdraw)

Transferência entre contas (transfer)

Validação de valores (positivos) e verificação de saldo suficiente

:file_folder: Estrutura do Projeto

DesafioDIO-BancoDigital/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/dio/bancodigital/
│   │           ├── Account.java
│   │           ├── CheckingAccount.java
│   │           ├── SavingsAccount.java
│   │           └── Main.java
├── .gitignore
└── README.md

Account.java: classe abstrata que define atributos e métodos comuns (deposit, withdraw, transfer).

CheckingAccount.java: representa Conta Corrente, herda de Account.

SavingsAccount.java: representa Conta Poupança, herda de Account.

Main.java: classe de entrada para testar operações bancárias.

:gear: Como Executar

Clone o repositório

git clone https://github.com/seu-usuario/DesafioDIO-BancoDigital.git

Navegue até o diretório

cd DesafioDIO-BancoDigital/src/main/java/com/dio/bancodigital

Compile os arquivos Java

javac *.java

Execute o programa

java Main

Observe a saída no console com os saldos após depósito, saque e transferência.

:memo: Exemplo de Uso

Saldo Conta Corrente Francisco Almeida R$: 300.0
Saldo Conta Poupança Camila Pereira R$: 500.0

:bulb: Próximos Passos

Adicionar tratamento de exceções customizadas (e.g., InsufficientFundsException).

Implementar taxas de serviço para Conta Corrente.

Calcular rendimento de juros para Conta Poupança.

Persistência de dados (banco de dados ou arquivos).

Interface gráfica ou API REST.

:handshake: Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

:star: Autor

Francisco Almeida

DesafioDIO-BancoDigital © 2025
