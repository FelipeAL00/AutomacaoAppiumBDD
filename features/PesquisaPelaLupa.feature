#language: pt
#enconding: utf-8
@PesquisaLupa
Funcionalidade: Pesquisa Pela Lupa

  Contexto: 
    Dado que estou na tela home

  @PesquisaLupaSucesso
  Esquema do Cenario: Pesquisa com sucesso
    Quando pesquiso pelo modelo "<modelo>"
    E clico na lupa
    E clico no modelo "<modelo2>"
    Entao estarei na tela do modelo "<modelo>"

    Exemplos: 
      | modelo                | modelo2                           |
      | HP ZBOOK 17 G2 MOBILE | HP ZBOOK 17 G2 MOBILE WORKSTATION |

  @PesquisaLupaFalha
  Esquema do Cenario: Pesquisa com falha
    Quando pesquiso pelo modelo "<modelo>"
    E clico na lupa
    Entao aparecerá uma mensagem de erro "<mensagem>"

    Exemplos: 
      | modelo       | mensagem                              |
      | Dell Supremm | - No results for \\"Dell Supremm\\" - |
