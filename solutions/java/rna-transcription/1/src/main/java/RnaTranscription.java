class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dnaStrand.toCharArray()){
            rna.append (switch (nucleotide){
                case 'G' -> 'C';
                case 'C' -> 'G';
                case 'T' -> 'A';
                case 'A' -> 'U';
                default -> throw new IllegalArgumentException("Invalid nucleotide");
            });
        }
        return rna.toString();
    }
}
