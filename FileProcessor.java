import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
    //method to read integer from file
    public static List<Integer> readFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine())!= null){
            try {
                numbers.add(Integer.parseInt(line.trim()));
            } catch (NumberFormatException e){
                System.out.println("Invalid number format");
            }
        }
        } return numbers;
    } 
    //method to perform division on a list of integers
    public static List<String> divideNumbers(List<Integer> numbers, int divisor){
    List<String> results = new ArrayList<>();
    for (Integer num : numbers) {
        try {
            results.add(String.valueOf(num / divisor));
        }catch (ArithmeticException e){
            System.out.println("Division by zero error for number 0");
        }
    } return results;
    } 
    //method to write results
    public static void writeFile(String fileName, List<String> results) throws IOException{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            for (String result : results){
                bw.write(result);
                bw.newLine();

            } bw.close();
        }
    }
    public static void main(String[] args) {
        int divisor = 2;

        try{
            List<Integer> numbers = readFile("input.txt");
            List<String> results = divideNumbers(numbers, divisor);
            writeFile("output.txt", results);
        } catch (IOException e){
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}
