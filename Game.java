import java.util.Random;
import java.io.File;
import java.util.Scanner;


public class Game {

public static void main(String [] args) throws Exception{

    File file = new File("filmy.txt");
    Scanner scanner = new Scanner(file);
    Scanner sc = new Scanner(file);

int film = 0;
int count = 0;
    Random random = new Random();

    while(scanner.hasNextLine()) {
        String line = scanner.nextLine();
        film++;
    }
        int r = random.nextInt(film);

    while(sc.hasNextLine()) {
        String lines = sc.nextLine();
        count++;
        if (r == count) {
            System.out.print(lines);
        }

    }





}


}
