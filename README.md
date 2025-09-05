# Agenda Telefônica Simples em Java
Este é um projeto de uma Agenda de Contatos simples, desenvolvido em Java como exercício para praticar conceitos fundamentais de Programação Orientada a Objetos (POO).
A aplicação roda inteiramente no console e permite ao usuário gerenciar uma lista de contatos que fica armazenada em memória enquanto o programa está em execução.
## ✨ Funcionalidades
O programa atualmente suporta as seguintes operações:
- **Cadastrar um novo contato**: Salva um novo contato com nome, telefone e e-mail.
- **Listar todos os contatos**: Exibe a lista de todos os contatos salvos na agenda.
- **Buscar um contato por nome**: Procura por um contato específico na agenda e exibe suas informações se encontrado.
- **Encerrar a aplicação**: Finaliza o programa.

## 🚀 Tecnologias Utilizadas
- **Java**: Linguagem principal do projeto.
- **`ArrayList`**: Estrutura de dados utilizada para armazenar a lista de contatos em memória.

## 🔧 Como Executar
1. Clone ou baixe este repositório para a sua máquina.
2. Abra o projeto em sua IDE Java preferida (por exemplo, IntelliJ IDEA, Eclipse).
3. Localize o arquivo . `src/AgendaTelefonica/Main.java`
4. Execute o método `main()` para iniciar o programa.
5. O menu interativo da agenda aparecerá no console da sua IDE.

## 📂 Estrutura do Projeto
O projeto está organizado de forma simples, com foco em demonstrar a separação de responsabilidades:
- : A classe que representa o "molde" de um contato. Define os **atributos** (dados) que um contato possui, como `nome`, , , etc., e seus **métodos** (comportamentos). `src/AgendaTelefonica/Contato.java``telefone1``email`
- : A classe principal que contém a lógica da aplicação (). É responsável por exibir o menu, interagir com o usuário e gerenciar a lista (`ArrayList`) de contatos. `src/AgendaTelefonica/Main.java``main`

## 🔮 Próximos Passos (Sugestões de Melhoria)
Como um projeto de aprendizado, ele pode ser expandido com novas funcionalidades:
- Implementar a **edição** de contatos existentes.
- Implementar a **exclusão** de contatos.
- **Salvar os contatos em um arquivo** (`.txt` ou `.csv`) para que os dados não sejam perdidos ao fechar o programa (persistência de dados).
- Melhorar a busca para permitir buscas parciais (ex: buscar por "rob" e encontrar "Roberto").
