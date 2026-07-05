public class EliudsEggs {
    public int eggCount(int number) {
        int egsCount = 0;
        while (number != 0){
            egsCount += (number & 1);
            number >>>= 1;
        }
        return egsCount;
    }
}
