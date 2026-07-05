public class EliudsEggs {
    public int eggCount(int number) {
        int egsCount = 0;
        while (number != 0){
            if (number % 2 == 1) egsCount++;
            number /= 2;
        }
        return egsCount;
    }
}
