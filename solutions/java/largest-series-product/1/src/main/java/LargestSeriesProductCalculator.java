class LargestSeriesProductCalculator {
    private final String inputNumber;
    LargestSeriesProductCalculator(String inputNumber) {
        if (inputNumber == null){
            throw new IllegalArgumentException("String input must not be null.");
        }
        for (char c : inputNumber.toCharArray()){
            if (!Character.isDigit(c)){
                throw new IllegalArgumentException("String to search may only contain digits.");
            }
        }
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        long maxProduct = 0;
        if (numberOfDigits > inputNumber.length()){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if (numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must not be negative.");
        }
        if (numberOfDigits == 0){
            return 1;
        }
        for (int i = 0; (i + numberOfDigits -1) < inputNumber.length(); i++){
            long currentProduct = 1;
            String currentPartString = inputNumber.substring(i, i + numberOfDigits);
            for (char c : currentPartString.toCharArray()){
                currentProduct *= Character.getNumericValue(c);
            }
            if (currentProduct > maxProduct){
                maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }
}
