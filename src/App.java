import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Calculating correct values?");

        int sum = 0;
        int count = 0;
        // CR = 13 LF = 10 CRLF = 13 10
        // 48-57 = 0-9
        // 97-122 a-z
        // one = 111 110 101 two = 116 119 111 three = 116 104 114 101 101 four = 102 111 118 114 five = 102 105 118 101
        // six = 115 105 120 seven = 115 101 118 101 110 eight = 101 105 103 104 116 nine = 110 105 110 101  
        // o t f s e n

        try {
            FileReader reader = new FileReader("C:\\Users\\ben-p\\Desktop\\advent\\advent\\src\\data.txt");

            int firstNumber = 0; 
            int secondNumber = 0;
            

            while (reader.ready()) {
                int currentSymbol = reader.read();
                if (currentSymbol > 58) {
                    // written numbers this is going to be ugly
                    
                    // one
                    if (currentSymbol == 111) {
                        
                    }
                    // two
                    if (currentSymbol == 111) {
                        
                    }
                    // three
                    if (currentSymbol == 111) {
                        
                    }
                    // four
                    if (currentSymbol == 111) {
                        
                    }
                    // five
                    if (currentSymbol == 111) {
                        
                    }
                    // six
                    if (currentSymbol == 111) {
                        
                    }
                    // seven
                    if (currentSymbol == 111) {
                        
                    } 
                    // eight 
                    if (currentSymbol == 111) {
                        
                    }
                    // nine
                    if (currentSymbol == 111) {
                        
                    }  
                    continue;
                }  
                else if (currentSymbol == 13) {
                    reader.skip(1);
                    sum = sum + (firstNumber*10 + secondNumber);
                    count++;
                    System.out.println(firstNumber*10 + secondNumber);
                    firstNumber = 0;
                    secondNumber = 0;
                    continue;
                } 
                else {
                    if (firstNumber == 0) {
                        firstNumber = currentSymbol - 48;
                        secondNumber = firstNumber;
                    } else {
                        secondNumber = currentSymbol - 48;
                    } 
                }

            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    	System.out.println("counter:" + count);
        System.out.println("the final sum is: " + sum);
        System.out.println(sum + 53);
    }
}

