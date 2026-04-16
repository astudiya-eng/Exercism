public class Say {
    private final String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private final String[] scales = {"", "thousand", "million", "billion"};

    public String say(long number) {
        if (number == 0) return "zero";
        if (number < 0 || number > 999_999_999_999L) {
            throw new IllegalArgumentException();
        }

        String result = "";
        int scaleIndex = 0;

        while (number > 0) {
            int part = (int) (number % 1000);
            if (part != 0) {
                String partInWords = convertThreeDigits(part);
                String scale = scales[scaleIndex];
                
                // Склеиваем результат
                String spaceBeforeResult = result.isEmpty() ? "" : " " + result;
                String spaceBeforeScale = scale.isEmpty() ? "" : " " + scale;
                result = partInWords + spaceBeforeScale + spaceBeforeResult;
            }
            
            number /= 1000;
            scaleIndex++;
        }

        return result.trim();
    }
    private String convertThreeDigits(int n) {
        if (n == 0) return ""; 
        if (n < 20) return units[n];
        if (n < 100) return tens[n / 10] + (n % 10 != 0 ? "-" + units[n % 10] : "");
        
        return units[n / 100] + " hundred" + (n % 100 != 0 ? " " + convertThreeDigits(n % 100) : "");
    }
}