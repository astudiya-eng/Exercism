class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sentence = new StringBuilder();
        boolean nextUpper = false;
        for (char ch: identifier.toCharArray()){
            ch = switch (ch) {
            case '4' -> 'a';
            case '3' -> 'e';
            case '0' -> 'o';
            case '1' -> 'l';
            case '7' -> 't';
            default -> ch; // Если это не цифра, оставляем как было
            };
            if (ch == ' '){
                sentence.append('_');
            }
            else if (ch == '-') {
            nextUpper = true; 
            } 
            else if (Character.isLetter(ch)) {
                if (nextUpper) {
                    sentence.append(Character.toUpperCase(ch));
                    nextUpper = false;
                } else {
                      sentence.append(ch);
                  }
           }
        }
        return sentence.toString();
    }
}
