import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fr = new FileReader("names.txt");
        Scanner fileScanner = new Scanner(fr);
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int decision = 5;

        while (fileScanner.hasNextLine())
        {
            arrayList.add(fileScanner.nextLine());
        }
        while (exit == false){
            System.out.print(
                    "Press 1 to learn about salary.\n" +
                            "Press 2 to learn about the job.\n" +
                            "Press 3 to learn about demand.\n" +
                            "Press 4 to view current students.\n" +
                            "Press 5 to quit.\n");
            decision = input.nextInt();

            switch (decision) {
                case 1:
                    System.out.print("$98,345 average salary in South Florida!\n");
                    break;
                case 2:
                    System.out.print("US News - 100 Best Jobs!\n");
                    break;
                case 3:
                    System.out.print("Top 10 Forbes In-Demand Jobs!\n");
                    break;
                case 4:
                    System.out.print("Current Students:\n");
                    arrayList.forEach(System.out::println);
                    break;
                case 5:
                    exit = true;
                    break;
            }
        }
      }
    }
