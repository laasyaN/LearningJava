package Average;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class gift {

    public static int getPersonIndex(String x, String[] names) {

        int index = 0;

        for (int a = 0; a < names.length; a++) {
            if (names[a].equals(x)) {

                index = a;
                break;
            }
        }


        return index;
    }

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/laasya/IdeaProjects/Fundementals/F1/src/Average/gift1.in");
        Scanner sc = new Scanner(file);

        int i = sc.nextInt();

        //5 member array

        String[] names = new String[i + 1];
        int[] amounts = new int[i + 1];

        //intializing array
        for (int x = 0; x < i + 1; x++) {
            names[x] = sc.nextLine();
            amounts[x] = 0;
        }


        while (sc.hasNext()) {

            String giverName = sc.nextLine();
            int amount = 0;
            if (sc.hasNextInt()) {
                amount = sc.nextInt();
            }
            int numberOfPeople = 0;
            if (sc.hasNextInt()) {
                numberOfPeople = sc.nextInt();
            }


            int giveAmount = 0;

            if (numberOfPeople > 0) {  //error checking, stays at 0 if false
                giveAmount = (int) amount / numberOfPeople;

            }

            //removes money from first perons
            amounts[getPersonIndex(giverName, names)] = amounts[getPersonIndex(giverName, names)] - amount;

            for (int c = 0; c < numberOfPeople + 1; c++) {

                if (sc.hasNextLine()) {
                    int index = getPersonIndex(sc.nextLine(), names);
                    amounts[index] += giveAmount;
                }

            }

            int remainAmount = amount - (numberOfPeople * giveAmount);

            //gives remaing to giver

            amounts[getPersonIndex(giverName, names)] += remainAmount;


        }


        FileOutputStream out = new FileOutputStream("give1.out");

        for (int x = 1; x < i + 1; x++) {
            String s = names[x] + " " + amounts[x] + "\n";
            System.out.println(s);
            out.write(s.getBytes());
        }
        out.close();


    }

}
