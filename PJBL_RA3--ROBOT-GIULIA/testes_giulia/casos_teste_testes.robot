*** Settings ***
Documentation    Teste do Cadastro de cliente com cpf inválido e Login do cliente com usuário e senha válidos
Resource         casos_teste_resources.robot

*** Test Cases ***
CT1 - Tentar cadastrar cliente com cpf inválido
    Abrir o navegador
    Acessar a pagina de cadastro
    Preencher campos de cadastro com CPF inválido
    Clicar no botão Cadastrar
    Verificar mensagem de erro CPF
    Fechar o navegador

CT2 - Login do cliente com usuário e senha válidos
    Abrir o navegador
    Acessar a pagina home do site
    Clicar no botão Login do menu
    Clicar no botão Login Para Usuario
    Preencher Campos de Login
    Clicar no botão Entrar
    Aguardar na pagina home do site
    Fechar o navegador
