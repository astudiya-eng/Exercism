class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        String clean = stringToVerify.replace("-", "");

        if (clean.length() != 10) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            char c = clean.charAt(i);
            int weight = 10 - i;
            int value;

            if (i < 9) {
                if (!Character.isDigit(c)) {
                    return false;
                }
                value = c - '0'; 
            } else {
                if (c == 'X') {
                    value = 10;
                } else if (Character.isDigit(c)) {
                    value = c - '0';
                } else {
                    return false;
                }
            }

            sum += value * weight;
        }

        return sum % 11 == 0;
    }
}
