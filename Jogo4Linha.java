public class Jogo4Linha {
    public static void main(String args[]){
        if(args.length==0){return;}
        if(args[0].equals("Minimax")){Minimax.run();}
        if(args[0].equals("MinimaxAlphaBeta")){MinimaxAlphaBeta.run();}
        if(args[0].equals("MonteCarlo")){MonteCarlo.run();}
        return;
    }
}
