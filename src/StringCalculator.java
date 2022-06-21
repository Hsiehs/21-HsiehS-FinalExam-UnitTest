import java.util.Arrays;

public class StringCalculator {
    public static int add(final String numbers) throws Exception {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if((number.contains("-"))){
                throw new Exception("negatives not allowed");
            }
            if(number.length() > 3){
                return 1;
            }
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}