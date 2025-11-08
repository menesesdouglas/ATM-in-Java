# ATM-in-Java

Um sistema bancário simples desenvolvido em Java que simula operações básicas de um caixa eletrônico (ATM).

## 📋 Descrição

Este projeto implementa um sistema de conta bancária com funcionalidades essenciais como depósito, saque e consulta de saldo. O sistema utiliza tratamento de exceções personalizadas para garantir a integridade das operações financeiras.

## 🚀 Funcionalidades

- **Criar Conta**: Inicializa uma conta bancária com número identificador
- **Consultar Saldo**: Visualiza o saldo atual da conta
- **Depositar**: Adiciona valores à conta
- **Sacar**: Retira valores da conta (com validação de saldo)
- **Validações**: Tratamento de erros para operações inválidas

## 🛠️ Tecnologias

- Java
- Tratamento de exceções customizadas
- Scanner para entrada de dados

## 📁 Estrutura do Projeto

```
src/com/github/menesesdouglas/projetos/
├── Main.java                        # Classe principal com interface do usuário
├── ContaBancaria.java               # Classe que gerencia a conta bancária
└── SaldoInsuficienteException.java  # Exceção customizada para saldo insuficiente
```

## 🎯 Como Usar

1. **Compilar o projeto**:
```bash
javac com/github/menesesdouglas/projetos/*.java
```

2. **Executar o programa**:
```bash
java com.github.menesesdouglas.projetos.Main
```

3. **Seguir as instruções no menu**:
   - Informar o número da conta
   - Escolher uma operação:
     - `1` - Consultar saldo
     - `2` - Realizar depósito
     - `3` - Realizar saque
     - `0` - Sair do sistema

## 💡 Exemplo de Uso

```
--- Banco CN - Coreia do Norte ---
Informe o número da conta: 12345

--- Banco CN - Coreia do Norte ---
Bem vindo!
1. Saldo
2. Depositar
3. Sacar
0. Sair
```

## ⚠️ Validações Implementadas

- **Depósito**: Não permite valores zero ou negativos
- **Saque**: Verifica se há saldo suficiente e se o valor é válido
- **Exceções tratadas**:
  - `SaldoInsuficienteException`: Quando o saldo é insuficiente para o saque
  - `IllegalArgumentException`: Quando valores inválidos são informados

## 🔧 Melhorias Futuras

- Implementar persistência de dados
- Adicionar múltiplas contas
- Incluir histórico de transações
- Adicionar autenticação com senha
- Implementar transferências entre contas

## 👤 Autor

Douglas Meneses - [@menesesdouglas](https://github.com/menesesdouglas)

## 📝 Licença

Este projeto é de código aberto e está disponível para fins educacionais.
