import java.io.*;

public class Main {


    /* Input/OutputStream */

    public static void main(String[] args) throws IOException {

//        OutputStream out = new FileOutputStream("file.txt");
//        out.write("Hello World!\r\nIt's a miracle".getBytes());
//        out.close();

//        String fileName = "file.txt";
//        String data = "data";

        String fileName = "input.txt";
        String fileData = readFromFile(fileName);
        System.out.println(fileData);

        writeToFile(fileData, "output.txt");

    }

    public static String readFromFile (String fileName) throws IOException {
        InputStream input = new FileInputStream(fileName);
        StringBuilder result = new StringBuilder();
        int data = -1;
        while ((data = input.read()) >=0) {
            result.append((char)data);
        }
        input.close();
        return result.toString();

    }

    public static void writeToFile (String data, String fileName)  {
        try ( Writer out = new FileWriter(fileName);){
            out.write(data.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        out.close();
    }
}
