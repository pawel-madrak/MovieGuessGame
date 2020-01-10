import java.io.File;
import java.util.Random;
import java.util.Scanner;


public class Game {

    public static void main(String[] args) throws Exception {

        File file = new File("filmy.txt");
        Scanner scanner = new Scanner(file);
        Scanner sc = new Scanner(file);

        int film = 0;
        int count = 0;
        int loseCounter = 0;
        String movie = null;

        Random random = new Random();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            film++;
        }
        int r = random.nextInt(film);
        int wordLength;

        while (sc.hasNextLine()) {
            String lines = sc.nextLine();
            count++;
            if (r == count) {
                movie = lines;
            }
        }

        // do tego miejsca losuje film

        char[] movieChars = movie.toCharArray();
        char[] movieChars2 = movie.toCharArray();
        wordLength = movieChars.length;
        for (int i = 0; i < wordLength; i++) {
            if (movieChars[i] == ' ') {
                ;
            } else {
                movieChars[i] = '_';
            }
        }


        System.out.println(movieChars);
        System.out.println("You have guessed 0 wrong letters, insert latter ");

        //do tad losuje i zamienia tytul filmu

        Scanner input = new Scanner(System.in);
        String s = movie;

        while (loseCounter < 10) {
            char inputChar = input.next().charAt(0);
            boolean letterFound=false;

            for (int j = 0; j < movie.length(); j++) {
                char c = s.charAt(j);


                if (inputChar == c) {
                    letterFound=true;
                    movieChars[j] = inputChar;
                }


                }
            if (letterFound==false){
                loseCounter++;
            }


            System.out.print(movieChars);
            System.out.println("   You have guessed " + loseCounter + " wrong letters ");
            String win = String.valueOf(movieChars);

            if (win.equals(s)) {
                System.out.println(" you are a winner");
            } else if (loseCounter==10) {
                System.out.println("You loose, title: " +movie);
            }

            }


        }







    }




