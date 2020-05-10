import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        board.setBoard(10,40);
        board.colBoard();
        board.printColBoard();


//        board.loadBoard();
//        board.printBoard();



        Game game = new Game();
        game.init(10,10);
//        game.printColBoard();
        game.printGame();
        Scanner scan = new Scanner(System.in);
        while(true){
            String input = scan.nextLine();
            if(input.equals("q")){
                break;
            }
            game.moveTest(input);
//
        }
    }
}
