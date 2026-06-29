public class Hamming {
    private final int hammingDistance;
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.hammingDistance = calculateDistance(leftStrand, rightStrand);
    }

    public int getHammingDistance() {
        return this.hammingDistance;
    }
    private int calculateDistance(String left, String right){
        int distance = 0;
        for (int i = 0; i < left.length(); i++){
            if (left.charAt(i) != right.charAt(i)){
                distance++;
            }
        }
        return distance;
    }
}
