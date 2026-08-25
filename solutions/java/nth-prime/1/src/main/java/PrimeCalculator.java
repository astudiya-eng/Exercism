class PrimeCalculator {

    int nth(int nth) {
        int currentPrimeNumber = 0;
        int count = 1;
        int currentNumber = 3;
        if (nth <= 0) throw new IllegalArgumentException();
        if (nth == 1) return 2;
        while (count != nth) {
            boolean flag = true;
            for (int i = 3; i * i  <= currentNumber; i += 2){
                if(currentNumber % i == 0){
                     flag = false;
                     break;
                    }
            }
            if(flag){
                currentPrimeNumber = currentNumber;
                count++;
            }
            currentNumber += 2;
        }
        return currentPrimeNumber;
    }

}
