Para executar os algoritmos de decisão e o jogo do 4 em linha, apenas precisa de garantir que tem alguma versão recente do Java instalada.
Assim apenas precisamos de compilar todos os ficheiros executando a seguinte linha de instuções na shell:

javac Board.java && javac BoardMCTS.java && javac Jogo4Linha.java && javac Minimax.java && javac MinimaxAlphaBeta.java && javac MonteCarlo.java

Agora apenas precisamos de executar o código recorrendo à instrução:

java Jogo4Linha strategy 

em que strategy é o nome do algoritmo que queremos usar (pode ser "Minimax", "MinimaxAlphaBeta" ou "MonteCarlo").