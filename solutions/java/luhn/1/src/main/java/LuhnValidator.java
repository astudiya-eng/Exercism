class LuhnValidator {

    boolean isValid(String candidate) {
        if (candidate.matches(".*[^0-9\\s].*")) return false;
        String clean = candidate.replaceAll("\\s+", "");
        if (clean.length() <= 1) return false;
        int sum = 0;
        for (int i = clean.length() - 2; i >= 0; i -= 2){
            int currentDigit = (clean.charAt(i) - '0') * 2;
            sum += (currentDigit > 9) ? currentDigit - 9 : currentDigit;
        }
        for (int i = clean.length() - 1; i >= 0; i -= 2){
            sum += clean.charAt(i) - '0';
        }
        return sum % 10 == 0;
    }

}
