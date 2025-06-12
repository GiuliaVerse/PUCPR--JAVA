*** Settings *** 
Library    SeleniumLibrary

*** Variables ***
${BROWSER}                     chrome
${URL}                         http://localhost/Sem-Esperar-em-Filas/
${USUARIO}                     raquel
${SENHA}                       123
${CONFIRMAR_SENHA}             123

${NOME_CLIENTE}                Teste CPF Inválido
${CPF_INVALIDO}                111.111.111-11
${EMAIL_VALIDO}                teste@email.com
${TELEFONE_VALIDO}             (11) 91234-5678
${LOGIN_CLIENTE}               testeCPF
${SENHA_CLIENTE}               senha123
${CONFIRMAR_SENHA_CLIENTE}     senha123

*** Keywords ***
Abrir o navegador
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window

Fechar o navegador
    Sleep    1s
    Capture Page Screenshot
    Close Browser

Acessar a pagina home do site
    Go To    ${URL}

Clicar no botão Login do menu
    Click Link    id:login-navbar
    Sleep    2s

Clicar no botão Login Para Usuario
    Click Button    id:card-btn-user
    Sleep    2s

Preencher Campos de Login
    Input Text    id:usuario    ${USUARIO}
    Input Text    id:senha      ${SENHA}
    Sleep    2s

Clicar no botão Entrar
    Click Button    xpath=//button[contains(text(), "Entrar")]
    Capture Page Screenshot

Aguardar na pagina home do site
    Sleep    1s

# ==== CT1 ====
Acessar a pagina de cadastro
    Go To    http://localhost/Sem-Esperar-em-Filas/Components/userRegister/cadastro.html
    Wait Until Page Contains Element    id:nome    timeout=2s
    Sleep    1s

Preencher campos de cadastro com CPF inválido
    Input Text    id:nome              ${NOME_CLIENTE}
    Input Text    id:cpf               ${CPF_INVALIDO}
    Input Text    id:email             ${EMAIL_VALIDO}
    Input Text    id:telefone          ${TELEFONE_VALIDO}
    Input Text    id:login             ${LOGIN_CLIENTE}
    Input Text    id:senha             ${SENHA_CLIENTE}
    Input Text    id:confirmarSenha    ${CONFIRMAR_SENHA_CLIENTE}
    Sleep         1s

Clicar no botão Cadastrar
    Click Button    xpath=//button[contains(text(), "Cadastrar")]
    Sleep           1s

Verificar mensagem de erro CPF
    Wait Until Element Is Visible    css:.swal2-popup     timeout=2s
    Element Should Contain           css:.swal2-html-container    CPF inválido
    Sleep    1s
    Capture Page Screenshot
