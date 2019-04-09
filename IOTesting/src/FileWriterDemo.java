import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) {
        String inputString;
        BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));

        try (FileWriter fileWriter = new FileWriter("testReader.txt")){
            do {
                inputString = bfreader.readLine();
                if (inputString.compareTo("stop") == 0) break;
                inputString += "\r\n";
                fileWriter.write(inputString);
            } while (0 == 0);

        } catch (IOException exc){
            System.out.println("Exception is " + exc.getMessage());
        }
    }
}
