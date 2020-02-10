#language: pt
#coding:utf-8
Funcionalidade: Pesquisa pela home

  Contexto: 
    Dado que estou na tela home

  @PesquisaSucesso
  Esquema do Cenario: Pesquisa com sucesso
    Quando clico em um produto "<produto>"
    E clico em um modelo "<modelo>"
    Entao estarei na tela do produto "<modelo>"

    Exemplos: 
      | produto | modelo                       |
      | mice    | MICROSOFT SCULPT TOUCH MOUSE |

  @PesquisaFalha
  Esquema do Cenario: Pesquisa com falha
    Quando clico em um produto "<produto>"
    E clico em filtro
    E clico em um filtro especifico "<tipoFiltro>"
    E clico na opcao do filtro  "<tipoAdicionadoDeFiltro>"
    E clico em outro  "<tipoFiltro2>"
    E clico na opcao "<tipoAdicionadoDeFiltro2>" atraves de index
    Entao terei a seguinte mensagem "<result>"

    Exemplos: 
      | produto   | tipoFiltro       | tipoAdicionadoDeFiltro                                                                                             | tipoFiltro2  | tipoAdicionadoDeFiltro2 | result         |
      | headphone | By Compatibility | Compatible with most notebook PCs, netbooks, tablets, mobile phones, and MP3 players with a 3.5 mm port available. | BY CONNECTOR | BlueTooth               | - No results - |
