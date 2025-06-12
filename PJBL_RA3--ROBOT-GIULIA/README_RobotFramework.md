
# Projeto de Testes Automatizados com Robot Framework

## Descrição

Este projeto consiste na implementação de testes automatizados utilizando o Robot Framework. Ele é focado em validar funcionalidades de um sistema web por meio de arquivos de testes estruturados em formato `.robot`.

## Objetivo

O objetivo principal do projeto é demonstrar a aplicação de testes automatizados, organizando os recursos de teste e os próprios casos de teste em arquivos separados, seguindo boas práticas de automação e reutilização de código.

## Tecnologias Utilizadas

- **Robot Framework**
- **Linguagem de marcação Robot**
- **Bibliotecas: SeleniumLibrary, RequestsLibrary** (conforme aplicável)
- **Python 3.x**
- **IDE recomendada: VS Code com extensão Robot Framework Language Server**

## Estrutura do Projeto

O projeto está organizado em dois arquivos principais:

### 1. `casos_teste_resources.robot`
- Contém recursos compartilhados entre os testes, como:
  - Variáveis
  - Palavras-chave reutilizáveis
  - Configuração inicial

### 2. `casos_teste_testes.robot`
- Contém os casos de teste propriamente ditos.
- Utiliza os recursos definidos no arquivo de recursos.
- Estrutura clara de `*** Test Cases ***` para organização dos cenários.

## Como Executar

1. Instale o Robot Framework:
   ```bash
   pip install robotframework
   ```

2. (Opcional) Instale bibliotecas adicionais, como Selenium:
   ```bash
   pip install robotframework-seleniumlibrary
   ```

3. Execute os testes:
   ```bash
   robot casos_teste_testes.robot
   ```

4. Consulte os relatórios gerados (`log.html`, `report.html`).

## Requisitos

- Python 3.x
- Robot Framework instalado
- Drivers e bibliotecas conforme os testes (ex: ChromeDriver para Selenium)

## Conclusão

Este projeto demonstra a estruturação de testes automatizados com Robot Framework, promovendo reutilização de palavras-chave, clareza nos cenários e separação de responsabilidades entre recursos e testes.
