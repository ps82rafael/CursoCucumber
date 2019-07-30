#language: pt
#author: Rafael
#encoding UTF-8


 Funcionalidade: Buscar um Produto no Ecommerce Livelo
                 Eu como um usuário do site livelo vou adiconar 
                 um produto no carrinho.
                 
 
 	Contexto: Tela de Home
 	    Dado acessar o site da Livelo
 	 
 	  Cenario: Buscar Produto
 		  Quando Digitar em busca Caixa JBL
 		  E Clicar em Enter
 		
 		
 		 Cenario: Selecionar o produto
 		   Dado Clicar em Caixa de Som Portatil JBL Charger  
	     Quando Clicar em Selecione a Voltagem 
		   E Clicar e BIVOLT
		   Entao Clicar em ADICIONAR AO CARRINHO 	
 		
 