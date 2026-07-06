import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();

        int i = 0;
        while (i < rnaSequence.length()) {
            if (i + 3 > rnaSequence.length()) {
                throw new IllegalArgumentException("Invalid codon");
            }
            String codon = rnaSequence.substring(i, i + 3);
            switch (codon) {
                case "AUG" -> proteins.add("Methionine");
                case "UUU", "UUC" -> proteins.add("Phenylalanine");
                case "UUA", "UUG" -> proteins.add("Leucine");
                case "UCU", "UCC", "UCA", "UCG" -> proteins.add("Serine");
                case "UAU", "UAC" -> proteins.add("Tyrosine");
                case "UGU", "UGC" -> proteins.add("Cysteine");
                case "UGG" -> proteins.add("Tryptophan");
                case "UAA", "UAG", "UGA" -> {
                    return proteins;
                }
                default -> throw new IllegalArgumentException("Invalid codon");
            }
            i += 3;
        }
         return proteins;
    }
}