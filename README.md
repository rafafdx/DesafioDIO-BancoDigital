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


