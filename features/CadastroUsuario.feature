#language: pt
#coding:utf-8
Funcionalidade: Cadastro de usuario

  Contexto: 
    Dado que estou no menu da tela home
    Quando clico no botao logar
    E clico em Criar uma nova conta

  @cadastroComSucesso
  Esquema do Cenario: Cadastro com sucesso
    E informo o username "<Username>"
    E informo o email "<email>"
    E informo a senha "<senha>"
    E informo a confirmacao da senha "<senhaConfirm>"
    E informo o primeiro nome "<primeiroNome>"
    E informo o ultimo nome "<ultimoNome>"
    E informo o telefone "<telefone>"
    E informo o Pais "<Pais>"
    E informo o estado "<estado>"
    E informo o endereco "<endereco>"
    E informo a cidade "<cidade>"
    E informo o CEP "<CEP>"
    E clico em não receber ofertas e promocoes
    E clico em registrar
    Entao o meu usuario aparece conectado como "<Username>"

    Exemplos: 
      | Username | email                       | senha   | senhaConfirm | primeiroNome | ultimoNome | telefone     | Pais   | estado    | endereco       | cidade          | CEP       |
      | BRUN1010 | felipe.almeidaa14@gmail.com | Felipe2 | Felipe2      | Felipe       | Silva      | (11)94444223 | Brazil | São Paulo | Rua Bueno, 188 | Taboão da Serra | 06784-200 |

  @cadastroComFalha
  Esquema do Cenario: Cadastro com falha
    E informo o username "<Username>"
    E informo o email "<email>"
    E informo a senha "<senha>"
    E informo a confirmacao da senha "<senhaConfirm>"
    E informo o primeiro nome "<primeiroNome>"
    E informo o ultimo nome "<ultimoNome>"
    E informo o telefone "<telefone>"
    E informo o Pais "<Pais>"
    E informo o estado "<estado>"
    E informo o endereco "<endereco>"
    E informo a cidade "<cidade>"
    E informo o CEP "<CEP>"
    E clico em não receber ofertas e promocoes
    Entao nao consigo me registrar porque as senhas estao diferentes

    Exemplos: 
      | Username | email                       | senha    | senhaConfirm | primeiroNome | ultimoNome | telefone     | Pais   | cidade          | endereco       | estado    | CEP       |
      | BRUN303  | felipe.almeidaa14@gmail.com | Felipe32 | Felipe2      | Felipe       | Silva      | (11)94444223 | Brazil | Taboão da Serra | Rua Bueno, 188 | São Paulo | 06784-200 |
