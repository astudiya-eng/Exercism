class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int length = String.valueOf(Math.abs(numberToCheck)).length();
        int resNumber = numberToCheck;
        long count = 0;
        while (resNumber > 0){
            count += Math.pow(resNumber % 10, length);
            resNumber /= 10;
        }
        return numberToCheck == count;
    }

}
