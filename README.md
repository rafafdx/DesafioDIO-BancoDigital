## Desafio DIO - Banco Digital (Java OOP)

Este projeto é um exercício de Programação Orientada a Objetos em Java, que simula um sistema bancário digital com dois tipos de conta:

- **CheckingAccount** (Conta Corrente)  
- **SavingsAccount** (Conta Poupança)

As operações suportadas são:

1. Depósito (`deposit`)  
2. Saque (`withdraw`)  
3. Transferência entre contas da própria instituição (`transfer`)

---

### 📁 Estrutura do Projeto

```bash
DesafioDIO-BancoDigital/
├── src/
│   ├── Account.java         # Classe abstrata com lógica comum
│   ├── CheckingAccount.java # Conta Corrente (herda de Account)
│   ├── SavingsAccount.java  # Conta Poupança (herda de Account)
│   └── Main.java            # Classe para testes das operações
└── README.md                # Este arquivo

🚀 Como Compilar e Executar
Navegue até a pasta src:
```bash
cd DesafioDIO-BancoDigital/src

```bash
javac *.java

```bash
java Main

Você verá no console as operações de depósito, saque e transferência, e os saldos atualizados.

###💡 Principais Conceitos de POO
Conceito | Onde aparece no código
Abstração | abstract class Account
Encapsulamento | Atributos private + getters/setters
Herança | class CheckingAccount extends Account
Polimorfismo | Métodos definidos em Account e herdados

### Próximas melhorias

Aplicar taxas em saques de CheckingAccount.

Calcular rendimentos em SavingsAccount.

Gerar extrato de transações.

Adicionar validações e lançar exceções customizadas.


⭐️ Se gostou, dê uma estrela no repositório!



© 2025 - Rafafdx - Projeto de estudo Java OOP
