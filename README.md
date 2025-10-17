# 🧠 Trabalho de Polimorfismo em Java

## 🎯 Objetivo

Demonstrar o uso do **polimorfismo** em Java por meio de:

- ✔️ Herança entre classes
- ✔️ Sobrescrita de métodos (`@Override`)
- ✔️ Criação de métodos exclusivos em subclasses

Cada aluno pode usar a **criatividade** e escolher um tema diferente (ex: veículos, instrumentos, ferramentas, animais, eletrônicos, etc.) para desenvolver os exemplos.

---

## 📋 Requisitos

### 1️⃣ Classe Base (`Objeto`)
- ✅ Crie uma classe com **mínimo 5 atributos privados**:
  - `nome` (String)
  - `peso` (double)
  - `cor` (String)
  - `material` (String)
  - `valor` (double)
  - `emUso` (boolean) *(opcional)*

- ✅ Métodos obrigatórios:
  - `getters` e `setters` para todos os atributos
  - `acao()`: imprime uma ação genérica
  - `descricao()`: imprime uma descrição genérica com os atributos

---

### 2️⃣ Subclasses (mínimo 3)
Cada subclasse deve:

- 🔁 **Sobrescrever** os métodos:
  - `acao()` com comportamento específico
  - `descricao()` com descrição personalizada
- ➕ Criar **pelo menos 2 métodos próprios**
- 📦 Utilizar os atributos da classe base via getters e setters

---

### 3️⃣ Classe Principal (`TestePolimorfismo`)
- 🔨 Instanciar objetos de cada subclasse
- ✍️ Usar setters para definir atributos
- 👀 Mostrar atributos com getters
- 🎭 Chamar métodos:
  - `acao()`
  - `descricao()`
  - Métodos exclusivos de cada subclasse
- 💡 Mostrar o comportamento diferente do método `acao()` em cada subclasse (isso é o polimorfismo!)

---

## 📌 Resumo por Objeto

Cada objeto (subclasse) deve ter:

| Elemento | Requisito |
|----------|-----------|
| 🔢 Atributos | Mínimo de 5 |
| 🔁 Métodos sobrescritos | `acao()` e `descricao()` |
| ✨ Métodos próprios | Mínimo de 2 |
| ⚙️ Getters/Setters | Para todos os atributos |
| 🎭 Polimorfismo | Uso demonstrado na classe principal |

---

## 💡 TEMA CLÍNICA MÉDICA

