import java.util.Scanner;


public class MinimaxAlphaBeta{
    public static void run(){
        Scanner in = new Scanner(System.in);
        Board b = new Board();
        b.player = 1 + (int)(Math.random() * 2);
        int jogada = 0;
        while(b.gameOver()==0){
            b.print();          
            if(b.player==1){
                boolean valid = false;
                while(!valid){
                    jogada = in.nextInt()-1;
                    if (b.canInsert(jogada)){valid=true;}
                    else{System.out.println("A jogada nao e valida");}
                }   
            }
            else{long start = System.currentTimeMillis();
                int[] count = new int[1];
                count[0] = 0;
                jogada = b.minimaxalphabeta(10, true, Integer.MIN_VALUE, Integer.MAX_VALUE,count)[0];
                System.out.println("count = "+count[0]);
                long finish = System.currentTimeMillis();
                System.out.println("time = "+ (finish - start)/1000.0);}
            b = b.insert(jogada);
            b.changePlayer();
        }
        b.print();
        if(b.gameOver()==1){System.out.println("Ganhou jogador 1");}
        if(b.gameOver()==2){System.out.println("Ganhou jogador 2");}
        if(b.gameOver()==3){System.out.println("Empate");}
        in.close();
    }
}
