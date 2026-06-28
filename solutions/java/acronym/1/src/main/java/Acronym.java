import java.util.List;
import java.util.Arrays;

class Acronym {
    private final List<String> words;

    Acronym(String phrase) {
        String cleanPhrase = phrase.replaceAll("[^a-zA-Z -]", "");
        this.words = Arrays.asList(cleanPhrase.split("[ -]+"));
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        for (String word : words){
            if (!word.isEmpty()){
                char firstChar = word.charAt(0);
                acronym.append(Character.toUpperCase(firstChar));
            }
        }
        return acronym.toString();
    }

}
