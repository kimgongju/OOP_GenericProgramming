import java.io.*;
import java.util.*;

public class Element extends PhanTu<Integer> {
    public static List<Integer> list = new ArrayList<>();

    /**
     * method to compare two elements.
     * @param a T a
     * @return boolean if t is greater than a
     */
    @Override
    public boolean isGreaterThan(Integer a) {
        return super.t > a;
    }

    /**
     * default constructor.
     */
    public Element() {
        super.t = 0;
    }

    /**
     * export data to file.
     */
    public static void exportToFile() {
        try {
            String s; // string input from cmd
            Scanner sc = new Scanner(System.in); // input from cmd

            s = sc.nextLine();
            FileOutputStream fos = new FileOutputStream(s); // output to file
            Writer dos = new BufferedWriter(new OutputStreamWriter(fos)); // output to file

            for (Integer i : list) {
                dos.write(i + "\n");
            }
            dos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * get data from file.
     */
    public static void getData() {
        try {
            String s; // string input from cmd
            Scanner sc = new Scanner(System.in); // input from cmd

            s = sc.nextLine();
            File file = new File(s); // input from file
            Scanner input = new Scanner(file); // input from file
            int n = input.nextInt(); // number of elements

            for (int i = 1; i <= n; ++i){
                int x = input.nextInt();
                list.add(x);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }


    /**
     * main method.
     * @param args String[] args input
     */
    public static void main(String[] args) {
        getData();
        Collections.sort(list);
        exportToFile();
    }
}