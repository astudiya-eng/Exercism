public class PangramChecker {

    public boolean isPangram(String input) {
        long uniqueLettersCount = input.toLowerCase()
            .chars()
            .filter(ch -> ch >='a' && ch <= 'z')
            .distinct()
            .count();
        return uniqueLettersCount == 26;  
    }
}
