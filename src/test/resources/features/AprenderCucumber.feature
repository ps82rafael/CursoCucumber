#language: pt
#author: Rafael
#encoding UTF-8


Funcionalidade: Apreder Cucumber 
	
	Como um aluno
	Eu  quero aprender a utilizar cucumber
	Para que eu possa automatizar criterios de aceitação
	
	
	Cenario: Deve exucutar a especificação
		Dado que eu criei o arquivo coretamente 
		Quando executa-lo
		Entao a especificacao deve finalizar com sucesso
		 
	@ImprimirContador
 	Cenario: Deve incrementar contador
 		Dado que o valor do contador e 15
 		Quando eu incementar em 3
 		Entao o valor do contador sera 18
 		
 	Cenario: Deve calcular atraso no praso de entrega
 		Dado que o prazo e dia 05/04/2018
 		Quando a entrega a atrasar 2 dias
 		Entao a entrega se efetuada em 07/04/2018
 		
 	Cenario: Deve calcular atraso no praso da china
 		Dado que o prazo e dia 05/04/2018
 		Quando a entrega a atrasar 2 dias
 		Entao a entrega se efetuada em 05/06/2018	
 		
 	Cenario: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    Dado que o nome do passageiro é "Fulano da Silva"
    Dado que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Entao o teste vai funcionar
    
 # Cenario: Deve reaproveitar os steps Dado do cenário anterior
 #   Dado que o ticket é AB167
 #   Dado que o ticket especial é AB167
 #   Dado que o valor da passagem é R$ 1120,23
  #  Dado que o nome do passageiro é "Cicrano de Oliveira"
  #  Dado que o telefone do passageiro é 9888-8888
    
 # Cenario: Deve negar todos os steps Dado dos cenários anteriores
 #   Dado que o ticket é CD123
 #   Dado que o ticket é AG1234
 #   Dado que o valor da passagem é R$ 1.1345,56
 #   Dado que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
 #   Dado que o telefone do passageiro é 1234-5678
#    Dado que o telefone do passageiro é 999-2223	
    
        

    
    
    
    
    
    
	 		
 	