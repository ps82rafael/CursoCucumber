#language: pt
#author: Rafael
#encoding UTF-8
Funcionalidade: Alugar Filme
  
  Como um usuario
  Eu quero cadastrar alugueis de filmes 
  para cadastrar preços e datas de entrega
  
	@AlugarFilmeSucesso
  Cenario: Deve alugar um filme com sucesso 
    Dado um filme 
    | estoque | 2     |
    | preco   | 3     |
    | tipo    | comum |
    Quando Alugar
    Entao o preco do aluguel sera R$ 3
    E a data de entrega sera em 1 dia  
    E o estoque do filme sera 1 unidade
  
  @AlugarFilmeSemEstoque
  Cenario: Nao devera alugar um filme sem estoque
    Dado um filme com estoque com 0 unidades
    Quando Alugar
    Entao nao sera possivel por falta de estoque
    E o estoque do filme sera 0 unidade
    
  @AlugarFilme
  Esquema do Cenario: Deve dar condiçoes conforme tipo de aluguel
    Dado um filme com estoque com 2 unidades
    E que o preco de aluguel seja R$ <preco>
    E que o tipo do aluguel seja <tipo>
    Quando Alugar
    Entao o preco do aluguel sera R$ <valor>
    E a data de entrega sera em <qtdDias> dias
    E a pontuacao sera de <pontuacao> pontos
    
  Exemplos:  
      | preco |  tipo      | valor | qtdDias | pontuacao |
      |    4  |  extendido |   8   |       3 |         2 |
      |    4  |   comum    |   4   |       1 |         1 |
     #|    10 | extendido  |   20  |       3 |         2 |
		  |    5  | semanal    |   15  |       7 |         3 |
  