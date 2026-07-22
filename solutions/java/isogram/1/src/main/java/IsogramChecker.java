class IsogramChecker {

    boolean isIsogram(String phrase) {
        String clean = phrase.toLowerCase().replace("-", "").replace(" ", "");
        return clean.chars().distinct().count() == clean.length();
    }
}
